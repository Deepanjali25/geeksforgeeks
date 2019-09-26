package GeeksForGeeks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
class MostFreq {
    public static void main(String[] args) {
        int[] arr = {7, 10, 11, 5, 2, 5, 5, 5, 5, 7, 11, 8, 8, 8, 9, 12, 12};
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer> ();
        for (int i = 0; i < arr.length; i++) {
            Integer k = new Integer(arr[i]);
            if (map.containsKey(k)) {
                Integer valCount = map.get(k);
                valCount = valCount + 1;
                map.put(k, valCount);
            }
            else {
                map.put(k, new Integer(1));
            }
        }
        Map smap = sortHashMapByValues(map);
        // Get an iterator
        Set set = smap.entrySet();
        Iterator i = set.iterator();
        // Display elements
        int count = 0;
        while (i.hasNext()) {
            if (count < 4) {
                count++;
                Map.Entry me = (Map.Entry) i.next();
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
            }
            else {
                break;
            }
        }
    }
    public static LinkedHashMap <Integer, Integer>
    sortHashMapByValues(HashMap <Integer, Integer> passedMap) {
        List <Integer> mapKeys = new ArrayList < > (passedMap.keySet());
        List <Integer> mapValues = new ArrayList < > (passedMap.values());
        Comparator <Integer> comparator = Collections.reverseOrder();
        Collections.sort(mapValues, comparator);
        Collections.sort(mapKeys, comparator);
        LinkedHashMap <Integer, Integer> sortedMap = new LinkedHashMap < > ();
        Iterator < Integer > valueIt = mapValues.iterator();
        while (valueIt.hasNext()) {
            Integer val = valueIt.next();
            Iterator <Integer> keyIt = mapKeys.iterator();
            while (keyIt.hasNext()) {
                Integer key = keyIt.next();
                Integer comp1 = passedMap.get(key);
                Integer comp2 = val;
                if (comp1 == comp2) {
                    keyIt.remove();
                    sortedMap.put(key, val);
                    break;
                }
            }
        }
        return sortedMap;
    }
}