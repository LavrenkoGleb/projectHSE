package tests_for_TZ;

import org.junit.jupiter.api.Test;

public class speed_test {

    @Test
    public void testPerformanceMin() {
        int [] numbers = generateLargeArr(10000000);
        long startTime = System.currentTimeMillis();
        common.TZ._min(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println("Время функции _min: " + (endTime - startTime) + " ms");
    }

    @Test
    public void testPerformanceMax() {
        int [] numbers = generateLargeArr(10000000);
        long startTime = System.currentTimeMillis();
        common.TZ._max(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println("Время функции _max: " + (endTime - startTime) + " ms");
    }

    @Test
    public void testPerformanceSum() {
        int [] numbers = generateLargeArr(10000000);
        long startTime = System.currentTimeMillis();
        common.TZ._sum(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println("Время функции _sum: " + (endTime - startTime) + " ms");
    }

    @Test
    public void testPerformanceMult() {
        int [] numbers = generateLargeArr(1000000);
        long startTime = System.currentTimeMillis();
        common.TZ._mult(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println("Время функции _mult: " + (endTime - startTime) + " ms");
    }

    public int[] generateLargeArr(int size) {
        int [] LargeArr = new int [size];
        for (int i = 0; i < size; i++) {
            LargeArr[i] = i;
        }
        return LargeArr;
    }
}