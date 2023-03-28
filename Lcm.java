class Lcm{
	public static void main(String args[]){
		int a=12;
		int b=20;
		int gcd=1;
		int min=(a>b)?b:a;
		for(int i=1; i<=min; i++){
			if(a%i==0 && b%i==0)
				gcd = i;
		}
		System.out.println("gcd is :"+gcd);
		int Lcm= (a*b)/gcd;
		System.out.println("Lcm is "+ Lcm);
		
		/*int LCM= (a>b)? a:b;
		while(true){
			for(LCM%a==0 && LCM%b==0){
				System.out.println("lcm is"+ LCM);
			break;}
			++LCM;
		}
	}*/
	}
	
}