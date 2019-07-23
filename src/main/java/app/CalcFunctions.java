package app;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class CalcFunctions {

    static Map<String, BiFunction<BigDecimal, BigDecimal, BigDecimal>> functionMap = new HashMap<>();

    static {

        functionMap.put("add", BigDecimal::add);
        functionMap.put("sub", BigDecimal::subtract);
        functionMap.put("mpy", BigDecimal::multiply);
        functionMap.put("div", BigDecimal::divide);

    }

}
