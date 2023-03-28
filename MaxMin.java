import java.util.Scanner;
class MaxMin{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		/*System.out.println("Enter first number");
		int n1= sc.nextInt();
		System.out.println("Enter second number");
		int n2= sc.nextInt();
		System.out.println("Enter first number");
		int n3= sc.nextInt();*/
		if(n1>n2 && n1>n3){
		System.out.println("Maximun number is:"+n1);
		}
		else if(n2>n3&& n2>n1){
		System.out.println("Maxium number is:"+n2);
		}
		else {System.out.println("Max number is:"+n3);}
		if(n1<n2 && n1<n3){
	    System.out.println("Minimum number is:"+ n1);
		}
		else if(n2<n1 && n2<n3){
				System.out.println("Minimum number is:"+ n2);
		}
		else{System.out.println("Minimum number is:"+ n3);}
	}
}