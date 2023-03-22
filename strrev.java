public class Reverse   
{    
    public static void main(String[] args) {    
        String a = "Muneera";       
        String Str = "";       
        for(int i = a.length()-1; i >= 0; i--){    
            Str = Str + a.charAt(i);    
        }    
            
        System.out.println("Original string: " + a);       
        System.out.println("Reverse  str: " + Str);    
    }    
}    
