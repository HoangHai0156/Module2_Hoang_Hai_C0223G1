package thuc_hanh_1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Hai",24);
        hashMap.put("Phat",20);
        hashMap.put("Minh",19);
        hashMap.put("Nhat",32);
        hashMap.put("Hoang",18);
        System.out.println("Show entries of map");
        System.out.println(hashMap);
        System.out.println("Nhat : "+hashMap.get("Nhat"));

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Show entries with ascending keys");
        System.out.println(treeMap);
        System.out.println("Nhat : "+treeMap.get("Nhat"));

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Hai",24);
        linkedHashMap.put("Phat",20);
        linkedHashMap.put("Minh",19);
        linkedHashMap.put("Nhat",32);
        linkedHashMap.put("Hoang",18);
        System.out.println("Nhat : "+linkedHashMap.get("Nhat"));
    }
}