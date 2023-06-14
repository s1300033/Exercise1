import java.util.Random;
import java.util.Scanner;

class DiceGame{
    public static void main(String args[]){
	System.out.println("Whata is your name?");
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	System.out.pritln("Hello,"+str+"!");
	    
	Random rand = new Random();
	int saikoro1 = rand.nextInt(6) + 1;
	int saikoro2 = rand.nextInt(6) + 1;

	System.out.println("Rolling dice...");
	System.out.println("Die 1:"+ saikoro1);
	System.out.println("Die 2:"+ saikoro2);
      
	System.out.println("Total value:"+(saikoro1 + saikoro2));	
	
	if((saikoro1+saikoro2)>7){
	System.out.println(str+" won");
	}else{
	System.out.println(str+"lost");
	}
    }
}
