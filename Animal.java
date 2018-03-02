public class Animal{

   //Attributer
   private String name;
   private String sound;
   private int x;
   private int y;
   
   //Constructor
   public Animal(String name, String sound, int x, int y){
   this.name = name;
   this.sound = sound;
   this.x = x;
   this.y = y;
   } 

   /*
   Metoder
   */
   
   // Set name
   public void setName(String name){
   this.name = name;
   }
   // Get name
   public String getName(){
      return name;
   }
   
   
   // Set sound
   public void setSound(String sound){
   this.sound = sound;
   }
   
   // Get sound
   public String getSound(){
   return sound;
   }
   
   // Set x
   public void setX(int x){
   this.x = x;
   }
   
   // Get x
   public int getX(){
   return x;
   }
   
   // Set y
   public void setY(int y){
   this.y = y;
   }
   

   // Get y
   public int getY(){
   return y;
   }

   /*
   Tell metode
   */
   public void tell(){
   System.out.println("I am the " + name + ", i am now standing on square " + "(" + x + ", " + y + ").");
   }
   
   /*
   Snake tell metode
   */
   public void tell2(){
   System.out.println("Game: The " + name + " stands on square (" + x + ", " + y + ")");
   }

      
}