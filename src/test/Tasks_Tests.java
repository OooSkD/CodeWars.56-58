import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task56.DoubleLinear;
import task57.ProdFib;
import task58.Solution;

import static org.junit.jupiter.api.Assertions.*;

class Tasks_Tests {

    @Test
    public void DoubleLinear_test() {
        assertEquals(DoubleLinear.dblLinear(10), 22);
        assertEquals(DoubleLinear.dblLinear(20), 57);
        assertEquals(DoubleLinear.dblLinear(30), 91);
        assertEquals(DoubleLinear.dblLinear(50), 175);
    }

    @Test
    public void ProdFib_test1() {
        long[] r = new long[]{55, 89, 1};
        Assertions.assertArrayEquals(r, ProdFib.productFib(4895));
    }

    @Test
    public void ProdFib_test2() {
        long[] r = new long[]{89, 144, 0};
        assertArrayEquals(r, ProdFib.productFib(5895));
    }

    @Test
    public void Multiples_test() {
        assertEquals(23, new Solution().solution1(10));
        assertEquals(23, new Solution().solution2(10));
    }

}

