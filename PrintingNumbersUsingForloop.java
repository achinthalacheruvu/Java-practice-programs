public class PrintingNumbersUsingForloop {
	public static void main(String[] args) {
    	
		//printing 1 - 100 numbers:
		int i;
        System.out.println("Printing 1-100 numbers:");
        for(i=0; i<=99; i++) {
        	System.out.print(i + ",");  
        }
        System.out.print(i + "\n" + "\n");
        
        
        //printing even numbers between 1 - 100:
        int e;
        System.out.println("Printing 1-100 even numbers:");
        for(e = 2; e < 100; e += 2) {
        	System.out.print(e + ",");
        }    
        System.out.print(e + "\n" + "\n");
        
        //printing odd numbers between 1 - 100:
        int o;
        System.out.println("Printing 1-100 odd numbers:");
        for(o = 1; o < 99; o += 2) {
        	System.out.print(o + ",");
        }   
        System.out.print(o + "\n" + "\n");           
    }
}      