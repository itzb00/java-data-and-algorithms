package review;

import java.math.BigDecimal;

public class BigDecimalExample {
    public static void main(String[] args) {
        System.out.println(1.105 + 0.215);
        //this doesn't work --> long x = 123456789123456789;
        BigDecimal balance = new BigDecimal("123456789123456789");
        BigDecimal deposit = new BigDecimal("0.215");
        BigDecimal result = balance.add(deposit);
        System.out.println(result);
    }
}
