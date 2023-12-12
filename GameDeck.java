import java.util.Arrays;
public class GameDeck{
	public static void main(String[] args){
	int[] blue=new int[10];
	int[] yellow=new int[10];
	int[] red=new int[10];
	int[] green=new int[10];

for(int i=0; i<10; i++){
	blue[i]=i+1;
	yellow[i]=i+1;
	red[i]=i+1;
	green[i]=i+1;
}
System.out.println( Arrays.toString(blue));
System.out.println( Arrays.toString(yellow));
System.out.println( Arrays.toString(red));
System.out.println( Arrays.toString(green));
}
}