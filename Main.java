import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {10,20,11,4,5,14,7,18,1,19};
        BubbleSort bubble = new BubbleSort();
        array = bubble.sort(array);
        System.out.println(Arrays.toString(array));

        String text = "abxabcabcabyabxxyyabca";
        String pattern = "abcay";
        KMP kmp = new KMP();
        System.out.println(kmp.kmpSearch(text,pattern));

        BinarySearch bs = new BinarySearch();
        int ret = bs.binarySearch(array,0, array.length -1 , 7 );
        System.out.println(ret);
    }
}
