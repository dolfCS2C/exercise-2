public class Ferrari extends Cars{ 
         private String model; 
          
         public Ferrari(String name, double weight, String model){ 
                 super(name, weight); 
                 this.model = model; 
         } 
  
         @Override 
         public String makesound() 
         { 
                 return "huum! huum!,"; 
         } 
          
         public String getModel(){ 
                 return model; 
         } 
          
         public void setModel(String model){ 
                 this.model = model; 
         } 
 } 
  
