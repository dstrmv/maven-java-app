package app;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CalcFunctionsTest {

    @Test
    public void AddTest() {
        BigDecimal first = new BigDecimal("1000100010001000");
        BigDecimal second = new BigDecimal("2000200020002000");
        BigDecimal expectedResult = first.add(second);
        BigDecimal actualResult = CalcFunctions.functionMap.get("add").apply(first, second);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void SubTest() {
        BigDecimal first = new BigDecimal("1000100010001000");
        BigDecimal second = new BigDecimal("2000200020002000");
        BigDecimal expectedResult = first.subtract(second);
        BigDecimal actualResult = CalcFunctions.functionMap.get("sub").apply(first, second);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void MpyTest() {
        BigDecimal first = new BigDecimal("1000100010001000");
        BigDecimal second = new BigDecimal("2000200020002000");
        BigDecimal expectedResult = first.multiply(second);
        BigDecimal actualResult = CalcFunctions.functionMap.get("mpy").apply(first, second);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void DivTest() {
        BigDecimal first = new BigDecimal("1000100010001000");
        BigDecimal second = new BigDecimal("2000200020002000");
        BigDecimal expectedResult = first.divide(second);
        BigDecimal actualResult = CalcFunctions.functionMap.get("div").apply(first, second);
        assertEquals(expectedResult, actualResult);
    }
}