import java.util.Scanner;
		public class ThreeSubjectMarks {
		public static void main(String[] args) {
		int s1,s2,s3,sum;
		try (Scanner sc = new Scanner(System.in)) {
			{
			System.out.println("enter the S1 marks:");
			s1=sc.nextInt();
			System.out.println("enter the S2 marks:");
			s2=sc.nextInt();
			System.out.println("enter the S3 marks:");
			s3=sc.nextInt();
			sum=s1+s2+s3;
			System.out.println("sum"+sum);
			if(sum>=60)
			{
			System.out.println("passed");
			}
			else if((s1+s2>=60)||(s3+s2>=60)||(s1+s3>=60))
			{
			System.out.println("promoted");
			}
			else
			{
			System.out.println("failed");
			}
			}
		}
		}
		}

