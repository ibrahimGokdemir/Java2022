import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

//		float accountBalance = 10000.00f;
//		 System.out.println("Operations using float:");
//		 System.out.println("1000 operations for 1.99");
//		 for(int i = 0; i<1000; i++){
//		 accountBalance -= 1.99f;
//		 }
//		 System.out.println(String.format("Account balance after float operations: %f",
//		accountBalance));
//
//		
//		 BigDecimal accountBalanceTwo = new BigDecimal("10000.00");
//		 System.out.println("Operations using BigDecimal:");
//		 System.out.println("1000 operations for 1.99");
//		 BigDecimal operation = new BigDecimal("1.99");
//		 for(int i = 0; i<1000; i++){
//		 accountBalanceTwo = accountBalanceTwo.subtract(operation);
//		 }
//		 System.out.println(String.format("Account balance after BigDecimal operations: %f",
//		accountBalanceTwo));
//		}
		
		BigDecimal aa = new BigDecimal("5");
		BigDecimal ba = new BigDecimal("7");
		//Equivalent to result = a + b
		BigDecimal result = aa.add(ba);
//		System.out.println(result);
		
		BigDecimal a = new BigDecimal("5.11");
		BigDecimal b = new BigDecimal("7.221");
		//Equivalent to result = a * b
		BigDecimal result2 = a.multiply(b);
//		System.out.println(result2);
		
		BigDecimal result3 = a.divide(b);
		System.out.println(result3);
		
		
}
}