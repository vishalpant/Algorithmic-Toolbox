import java.util.*;
import java.lang.Math;
public class FibonacciSumSquares {
    private static long getFibonacciSumSquaresNaive(long n) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;
        long sum      = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
            sum += current * current;
        }

        return sum % 10;
    }
	private static int getSum(int[] result, int to)
	{
		int sum = 0;
		for(int i=0;i<to+1;i++)
			sum = (int)((sum + Math.pow(result[i], 2))%10);
		return sum;
	}
	private static long getFibSum(int n){
		if (n <= 1)
            return n;

        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            result[i] = (result[i - 1] + result[i - 2]) % 10;
			
		}
		return getSum(result, n);
	}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibSum((int)(n%60));
        System.out.println(s);
    }
}

