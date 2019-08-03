import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {10,20,11,4,5,14,7,18,1,19};
        BubbleSort bubble = new BubbleSort();
        System.out.println(Arrays.toString(bubble.sort(array)));

    }
}
