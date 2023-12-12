import java.util.Random;
import java.util.Arrays;

public class Dealer{
	public static void main(String[] args){
	int a=0;
	int[] arr= new int[10];
	Random r= new Random(System.currentTimeMillis());
	for(int i=0; i<arr.length;i++){
		a=r.nextInt(6)+1;
		arr[i]=a;
	}
	System.out.println(Arrays.toString(arr));
	int[] computerhand= new int[5];
	int[] playerhand= new int[5];
	
	for(int j=0; j<5; j++){
		computerhand[j]= arr[j];
		playerhand[j]= arr[10-(j+1)];
	}
	System.out.println( Arrays.toString(computerhand));
	System.out.println( Arrays.toString(playerhand));
}

// add the random generated special cards and study the game mantık again..


}