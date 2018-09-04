import java.util.Scanner;
import java.util.*;

public class FractionalKnapsack {
	
	private static class Sortbyratio implements Comparator<data>
{
    public int compare(data a, data b)
    {
		double r2 = (double)b.value/b.weight;
		double r1= (double)a.value/a.weight;
        return Double.compare(r2, r1);
    }
}
	private static class data {
		int weight;
		int value;
		
	}
	
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        //write your code here
		data datas [] = new data[values.length];
		for(int i =0;i<values.length;i++)
		{
			datas[i] = new data();
			datas[i].weight = weights[i];
			datas[i].value = values[i];
		}
		Arrays.sort(datas, new Sortbyratio());
		//for(int i=0;i<datas.length;i++)
		//	System.out.println(((double)datas[i].value/datas[i].weight)+"\t"+datas[i].value+"\t"+ datas[i].weight);
		for(int i=0; i<datas.length;i++)
		{
			if(capacity == 0)
				return value;
            int a = Math.min(capacity, datas[i].weight);
            value += a * (double) datas[i].value / datas[i].weight;
            datas[i].weight -= a;
            capacity -= a;
		}
		
        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
