package threepointthree;

public class DifferentBases 
{ 
    String name; 
  
    DifferentBases() 
    { 
        this(""); 
        System.out.println("No-argument constructor of" +  
                                           " base class"); 
    } 
  
    DifferentBases(String name) 
    { 
        this.name = name; 
        System.out.println("Calling parameterized constructor" 
                                              + " of base"); 
    } 
} 
  
