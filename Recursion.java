public class Recursion {
	public static void main(String[] args) {
    	System.out.println("O/P for successful method: " + sum(10));
		System.out.println("O/P for range of numbers: " + sum1(5, 10));
		recursionwithforloop();
    }
//recursion: sucessful method in industry    
	public static int sum(int k) {
		if(k>0) {
        	return k + sum(k-1);
		}
		else {
			return 0;
		}
	}
	
//recursion for range of numbers. (Still i didnt understand the logic)  
    static int sum1(int start, int end) {
        if(end > start) {
        	return end + sum1(start, end-1);           
        }
        else {
        	return end;
        }
    }

	static void recursionwithforloop() {
    	int sum2 = 0;
			for(int i=0; i <= 10; i++) {
        	sum2 += i; 
    	}
			System.out.println("O/P for recursionwithforloop: " + sum2);
    }
    
}       