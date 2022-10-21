import java.util.*;

// Задание 2.1
public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> list = new HashMap<>();
        list.put("qwq", randomInt());
        list.put("qwqwq", randomInt());
        list.put("qwqer", randomInt());
        list.put("qwqtt", randomInt());
        list.put("qwquiu", randomInt());

        Map<String, Integer> list2 = new HashMap<>();
        list2.put("qwq", sumList(list.get("qwq")));
        list2.put("qwqwq", sumList(list.get("qwqwq")));
        list2.put("qwqer", sumList(list.get("qwqer")));
        list2.put("qwqtt", sumList(list.get("qwqtt")));
        list2.put("qwquiu", sumList(list.get("qwquiu")));

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

        System.out.println(list3.values());


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