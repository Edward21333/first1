import org.junit.jupiter.api.Test;

public class Mft {
    @Test
    public void firstTest() {
        System.out.println("hello, Corona");

        int sum = twoNumberNine(14, 88);
        System.out.println(sum);
        System.out.println(twoNumberNine(13, 37));
    }

    private int twoNumberNine(int a, int b) {
        int c = a + b;
        return c;
    }
}
