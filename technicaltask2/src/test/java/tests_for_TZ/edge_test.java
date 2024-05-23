package tests_for_TZ;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class edge_test {

    @Test
    public void MinEdge() {
        int[] numbers = new int[]{Integer.MIN_VALUE, 1, Integer.MAX_VALUE};
        Assertions.assertEquals(Integer.MIN_VALUE, common.TZ._min(numbers));
    }

    @Test
    public void MaxEdge() {
        int[] numbers = new int[]{Integer.MIN_VALUE, 1, Integer.MAX_VALUE};
        Assertions.assertEquals(Integer.MAX_VALUE, common.TZ._max(numbers));
    }

    @Test
    public void SumEdge() {
        int[] numbers = new int[]{Integer.MIN_VALUE, 1, Integer.MAX_VALUE};
        Assertions.assertEquals(0L, common.TZ._sum(numbers));
    }

    @Test
    public void MultEdge() {
        int[] numbers = new int[]{Integer.MIN_VALUE, 1, Integer.MAX_VALUE};
        Assertions.assertEquals(-4611686016279904256L, common.TZ._mult(numbers));
    }
}
