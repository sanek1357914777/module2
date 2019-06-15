import java.util.*;

public class Main {
    public static void main(String[] args) {
        String string = "beep beer boor";
//        ElementCounter.counter(string);
        char[] simbols = string.toCharArray();
        System.out.println(Arrays.toString(simbols));
        HashSet<Character> in = new HashSet<Character>();

        TreeMap<Integer, Character> map = new TreeMap<Integer, Character>();

        int k;
        int counter = 0;
        for (char simbol : simbols) {
            k = 1;
            for (int i = counter + 1; i < simbols.length - 1; i++) {
                if ((simbols[counter] - simbols[i] == 0) & !in.contains(simbols[counter])) {
                    k++;
                }
            }
            in.add(simbols[counter]);
//            map.put(k, simbols[counter]);
            counter++;
        }
        System.out.println(map);
        System.out.println(in);
    }

}
