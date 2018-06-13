package framework;

public class Helper {

    public static String getRandomText() {
       
         int random = (int)(Math.random() * 50 + 1);
         String randomText = "category" + random;
         return randomText;
         
         
//         return "md" + (int)(Math.random() * 500+1);
                 
    }
    
   
    
}
