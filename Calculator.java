public class Calculator {
	double addTwo(int n1,int n2) {
		double res=n1+n2;
		return res;
	}
	
	double avgTwo(int a,int b) {
		Calculator c1 =new Calculator();
				double r =c1.addTwo(a, b);
				double avg=r/2;
		return avg;
				
	}
	
	void discount(int n1,int n2) {
		Calculator c2=new Calculator();
		double avg= c2.avgTwo(n1, n2);
		double  per= (5/100)* avg;
		double discountprice=avg-per;
		System.out.println("discount is:" +discountprice);
		
	}

}