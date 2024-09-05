import java.util.*;
import java.io.*;

public class StaticRangeSum {
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

    static void buildTree(int[] arr, long[] segmentTree, int index, int start, int end) {
        if (start == end) {
            segmentTree[index] = arr[start];
            return;
        }

        int mid = (start + end) >> 1;
        buildTree(arr, segmentTree, index * 2, start, mid);
        buildTree(arr, segmentTree, index * 2 + 1, mid + 1, end);

        segmentTree[index] = segmentTree[index * 2] + segmentTree[index * 2 + 1];
    }

    static long search(int qStart, int qEnd, int s, int e, long[] segmentTree, int index) {
        if (qStart > e || qEnd < s) {
            return 0;
        } else if (s >= qStart && e <= qEnd) {
            return segmentTree[index];
        }

        int mid = (s + e) >> 1;
        long left = search(qStart, qEnd, s, mid, segmentTree, index * 2);
        long right = search(qStart, qEnd, mid + 1, e, segmentTree, index * 2 + 1);

        return left+right;
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

            long[] segmentTree = new long[4 * n];
            buildTree(arr, segmentTree, 1, 0, n - 1);

            while (q-- > 0) {
                int start = in.nextInt() - 1;
                int end = in.nextInt() - 1;

                long res = search(start, end, 0, n - 1, segmentTree, 1);
                out.println(res);
            }

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
