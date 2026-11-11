package jvm.internals;

import java.util.HashMap;

public class HashMapInternalsDemo {

    public static void main(String[] args) {
        // 1. HashMap Initialization (Key-Value Pair Store)
        HashMap<String, String> userCityMap = new HashMap<>();

        // 2. Data Insertion (.put method)
        userCityMap.put("Rajat", "Bhopal");
        userCityMap.put("Amit", "Indore");

        // 3. Data Retrieval (.get method)
        String rajatCity = userCityMap.get("Rajat");

        // 4. Output Verification
        System.out.println("--- HashMap Basic Demo ---");
        System.out.println("Rajat ki city hai: " + rajatCity);
        System.out.println("Map ka total size hai: " + userCityMap.size());
    }
}