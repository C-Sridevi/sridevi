import java.util.Scanner;
public class CUILoginPage {public static void main(String[] args) {
try (Scanner input = new Scanner(System.in)) {
	String user,pass;
	System.out.println("enter your username: ");
	user=input.nextLine();
	System.out.println("enter your password");
	pass=input.nextLine();
	if(user.equals("abc") && (pass.equals("1234")))
	{
	System.out.println("welcome abc");
	}
	else
	{
	System.out.println("contact admin");
	}
}
}}