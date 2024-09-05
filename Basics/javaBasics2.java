import java.util.*;
public class javaBasics2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char[] arr = new char[5];
        // for(int i = 0 ; i < 5 ; i++)
        // {
        //     arr[i] = (char)('a' + 5 - i);
        // }
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        /*          int -- > Integer  
                    char --> Character
                    String --> String
                    double --> Double
                    float --> Float
                    long -->  Long
                    byte -->  Byte
        */ 
        // int n = sc.nextInt();
        // String s = Integer.toString(n,2);

        // String s = sc.next(); //"1010"
        // int n = Integer.parseInt(s,3); // base 3 
        // System.out.println(n);
        // sc.close();\
        // String s = sc.next();
        // StringBuilder sb = new StringBuilder(s);
        // sb.append(s);
        // System.out.println(sb);
        // Integer a = sc.nextInt();
        // System.out.println(a);
        

        //check the elements in the array
        /*time complexity
            O(10)/O(1) --> if else ,nrml code with no for loop  -- > for(int i = 0; i < 1 ; i++) 
            O(N) --> loop or something iterating n times --> for(int i = 0 ; i < n ; i++)
            O(log n) --> 1000 / 100 / 10 / 1 , 1000 / 10 / 5 / 1 , 1000 / 3 / 1
            O(N*N) --> n = 10 no. of iterations 100 --> for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n ;j++){

                }
            }
            O(N*N*N),O(N*N*N*N)....
            O(N log N)...   
            O(len(S))
            O(2*N) ---> recursion

            Space complexity 
            O(1) -- > single variable
            O(N) --> array of length n
            O(N*N) --> 2d array
            O(N*N*N),O(N*N*N*N)....
         */
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i = 0 ; i < n ; i++)
        // {
        //     arr[i] = i+1;
        // }
        // for(int i = 0 ; i < n ; i++)
        // {
        //     System.out.println(arr[i]);
        // }
        // int count = 0;
        // int n = sc.nextInt();
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = 0 ; j < n ; j++){}
        // }
        // for(int i = 0 ; i < 11 ; i++)
        // {
        //     for(int j = 0 ; j < n ; j++) count++;
        // }
        // System.out.println(count);

        // 2-D Array
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int[] arr = new int[n]; --> 1d to 2d
        /*  1 2 3
            4 5 6
            7 8 9
        */ 
        // int[][] arr = new int[n][m];
        // for(int i = 0 ; i < n ; i++)
        // {
        //     for(int j = 0 ; j < m ; j++)
        //     {
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println(Arrays.deepToString(arr));

        // for - each loop
        // String[] arr = new String[5];
        // for(int i = 0 ; i < 5 ; i++)
        // {
        //     arr[i] = sc.next();
        // }
        // for(String each : arr)
        // {
        //     System.out.println(each);
        // }

        // int[] arr = new int[5];
        // for(int i = 0 ; i < 5 ; i++)
        // {
        //     arr[i] = i;
        // }
        // for (int vinay : arr) {
        //     System.out.println(vinay);
        // }


        
        sc.close();
    }
}
    
