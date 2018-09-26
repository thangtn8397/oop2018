package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(a==0) return b;
        else if( b==0 ) return a;
        else if( a==0 ) return b;
        else{
            a=Math.abs(a);
            b=Math.abs(b);
            while (a!=b){
                if(a<b){
                    b-=a;
                }
                else a-=b;
            }
            return a;
        }

    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n==0) return 0;
        else if ((n == 1) || (n == 2)) {
            return 1;
        }
        else {
            int arr[] = new int[n];
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr[n - 1];
        }
    }
}
