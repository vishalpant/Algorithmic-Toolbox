import java.util.*;
import java.lang.*;

class ExtNumber {
	int originalValue;
	long modifiedValue;
	ExtNumber(String value, int n)
	{
		originalValue = Integer.parseInt(value);
		StringBuilder sb = new StringBuilder(value); 
        StringBuilder ans = new StringBuilder();
		while (ans.length() <= n+1) {
			ans.append(sb);
		}
		modifiedValue = Long.parseLong(ans.toString().substring(0, n +1));
		
	}
	
}

class sort implements Comparator<ExtNumber>
{
	public int compare(ExtNumber a, ExtNumber b)
	{
		return Long.compare(b.modifiedValue, a.modifiedValue);
	}
}

public class LargestNumber {
    private static String largestNumber(String[] a) {
        //write your code here
		ArrayList<Integer> a_new = new ArrayList<Integer>();
		for(String str: a)
		{
			a_new.add(Integer.parseInt(str));
		}
		int n = Collections.max(a_new).toString().length();
		
		ExtNumber extnumber[] = new ExtNumber[a.length];
		for(int i =0;i<a.length;i++)
			extnumber[i] = new ExtNumber(a[i], n);
        String result = "";
		Arrays.sort(extnumber, new sort()); 
		//for(ExtNumber data : extnumber)
		//	System.out.println(Long.toString(data.modifiedValue)+"\t"+Integer.toString(data.originalValue));
        for (int i = 0; i < extnumber.length; i++) {
            result += extnumber[i].originalValue;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
        System.out.println(largestNumber(a));
    }
}

