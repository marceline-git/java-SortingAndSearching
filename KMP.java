import java.util.Arrays;

public class KMP {
    public boolean kmpSearch(String text, String pattern) {
        int p1 = 0;
        int p2 = 0;
        int[] pArray = makePatternArray(pattern);
        System.out.println(Arrays.toString(pArray));
        while (p1 < text.length() -1) {
            System.out.println("p1: "+p1+" p2: "+p2);
            if (text.charAt(p1) == pattern.charAt(p2)) {
                p1++;
                p2++;
            } else {
                p2 = pArray[p2-1];
                if (text.charAt(p1) == pattern.charAt(p2)) {
                    p1++;
                    p2++;
                } else {
                    p1++;
                }
            }
        }
        System.out.println("return - p1: "+p1+" p2: "+p2);
        return pattern.length() == p2+1;

    }

    //iterative
    private int[] makePatternArray(String pattern) {
        int[] array = new int[pattern.length()];
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            if (pattern.charAt(i) != pattern.charAt(j)) {
                if (j == 0) {
                    array[i] = 0;
                } else {
                    while (j != 0) {
                        j = array[j-1];
                        if (pattern.charAt(i) == pattern.charAt(j)) {
                            array[i] = array[j] + 1;
                            break;
                        }
                    }
                }
            } else {
                array[i] = j + 1;
                j++;
            }
        }
        return array;
    }
}