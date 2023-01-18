public class Main { 
         public static void main(String [] args){ 
                 Cars cars; 
                 Lamborghini lamborghini = new Lamborghini("Aventador.", 1, "V12-powered"); 
                 Ferrari ferrari = new Ferrari("296 GTB.", 1, "V8 engine"); 
                  
                 cars = lamborghini; 
                 System.out.println(cars.makesound() + " " + "My name is " + cars.getName()); 
                  
                 cars = ferrari; 
                 System.out.println(cars.makesound() + " " + "My name is " + cars.getName()); 
         } 
 } 
  
  
  


 public abstract class Cars{ 
         protected String name; 
         protected double weight; 
          
         public Cars (String name, double weight){ 
                 this.name = name; 
                 this.weight = weight; 
         } 
          
         public abstract String makesound(); 
          
         public String getName(){ 
                 return name; 
         } 
          
         public void setName (String name){ 
                 this.name = name; 
         } 
          
         public double getWeight(){ 
                 return weight; 
         } 
          
         public void setWeight(double weight){ 
                 this.weight = weight; 
         } 
 }
