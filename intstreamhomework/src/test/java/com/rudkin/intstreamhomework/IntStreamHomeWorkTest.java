package com.rudkin.intstreamhomework;

import com.rudkin.intsreamhomework.IntStreamHomeWork;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamHomeWorkTest {
    private static IntStreamHomeWork ishm;

    @BeforeAll
    static void createAndInitNewIntStreamHomeWork() {
        ishm = new IntStreamHomeWork(new int[10]);
        ishm.setIntStrArr(new int[]{1, 2, 3, 4, -500, -1, 0, 0, 0, 0});
    }

    @RepeatedTest(100)
    void shouldFillArrayWithRandomNumbersFromZeroToTenInclusiveTest() {
        int tempInt = Arrays.stream(ishm.getIntStrArr())
                .filter(x -> x > 10)
                .sum();
        Assertions.assertEquals(0, tempInt);
    }

    @Test
    @DisplayName("Should count greater than zero elements")
    void shouldCountGreaterThanZeroElementsTest() {
        long result = IntStreamHomeWork.countGreaterThanZeroElem(ishm.getIntStrArr());
        Assertions.assertEquals(4, result);
    }

    @Test
    @DisplayName("Should count elements equals to zero")
    void ShouldCountElementsEqualsToZeroTest() {
        long result = IntStreamHomeWork.countZeroElem(ishm.getIntStrArr());
        Assertions.assertEquals(4, result);
    }

    @Test
    @DisplayName("Should multiply elements of array by factor")
    void shouldMultiplyElemOfArrayByTwoTest() {
        int[] tempArray = IntStreamHomeWork.multiplyElem(ishm.getIntStrArr(), 2);
        int[] assumeResult = {2, 4, 6, 8, -1000, -2, 0, 0, 0, 0};
        Assertions.assertArrayEquals(assumeResult, tempArray);
    }

    @Test
    @DisplayName("Should count arithmetic mean of array")
    void shouldCountArithmeticMeanOfArrayTest() {
        double assumeResult = -49.1;
        double result = IntStreamHomeWork.averageElem(ishm.getIntStrArr());
        Assertions.assertEquals(assumeResult, result, 0.001);
    }

}