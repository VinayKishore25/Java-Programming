import java.util.*;
class Creation{
    public static void CreateSegmentTree(int[] segmentTree,int[] a,int st,int end,int i){
        if(st == end) {
            segmentTree[i] = a[st];
            return;
        }
        int mid = (st+end)/2;
        CreateSegmentTree(segmentTree, a, st, mid, 2*i+1);
        CreateSegmentTree(segmentTree, a, mid+1, end, 2*i+2);
        segmentTree[i] = Math.min(segmentTree[2*i+1],segmentTree[2*i+2]);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] segmentTree = new int[4*n];

        for(int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
        }
        CreateSegmentTree(segmentTree, a, 0,n - 1,0);
        System.out.println(Arrays.toString(segmentTree));
        sc.close();
    }
}
