package codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CG_ClosestToZeroTest {

    @Test
    public void testComputeClosestToZero() {
        int[] tab = {1, 2, 5, 3,8};
        Assertions.assertEquals(1, computeClosestToZero(tab));
    }
    @Test
    public void testComputeClosestToZeroWithNegatives() {
        int[] tab = {11, -3, 5, -2, 8};
        Assertions.assertEquals(-2, computeClosestToZero(tab));
    }

    @Test
    public void testComputeClosestToZeroWithOppositesAsClosest() {
        int[] tab = {-6, -2, 5, 2, 8};
        Assertions.assertEquals(2, computeClosestToZero(tab));

        int[] tab2 = {11, 3, 5, -3, 8};
        Assertions.assertEquals(3, computeClosestToZero(tab2));
    }

    public int computeClosestToZero(int[] tab) {
        int min = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (Math.abs(tab[i]) < Math.abs(min)) {
                min = tab[i];
            } else if (tab[i] + min == 0) {
                if (min < 0) {
                    min = tab[i];
                }
            }
        }

        return min;
    }

    @Test
    public void countX() {
//        Scanner in = new Scanner(System.in);
//        String x = in.nextLine();
//        String y = in.nextLine();
//        String text = in.nextLine();

        Assertions.assertEquals("1aaa", "aaaa".replace("a", "1"));

        System.out.println("Lonely X");
    }

    private int countXIn(String text, String x, String y) {
        int count = 0;
        String tmp = text;
        while (tmp.contains(x)) {
            tmp = tmp.replace(x, "");
            count++;
        }
        while (count > 0 &&
                (tmp.contains(x + y)
                        || tmp.contains(y + x))) {
//            tmp.replace()
        }

        return count;
    }


}
