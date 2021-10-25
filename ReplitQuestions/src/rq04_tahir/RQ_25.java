package rq04_tahir;

public class RQ_25 {
  public static void main(String[] args) {
		
	    int rows = 5;

	    for(int i = rows; i > 0; --i) {
	    	
	      for(int space = 0; space < rows - i; space++) {
	        System.out.print("  ");
	      }

	      for(int j=0; j < 2 * i - 1; j++) {
	        System.out.print("* ");
	      }

	      System.out.println();
	    }
	    
	    System.out.println("Merhaba");
	  
	  }
}
