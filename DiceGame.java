import java.util.Random;

class DiceGame{
    public static void main(String args[]){
	Random rand = new Random();
	int saikoro1 = rand.nextInt(6) + 1;
	int saikoro2 = rand.nextInt(6) + 1;

	System.out.println("Rolling dice...");
	System.out.println("Die 1:"+ saikoro1);
	System.out.println("Die 2:"+ saikoro2);
	System.out.println("Total value:"+(saikoro1 + saikoro2));
	
	if((saikoro1+saikoro2)>7){
	System.out.println("You won");
	}else{
	System.out.println("You lost");
	}
    }
}
