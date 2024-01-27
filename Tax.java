package learnjava;
import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double rate,hours ,pay,tax,netpay;
		//pay = hours * rate
		String name;
		System.out.println("Enter your name = ");
		name = scanner.nextLine();
		System.out.println("Enter hours worked= ");
		hours = scanner.nextDouble();
		System.out.println("Enter rate/hr= ");
		rate = scanner.nextDouble();
		
		pay = rate * hours;
		if((pay >= 1) && (pay < 20000)) {
			tax = 0 ;
		}
		else if((pay >=20000)&&(pay <= 50000)) {
			tax = 0.1 * pay;
		}else if(pay > 50000) {
			tax = 0.2 * pay;
		}else {
			tax = 0;
		}
		netpay = tax + pay;
		System.out.println("NAME : "+name);
		System.out.println("Pay = "+pay);
		System.out.println("Tax due = "+tax);
		System.out.println("Netpay = "+netpay);

		scanner.close();
		
	}

}
