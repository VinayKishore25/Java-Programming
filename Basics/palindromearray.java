/*package whatever //do not write package name here */

import java.util.*;
class palindromearray {
    static boolean[] vis = new boolean[1001];
    static boolean[] palin = new boolean[1001];
    static int[] ind = new int[1001];
    static String[] ans = new String[1001];
    public static void solve(String[] a,int idx,int i, int j)
    {
        if(idx >= a.length) return;
        if(vis[idx])
        {
            return;
        }
        if(ind[idx] != -1)
        {
            ans[i] = a[idx];
            vis[idx] = true;
            ans[j] = a[ind[idx]];
            vis[ind[idx]] = true;
            solve(a,idx+1,i+1,j-1); 
        }
        else{
            solve(a,idx+1,i,j);
        }
    }
    public static String code(String[] a,int n)
    {
        Arrays.fill(ind,-1);
        int[] ind = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            if(isPalin(a[i],a[i].length()))
            {
                palin[i] = true;
            }
            if(!palin[i])
            {
                ind[i] = reverse(a,a[i]);
            }
        }
        System.out.println("res:" + Arrays.toString(ind));
        solve(a,0,0,1000);
        String res = "";
        for(int i = 0 ; i < 1001 ; i++)
        {
            if(!ans[i].equals("puku"))
            res+=ans[i];
        }
        return res;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    String[] a = new String[n];
        Arrays.fill(ans,"puku");
	    for(int i = 0 ; i < n ; i++)
	    {
            a[i] = sc.next();
	    }
	    String res = code(a,n);
        System.out.println(ans[0] + ans[100]);
	    System.out.println(res);
	}
    public static boolean isPalin(String s,int n)
    {
        int i = 0 , j = n -1 ;
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public static int reverse(String[] a,String s)
    {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        int n = a.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i].equals(s))
            {
                return i;
            }
        }
        return -1;
    }
}