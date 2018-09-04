import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        int a = 0, b = 1, c=0;
		for(int i=0;i<n;i++)
		{
			c=(a+b)%10;
			a=b;
			b=c;
			
		}
		return a;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

