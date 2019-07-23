package app;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String operation;
        BigDecimal first;
        BigDecimal second;

        if (args.length == 0) {
            Scanner in = new Scanner(System.in);
            operation = in.next();
            first = in.nextBigDecimal();
            second = in.nextBigDecimal();
        } else {
            operation = args[0];
            first = new BigDecimal(args[1]);
            second = new BigDecimal(args[2]);
        }
        System.out.println(CalcFunctions.functionMap.get(operation).apply(first, second));
    }
}
