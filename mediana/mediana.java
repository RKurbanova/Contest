import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int []a = {in.nextInt(), in.nextInt(), in.nextInt()};
    	boolean []res = {false, false, false};

		for(int i = 0; i < 2; i++){ 
			for(int j = i+1; j < 3; j++){ 
    			int []newA = Arrays.copyOf(a, a.length);
				newA[i] = newA[i] - newA[j];

    			Arrays.sort(newA);
            	for(int z = 0; z < 3; z++){
        			if(newA[1] == a[z] || i == z && newA[1] == a[i] - a[j]){
						res[z] = true;
                    }
    			}
     		}
		}
    
        for(int j = 0; j < 2; j++){
			for(int i = j+1; i < 3; i++){
    			int []newA = Arrays.copyOf(a, a.length);
				newA[i] = newA[i] - newA[j];

    			Arrays.sort(newA);
        		for(int z = 0; z < 3; z++){
        			if(newA[1] == a[z] || i == z && newA[1] == a[i] - a[j]){
						res[z] = true;
                    }
    			}
     		}
		}
    
    	int []newA = Arrays.copyOf(a, a.length);
    	Arrays.sort(newA);
    	for(int z = 0; z < 3; z++){
        	if(newA[1] == a[z]){
				res[z] = true;
        	}
    	}
    
    	for(int z = 0; z < 3; z++){
        	if(res[z]){
				System.out.println("YES");
            }else{
            	System.out.println("NO");
            }
    	}
    }
}
		