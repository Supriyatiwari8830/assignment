class Comp{
	public static void main(String args[]){
		long Princ= 115600000L;
		long loan = 50000000L;
		int years = 5;
		double rate= 10.75;
		double Amount = loan * ((1+rate/100)*(1+rate/100)*(1+rate/100)*(1+rate/100)*(1+rate/100));
		double CI= Amount-Princ;
		System.out.println("Compound Interest is:"+ CI);
	}
}