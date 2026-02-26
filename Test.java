
public class Test {

	public static void main(String[] args) {
		Calculator c = new Calculator();

        double sum = c.addTwo(10, 30);
        System.out.println("Sum is: " + sum);

        double average = c.avgTwo(10, 30);
        System.out.println("Average is: " + average);

        c.discount(10,30);

	}

}
