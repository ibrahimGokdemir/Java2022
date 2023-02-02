import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;

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
		BigDecimal ba = new BigDecimal("70");
		//Equivalent to result = a + b
//		BigDecimal result = aa.add(ba);
//		System.out.println(result);
		
//		BigDecimal a = new BigDecimal("5.11");
//		BigDecimal b = new BigDecimal("7.221");
		//Equivalent to result = a * b
//		BigDecimal result2 = a.multiply(b);
//		System.out.println(result2);
//		BigDecimal result3 = a.divide(b);
		
//		BigDecimal result4 = aa.pow(2);
		
//		System.out.println(BigDecimal.ZERO); // BigDecimal.ZERO  BigDecimal.TEN
		
//		BigDecimal objects are immutable
		
		
		long longValue = Long.MAX_VALUE;
		BigInteger valueFromLong = BigInteger.valueOf(longValue);
//		System.out.println(valueFromLong);
		
		BigInteger value1 = new BigInteger("5");
		BigInteger value2 = new BigInteger("10");
		BigInteger mul=value1.add(value2);
//		System.out.println();
		
		SecureRandom random = new SecureRandom();
		byte bytes[] = new byte[30];
		random.nextBytes(bytes);
		System.out.println(bytes[0]);
		
		
		
		
		
		
		
}
}