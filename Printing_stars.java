public class Printing_stars {
	public static void main(String[] args) {
    star(5);
    star1(5);
    tree(5);
    }
    
    //printing stars in 5x5 matrix:
    static void star(int k) {
    	int a=0;
    	while(a<k) {
    		for(int i=0; i<k; i++) {
        	System.out.print("*");
        	}
         System.out.println();
         a++;
        }
    }
    
    //printing stars in half pyramid:
    static void star1(int k) {
    	for(int a=1; a<=k ; a++) {
    		for(int i=0; i<a; i++) {
        		System.out.print("*");
        	} 
         	System.out.println();
        }
    }
    
    //printing cristmas tree with stars:
    static void tree(int k) {
    	for(int a=1; a<=k ; a++) {
        	for(int i=(k-a); i>0; i--) {
            	System.out.print(" ");
            }
    		for(int i=0; i<2*a; i++) {
        		System.out.print("*");
        	} 
         	System.out.println();
        }
    }
    
}