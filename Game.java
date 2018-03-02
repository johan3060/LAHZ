public class Game{
   Animal snake = new Animal("evil snake", "Waahaahaa I'm going to eat you!", 7, 7);
   Animal rabbit = new Animal("nice rabbit", "Oh no, please don't eat me!", 1, 1);

   //Main metoden
   public static void main(String[] args){
   Game game = new Game();
   game.playTurn();
   game.endGame();
   } 

   //Metoden som kører én tur
   public void playTurn(){
   
      rabbit.tell();
      snake.tell();

      rabbit.setX(rabbit.getX() +1);
      
      snakeFollow();
      
      if (rabbit.getY() != snake.getY()-1 && rabbit.getX() != snake.getX()-1){

      playTurn();

      }
      else{
      rabbit.tell();
      snake.tell();
      
      System.out.println("");
      }
      
   } 

 
 
   //Metoden som får slangen til at følge kaninen
   public void snakeFollow(){
      if (rabbit.getX() > snake.getX()){
      snake.setX(snake.getX() + 1);
      }
      
      if (rabbit.getY() > snake.getY()){
      snake.setY(snake.getY() + 1);
      }
      
      if (rabbit.getY() < snake.getY()){
      snake.setY(snake.getY() - 1);
      }
      
      if (rabbit.getX() < snake.getX()){
      snake.setX(snake.getX() - 1);
      }
      System.out.println(""); 
   }
      
   //Metoden som kører når slangen og kaninen står ved siden af hinanden      
   public void endGame(){
   System.out.println("Nice rabbit: " + rabbit.getSound() + "\n");
   System.out.println("Evil snake: " + snake.getSound() + "\n");
   snake.setX(rabbit.getX());
   snake.setY(rabbit.getY());
   snake.tell2();
   System.out.println("");
   System.out.println("Game: The snake eats the rabbit.");
   }

 
         
   
}

