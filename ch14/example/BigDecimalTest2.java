package ch14.example;
import java.math.BigDecimal;
public class BigDecimalTest2 {

	public static void main(String[] args) {
		System.out.println(3.00-2.10);
		BigDecimal d1=new BigDecimal("3.00");
		BigDecimal d2=new BigDecimal("2.10");
		
		BigDecimal result = d1.subtract(d2);
		double d= result.doubleValue();
		System.out.println(result+" : "+d);
		
		result=d1.divide(d2,3,BigDecimal.ROUND_CEILING);
		System.out.println("³ª´« °á°ú : "+result);
	}

}
