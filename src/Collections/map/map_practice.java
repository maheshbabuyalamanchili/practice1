package Collections.map;

import java.util.*;

public class map_practice {
    public static void main(String[] args) {
        //1.....creation of a map
        Hashtable<Integer, String> m = new Hashtable<>();

        //2.....addition of elements in to the map(put)
        m.put(500001, "hyderbad");
        m.put(500002, "chennai");
        m.put(500003, "delhi");
        System.out.println(m);

//        System.out.println();
//
//        //3.....reterival of keys from the map(keyset)
//        Set<Integer> keys = m.keySet();
//        for (Integer key : keys) {
//            System.out.println(key);
//
//        }
//
//        System.out.println();
//
//
//        //4.....reterival of values from the map(values)
//        Collection<String> values = m.values();
//        for (String value : values) {
//            System.out.println(value);
//
//        }
//
//        System.out.println();
//
//        //reterival of value from the map (get) by passing key
//        System.out.println(m.get(500001));
//        System.out.println(m.get(500002));
//
//        System.out.println(m);
//
//        //reterival of keys & values from the map
//        for (Integer key : keys) {
//            System.out.println(key + ">>>>>>" + m.get(key));
//
//        }
//
//        //5.....deletion of elements from the map(remove)passing key
//        //m.remove(500001);
//       // System.out.println(m);
//
//        //deletion of elements from the map(remove)passing key & value
//        //m.remove(500002,"chennai");
//        //System.out.println(m);
//
//        System.out.println();
//
//        //6.....verification of keys in the map(containskey)
//        System.out.println(m.containsKey(500001));   //true
//        System.out.println(m.containsKey(500004));   //false
//
//        System.out.println();
//
//        //verification of values in the map(containsvalue)
//        System.out.println(m.containsValue("hyderbad"));  //true
//        System.out.println(m.contains("kolkata"));        //false

        //8.....updation of elements in the map(put) pssing key & changing value
        m.put(500001,"kolkata");
        System.out.println(m);



    }
}

