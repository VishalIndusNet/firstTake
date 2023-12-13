import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(2);
            list.add(8);
            list.add(3);
            list.add(3);
            list.add(1);
            list.add(1);
            list.add(4);
            list.add(4);
            list.add(6);
            list.add(6);
            list.add(6);
            
          helper(list);
            
        System.out.println("Original List: " + list);
      
    }

    public static void helper(List<Integer> list) {

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        Collections.sort(list,(a, b)-> map.get(b) - map.get(a));
        
        
    }
}

