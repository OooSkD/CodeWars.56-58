package task58;

/*
DESCRIPTION:
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
    The sum of these multiples is 23.

    Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

    Note: If the number is a multiple of both 3 and 5, only count it once.
*/
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public int solution1(int number) {
        int sum = 3;
        for (int i = 4; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        return sum;
    }

    public int solution2(int number) {
        List<Integer> range = IntStream.range(1, number).boxed().collect(Collectors.toList());
        return  range.stream()
                .filter(n->n%3==0 || n%5==0)
                .collect(Collectors.summingInt(Integer::intValue));
    }
}
