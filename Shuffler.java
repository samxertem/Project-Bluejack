import java.util.Arrays;
import java.util.Random;

public class Shuffler {
    static Random rd = new Random(System.currentTimeMillis());

    public static void Shuffle(int[] cards) {
        int a = cards.length;

        for (int i = 0; i < cards.length; i++) {
            int temp = 0;
            int index = rd.nextInt(a);
            temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] testing = new int[10];

        for (int i = 0; i < testing.length; i++) {
            int randomValue = rd.nextInt(6) + 1;
            testing[i] = randomValue;
        }

        System.out.println(Arrays.toString(testing));
        Shuffle(testing);
        System.out.println(Arrays.toString(testing));
    }
}
