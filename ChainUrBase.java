package threepointthree;

public class ChainUrBase {
	 
		ChainUrBase() 
	    { 

	        this(5); 
	        System.out.println("The Default constructor"); 
	    } 
		ChainUrBase(int x) 
	    { 
			this(5, 15); 
	        System.out.println(x); 
	    } 
	  

		ChainUrBase(int x, int y) 
	    { 
	        System.out.println(x * y); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        new ChainUrBase(); 
	    } 
	}

