import java.util.*;

public class FibonacciSumLastDigit {
    private static long getFibonacciSumNaive(long n) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;
        long sum      = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = (tmp_previous + current)%10;
            sum += current;
        }
	

        return sum % 10;
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
		for(int i =0; i <n+1 ;i++)
			System.out.print(result[i]+"\t");
        System.out.println();
		return result[n];
	}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
		int new_n = (int) n%60;
        long s = getFibSum(new_n);
        System.out.println(s);
    }
}

