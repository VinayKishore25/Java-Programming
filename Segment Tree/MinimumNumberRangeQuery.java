import java.util.*;
import java.io.*;

public class MinimumNumberRangeQuery {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    static void buildTree(int[] arr, int[] segmentTree, int index, int start, int end) {
        if (start == end) {
            segmentTree[index] = arr[start];
            return;
        }

        int mid = (start + end) >> 1;
        buildTree(arr, segmentTree, index * 2, start, mid);
        buildTree(arr, segmentTree, index * 2 + 1, mid + 1, end);

        segmentTree[index] = Math.min(segmentTree[index * 2], segmentTree[index * 2 + 1]);
    }

    static int search(int qStart, int qEnd, int s, int e, int[] segmentTree, int index) {
        if (qStart > e || qEnd < s) {
            return Integer.MAX_VALUE;
        } 
        else if (s >= qStart && e <= qEnd) {
            return segmentTree[index];
        }

        int mid = (s + e) >> 1;
        int left = search(qStart, qEnd, s, mid, segmentTree, index * 2);
        int right = search(qStart, qEnd, mid + 1, e, segmentTree, index * 2 + 1);

        return Math.min(left, right);
    }

    public static void main(String[] args) {
        try {
            FastReader in = new FastReader();
            FastWriter out = new FastWriter();

            int n = in.nextInt();
            int q = in.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int[] segmentTree = new int[4 * n];
            buildTree(arr, segmentTree, 1, 0, n - 1);

            while (q-- > 0) {
                int start = in.nextInt() - 1;
                int end = in.nextInt() - 1;

                int res = search(start, end, 0, n - 1, segmentTree, 1);
                out.println(res);
            }

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
