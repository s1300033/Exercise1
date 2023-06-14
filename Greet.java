import java.util.Scanner;

class Greet{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Whay is your name?");
String str = sc.next();
System.out.println("Hello,"+str+"!");
}
}
