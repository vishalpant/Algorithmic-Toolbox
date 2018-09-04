import java.util.*;

public class FibonacciPartialSum {
    private static long getFibonacciPartialSumNaive(long from, long to) {
        long sum = 0;

        long current = 0;
        long next  = 1;

        for (long i = 0; i <= to; ++i) {
            if (i >= from) {
                sum += current;
            }

            long new_current = next;
            next = next + current;
            current = new_current;
        }

        return sum % 10;
    }
	private static int getSum(int[] result, int from, int to)
	{
		int sum = 0;
		for(int i=from;i<to+1;i++)
			sum = (sum + result[i])%10;
		return sum;
	}
	private static long getFibSum(int from, int to){
		if ((from == 0 && to == 1)||(from ==0 && to ==0))
			
            return to;

        int[] result = new int[to + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < to + 1; i++) {
            result[i] = (result[i - 1] + result[i - 2]) % 10;
        }
		
		return getSum(result, from, to);
	}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSumNaive((int)(from%60), (int)(to%60)));
    }
}

