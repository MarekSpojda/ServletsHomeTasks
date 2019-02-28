package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {
    public static void main(String[] args) {
        displayFromMap(checkRand(10, 100));
    }

    public static Map<Integer, Integer> checkRand(int amount, int interval) {
        Map<Integer, Integer> randomMap = new HashMap<>();
        for (int i = 0; i < amount; i++) {
            randomMap.put(i, new Random().nextInt(interval));
        }
        return randomMap;
    }

    public static void displayFromMap(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}