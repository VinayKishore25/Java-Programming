import java.util.*;
class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        Queue<String> q = new LinkedList<>();
        int r = sc.nextInt();
        for(int i = 0 ; i < arr.length ; i++)
        {
            q.add(arr[i]);
        }
        while(r-->0)
        {
            String temp = q.poll();
            q.add(temp);
        }
        String res = "";
        while(!q.isEmpty())
        {
            res += q.poll() + " ";

        }
        System.out.println(res);
    }
}
