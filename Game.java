public class Game{
    // kort kommentar tilføjet for at teste at versionstyring virker - Valentin
   //lav objekt - snake
   Animal snake = new Animal("Snake", "Waahaahaa I'm going to eat you!", 10, 10);
   //ny kommentar - johan
   
   //lav objekt - rabbit
   Animal rabbit = new Animal("Rabbit", "Oh no, please don't eat me!", 1, 1);
   
   private int hasLost = 0;
       

   public static void main(String[] args){
          Game game = new Game();
          game.playTurn();

   }
   
   public void checkOverlap(){
         if(snake.getX() == rabbit.getX() && snake.getY() == rabbit.getY()){
         System.out.println("The snake eats the rabbit.");
   }
}
   
   public void playTurn(){
         int rabbitX = rabbit.getX();
         rabbit.setX(rabbitX + 1);
         rabbit.tell();
         //snake moves toward rabbit
         snake.tell();
         //check adjacency                 
         checkOverlap();
         playTurn();
   }
   
}