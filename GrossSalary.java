class GrossSalary{
	
	public static void main (String args[]){
		double BP = 10000.8989009;
		double TA = 5600.6778;
		double DA = (0.14*BP);
		//System.out.println(DA);
		double PA = 7000.3443534546;
		double TD = (0.0176*DA); 
		double GS = (BP+TA+DA+PA-TD);
	
		System.out.println("basic pay:"+ BP);
		System.out.println("Total Allowance:"+ TA);
		System.out.println("Dearance Allowance:"+ DA);
		System.out.println("Petrol Allowance:"+ PA);
		System.out.println("Tax Dection:"+ TD);
		System.out.println("Grosssalary:"+ GS);
		
		
		
		
		
	}
}