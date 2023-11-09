import java.util.Scanner;

public class Sort {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Welcome to ORDER.net! Please enter the first integer here: ");
int a = in.nextInt();
System.out.print("Welcome to ORDER.net! Please enter the second integer here: ");
int b = in.nextInt();
System.out.print("Welcome to ORDER.net! Please enter the third integer here: ");
int c = in.nextInt();

if (a <= b && b <= c) {
System.out.println(""); 
}

if (a >= b) {    
System.out.print(b);
System.out.print(a);
System.out.println(c);
}
else {
System.out.print(a);
System.out.print(b);
System.out.println(c);
}
if (a >= c) {
System.out.print(c);
System.out.print(b);
System.out.println(a);
}
else {
System.out.print(a);
System.out.print(b);
System.out.println(c);
} 
if (b >= a) {
System.out.print(c);
System.out.print(a);
System.out.println(b);
}
else {
System.out.print(c);
System.out.print(b);
System.out.println(a);
}

}
}






