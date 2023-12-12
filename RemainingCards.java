import java.util.Random;
import java.util.Arrays;
public class RemainingCards{
			public static int Double(int d){
		d=d*2;
			return d;
		}
		 
		
	public static void main(String[] args){
	int Cards[]= new int[3];
	Random r= new Random(System.currentTimeMillis());
	for(int i=0; i<3; i++) {
		Cards[i]= r.nextInt(6)+1;
		int Sign= r.nextInt(100);
	
	if (Sign>49){Cards[i]=-1*Cards[i];}
	}
	
	System.out.println( Arrays.toString(Cards));
	
	int otherCards[]= new int[2];
	int randomValue= 0;
		int chance= r.nextInt(5);
		if( chance==4){
			otherCards[0]=-1;
		}else { randomValue=r.nextInt(6)+1;
			otherCards[0]=randomValue;
		}
		System.out.println(Arrays.toString(otherCards));
		
		int chance2=r.nextInt(5);
		if(chance2==4){
			otherCards[1]=2;
		}else { randomValue= r.nextInt(6)+1;
			otherCards[1]= randomValue;
		}
		
		System.out.println(Arrays.toString(otherCards));

			
}
	}

