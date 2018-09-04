import java.util.*;

public class LCM {
  private static long lcm_naive(int a, int b) {
    int r =0;
	int temp1 = a, temp2 =b;
	while(b!=0)
	{
		r = a%b;
		a=b;
		b=r;
		
	}

    return (long) temp1 * temp2 / a;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
