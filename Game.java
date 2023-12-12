import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println( " Welcome to the Bluejack Game !");
		System.out.println( "|--------------------------------|");
		int Cards[]= new int[3];
		
	Random r= new Random(System.currentTimeMillis());
	for(int i=0; i<3; i++) {
		Cards[i]= r.nextInt(6)+1;
		int Sign= r.nextInt(100);
	
	if (Sign>49){Cards[i]=-1*Cards[i];}
	}
	

        String otherCards[] = new String[2];
        String db = "Doubler";

        int randomValue = 0;
        int chance = r.nextInt(5);
        if (chance == 4) {
            otherCards[0] = "+/-";
        } else {
            randomValue = r.nextInt(6) + 1;
            otherCards[0] = String.valueOf(randomValue);
        }
        

        int chance2 = r.nextInt(5);
        if (chance2 == 4) {
            otherCards[1] = db;
        } else {
            randomValue = r.nextInt(6) + 1;
            otherCards[1] = String.valueOf(randomValue);
        }
		System.out.print( " Your cards are: ");
		System.out.println(Arrays.toString(Cards)+Arrays.toString(otherCards));
		System.out.println("--------------------------------");
		System.out.println( " Select your move !");
		System.out.println( " 1.Draw  2.Stand");
		int select1=0;
		while(select1!=2){
			select1=sc.nextInt();
			if(select1==1){
				System.out.println(" Sorry I haven't code this part yet :(");
			}else if(select1==2){
					System.out.println( " Player chooses to stand, Computer's turn");
			}else{ 
				System.out.println( " Please enter a correct number !");
			}
			
		
		
		
		
		
		
	}
	
	
	
	
	}
}