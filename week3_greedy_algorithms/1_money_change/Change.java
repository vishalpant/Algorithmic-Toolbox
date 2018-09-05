import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        //write your code here
		int coins = 0;
		if(m>=10)
		{
			coins+=m/10;
			m%=10;
		}
		if(m>=5)
		{
			coins+=m/5;
			m%=5;
		}
		if(m>=1)
		{
			coins+=m;
			
		}
        return coins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

