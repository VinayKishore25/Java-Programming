import java.util.*;
class sumOfOnesAndTensDigit {
    public static int getNum(int n)
    {
        int count = 0 ; 
        int sum = 0;
        while(n > 0 && count < 2)
        {
            count++;
            int r = n%10;
            sum+=r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
            int sum = getNum(arr[i]);
            res[i] = sum+arr[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
