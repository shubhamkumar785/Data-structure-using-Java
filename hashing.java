
import java.util.*;

// public class hashing {
//     public static void main(String[] args) {
//         HashMap<String, String> emiMap = new HashMap<>();

//         // 1. - put the data
//         emiMap.put("123", "samsung");
//         emiMap.put("456", "iphone");
//         emiMap.put("789", "vivo");
//         emiMap.put("key", "oneplus");
//         emiMap.put("136", "realme");
//         System.out.println(emiMap);

//         // 2. - remove the data
//         emiMap.remove("136");
//         System.out.println(emiMap);

//         // 3. contains key
//         System.out.println("key contains ? " + emiMap.containsKey("456"));

//         // 4. - contains value
//         System.out.println("value contains ? " + emiMap.containsValue("iphone"));

//         // 5. - size
//         System.out.println("size " + emiMap.size());

//         // 5. - isEmpty()
//         System.out.println("Empty " + emiMap.isEmpty());

//         // 6. values() – Get all values
//         System.out.println("All value " + emiMap.values());

//         // 7. key() - get all key
//         System.out.println("All Key " + emiMap.keySet());

//         // 8. get() – Get value by key
//         System.out.println(emiMap.get("123"));

//         // 9. clear() - Remove all mappings from the map
//         emiMap.clear();
//         System.out.println(emiMap);
//     }
// }

public class hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> result = new HashMap<>();

        result.put("sram", 99);
        result.put("rohit", 84);
        result.put("rohan", 39);
        result.put("ruby", 44);
        result.put("rahul", 53);
        result.put("shekhar", 88);
        result.put("vishal", 81);
        result.put("sinu", 89);
        result.put("deepu", 59);
        result.put("deepak", 91);

        System.out.println("rahuk marks: " + result.get("rahul"));

        String topName = "";
        Integer topMarks = 0;

        for (String name : result.keySet()) {
            Integer marks = result.get(name);
            if (marks > topMarks) {
                topMarks = marks;
                topName = name;
            }
        }

        System.out.println("Topper is: " + topName + " with " + topMarks + " marks.");

    }
}