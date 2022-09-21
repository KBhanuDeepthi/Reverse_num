import java.util.Scanner;

class Reverse_num {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int rev=0;
		int rem;
		while(n!=0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println("Reversed Number is " +rev);

	}

}
