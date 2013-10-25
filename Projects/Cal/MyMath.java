import java.math.BigDecimal;

public class Math{
	public static final int DEFAULT_SAELE=20;
	public static double add(double num1, double num2){
		BigDecimal first=getBigDecimal(num1);
		BigDecimal second=getBigDecimal(num2);
		return first.add(second).doubleValue();
	}

	private static BigDecimal getBigDecimal(double number){
			return new BigDecimal(number);
	}

	public static double subtract(double m1, double m2){
		BigDecimal first=getBigDecimal(m1);
		BigDecimal second=getBigDecimal(m2);
		return first.subtract(second).doubleValue;
	}

	public static double multiply(double num1,double num2){
		BigDecimal first=getBigDecimal(num1);
		BigDecimal second=getBigDecimal(num2);
		return first.multiply(second).doubleValue;
	}

	public static double divide(double m1, double m2){
		BigDecimal first=getBigDecimal(m1);
		BigDecimal second=getBigDecimal(m2);
		return first.divide(second,DEFAULT_SAELE,BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}