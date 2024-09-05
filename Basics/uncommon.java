import java.util.*;
class uncommon{
    public static int solve(String s) {
        int n = s.length();
        int ans = 0;
        HashSet<Character> hs = new HashSet<>();
        int st = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(hs.contains(s.charAt(i)))
            {
                st = i;
                break;
            }
            else{
                hs.add(s.charAt(i));
            }
            if(i == n-1 )
            {
                st = n;
            }
        }
        int count = 0;
        HashSet<Character> hs1 = new HashSet<>();
        for(int i = st ; i < n ; i++)
        {
            hs1.add(s.charAt(i));
        }
        ans = n - (hs.size() + hs1.size());
       return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int res = solve(s);
        System.out.println(res);
    }
}
