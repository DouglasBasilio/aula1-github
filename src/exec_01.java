import java.util.Locale;

public class exec_01 {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Ofice desk";
		
		byte age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double mensure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1 );
		System.out.printf("%s, which price is $ %.2f%n%n", product2, price2 );
		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %f%n", mensure);		
		System.out.printf("Rouded (three decimal places) %.3f%n", mensure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", mensure);

	}

}
