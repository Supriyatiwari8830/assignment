import java.util.Scanner;
class MMT{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int Max=(n1>n2 && n1>n3)?n1:(n2>n3)?n2:n3;
		System.out.println("Maximum no is:"+Max);
		int Min=(n1<n2&&n1<n3)?n1:(n2<n3)?n2:n3;
		System.out.println("Minimum no is:"+Min);
		
	}
}