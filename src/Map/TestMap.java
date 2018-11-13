package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main (String[] args){
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap.toString() + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("Display entries in linkedHashMap: " + linkedHashMap);

        HashMap<Integer,String> hashMap1 = new HashMap<>();
        hashMap1.put(30,"Smith");
        hashMap1.put(33,"Smith");
        hashMap1.put(32,"Smith");
        hashMap1.put(35,"Smith");
        System.out.println("Display entries in hashMap: " + hashMap1.toString());

        Map<Character,Integer> abc = new HashMap<>();
    }
}