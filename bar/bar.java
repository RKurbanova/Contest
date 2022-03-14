// Example
//8 15
// \             /
// .|           |.
// .|           |.
// ..\         /..
// ...|       |...
// ...|       |...
// ....\     /....
// .....\___/.....
// 2
// gin 2 %
// tonic 4 *

import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int height = in.nextInt();
    	int width = in.nextInt();
    	in.nextLine();
    	char [][]glass = new char[height][width];
    	
    	for (int i = 0; i < height; i++) {
        	String str = in.nextLine();
        	glass[i] = str.toCharArray();
    	}
    	int drinks = in.nextInt();
    	in.nextLine();
    	int currentLayerIndex = height - 2;
    
    	for (int i = 0; i < drinks; i++) {
        	String str = in.nextLine();
        	String []parts = str.split(" ");
        	int layerAmount = Integer.parseInt(parts[1]);
        	for (int j = 0; j < layerAmount; j++) {
        		for (int z = 0; z < width; z++) {
                	if (glass[currentLayerIndex][z] == ' ') {
                    	glass[currentLayerIndex][z] = parts[2].charAt(0);
                	}
    			}
            	currentLayerIndex -= 1;
    		}
        }
    
    	for (int i = 0; i < height; i++) {
        	for (int j = 0; j < width; j++) {
            	System.out.print(glass[i][j]);
        	}
        	System.out.println();
        }
    }
}
		