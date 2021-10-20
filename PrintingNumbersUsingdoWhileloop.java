public class PrintingNumbersUsingdoWhileloop {
	public static void main(String[] args) {
	
		//printing 1-100 numbers:
    	int x = 1;
        System.out.println("Printing 1-100 numbers:");
    	do {
        	System.out.print(x + ",");
        	x++;
        }
        while(x < 100);
        System.out.print(x + "\n" + "\n");
        
                
        //printing 1-100 even numbers:
        int e1 = 2;
        System.out.println("Printing 1-100 even numbers:");
        do {
        	System.out.print(e1 + ",");
            e1 += 2;
        }
        while(e1 < 100);
        System.out.print(e1 + "\n" + "\n");
        
                
        //printing 1-100 odd numbers:
        int o1 = 1;
        System.out.println("Printing 1-100 odd numbers:");
        do {
        	System.out.print(o1 + ",");
            o1 += 2;
        }    
        while(o1 < 99);
        System.out.print(o1);
    }
}