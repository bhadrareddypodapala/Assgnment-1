import java.util.Scanner;
public class Min{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
            int min=9;
            int r;
		while(n!=0)
		{
		r=n%10;
            if(min>r)
            {
            min=r;
            }
             n=n/10;
		}
		System.out.println(min);
	}
}
