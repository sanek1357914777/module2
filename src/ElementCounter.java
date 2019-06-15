import java.util.*;

public class ElementCounter {

    static void counter(String string) {
        HashSet<Character> in = new HashSet<Character>();
        char[] simbols = string.toCharArray();
        System.out.println(Arrays.toString(simbols));
        int k = 0;
        int targetChar = 0;

        for (char simbol : simbols) {
            if (!in.contains(simbol)) {
                k = 1;
                for (int i = targetChar + 1; i < simbols.length; i++) {
                    if ((simbols[targetChar] - simbols[i] == 0)) {
                        k++;
                    }
                }
                System.out.println(k);
                in.add(simbol);
                targetChar++;
            }
            System.out.println(in);

        }
    }
}
