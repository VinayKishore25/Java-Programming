import java.util.*;

class javaCollections2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * 1 2 3 4 3 2 4 3 2 1 4 5 3 4 2 3 -- > 1000 -->  0 <= a[i] <= 1000
         * 1 - 2
         * 2 - 4
         * 3 - 5
         * 4 - 4
         * 5 - 1
         * a - b
         * b - a --> hm.get('b'); = a
         * arr -> len --> 1000  --> arr[a[i]]++
         */
        // int[] a = new int[]{1,2,3,4,3,2,4,3,2,1,4,5,3,4,2,3};
        // int[] arr = new int[1000];
        // for(int each : a)
        // {
        //     arr[each]++;
        // }
        // for(int i = 0 ; i < 10 ; i++)
        // {
        //     System.out.println(i + " --> "+ arr[i]);
        // }
        // HashMap<Integer,Integer> hm = new HashMap<>();
        // int count = 0;
        // for(int i = 0 ; i < a.length ; i++)
        // {
            // if(hm.containsKey(a[i]))
            // {
            //     hm.put(a[i],hm.get(a[i])+1);
            // }
            // // if(hm.containsKey(a[i]))
            // // {
            // //     int prevCount = hm.get(a[i]);
            // //     hm.put(a[i],prevCount+1);
            // // }
            // else
            // {
            //     hm.put(a[i],1);
            // }
            // hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        // }
        // hm.remove(5,1);
        // HashSet<Integer> hs = new HashSet<>(hm.keySet());
        // ArrayList<Integer> al = new ArrayList<>(hm.values());
        // System.out.println(hs);
        // System.out.println(al);
        // System.out.println(hm);


        // LinkedHashMap -- >
        // LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<>();

        // Interfaces
        // ArrayList<Integer> al = new ArrayList<Integer>();  --> 
        // List<Integer> al = new ArrayList<>();
        // Set<Integer> hs = new HashSet<>();
        // Map<Character,Integer> hm = new HashMap<>(); 


        // TreeMap --> key wise sorted map
        // TreeSet --> sorted hash set
        sc.close();
    }
}
