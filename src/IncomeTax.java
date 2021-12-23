import java.util.Scanner;
public class IncomeTax {
public static void main(String[] args) {
double t=0;
try (Scanner sc = new Scanner(System.in)) {
	System.out.println("enter income");
	double i=sc.nextDouble();
	t=incomeTax(i);
}
System.out.println("Income tax amount is" +t);
}
static double incomeTax(double i)
{
double tax;
if(i<=180000)
tax=0;
else if(i<=300000)
tax=0.1*(i-180000);
else if(i<=500000)
tax=(0.2*(i-300000))+10000;
else if(i<=1000000)
tax=(0.3*(i-500000))+50000;
else
tax=(0.4*(i-1000000))+200000;
return tax;
}
}
