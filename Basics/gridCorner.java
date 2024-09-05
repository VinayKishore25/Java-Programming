import java.util.*;
class gridCorner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++)
        b[i] = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        int ans = a[0] + b[n-1];
        int flag = 0;
        for(int i = 1 ; i < n ; i++)
        {
            int temp = a[i] + b[n-i-1];
            if(temp != ans)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        System.out.println("NO");
        else
        System.out.println("YES");
        sc.close();
    }
}
