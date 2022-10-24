import java.util.*;

// Задание 2.1
public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> list = new HashMap<>();
        List<String> words = new ArrayList<>(Arrays.asList("a b c d e f".split(" ")));
        for (int i = 0; i < 5; i++) {
            list.put(words.get(i), randomInt());
        }

        Map<String, Integer> list2 = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            list2.put(words.get(i), sumList(list.get(words.get(i))));
        }

        System.out.println(list2.values());

        // Задание 2.2

        Map<Integer, String> list3 = new LinkedHashMap<>();
        list3.put(1, "пе");
        list3.put(2, "ре");
        list3.put(3, "ст");
        list3.put(4, "ро");
        list3.put(5, "йк");
        list3.put(6, "а ");
        list3.put(7, "про");
        list3.put(8, "ве");
        list3.put(9, "р");
        list3.put(10, "ка");

        System.out.println(list3);




    }

    public static List<Integer> randomInt() {
        //        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int a = (int) Math.floor(Math.random() * (1000 + 1));
            list.add(a);
        }
        return list;
    }

    public static int sumList(List<Integer> list){
        int a =0;
        for (Integer integer : list) {
            a = a + integer;
        }
        return a;
    }
}