public class Animal{

   //Attributer
   private String name;
   private String sound;
   private int x;
   private int y;
   
   public Animal(String name, String sound, int x, int y){
       this.name = name;
       this.sound = sound;
       this.x = x;
       this.y = y;
   } 

   //Metoder
   
   // Name metode
   public void setName(String name){
         this.name = name;
   }
   
   public String getName(){
       return name;
   }
   
   
   // Sound metode
   public void setSound(String sound){
         this.sound = sound;
   }
   
   public String getSound(){
         return sound;
   }
   
   // x og y metode 
   public void setX(int x){
         this.x = x;
   }
   
   public void setY(int y){
         this.y = y;
   }
   
   public int getX(){
         return x;
   }
   
   public int getY(){
         return y;
   }

   
   public void tell(){
        System.out.println("I am the " + name + ", i am now standing on square " + "(" + x + ", " + y + ").");
   }
   

      
}