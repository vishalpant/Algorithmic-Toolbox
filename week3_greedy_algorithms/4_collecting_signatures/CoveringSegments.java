import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.Arrays;



public class CoveringSegments {

    private static class Segment {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
	
	private static class SortBy implements Comparator<Segment>
	{
	public int compare(Segment a, Segment b)
		{
		return (int) (a.end - b.end);
		}
	}
	
	
	
	private static int[] optimalPoints(Segment[] segments) {
		Arrays.sort(segments, new SortBy());
		int last_time[] = new int[segments.length];
		int indexOfLastTime=0, size;
		last_time[0] = segments[0].end;
		for(int i=1;i<segments.length;i++)
			if (segments[i].start > last_time[indexOfLastTime])
			{
				last_time[++indexOfLastTime]=segments[i].end;
			}
				
        /*int[] points = new int[2 * segments.length];
        for (int i = 0; i < segments.length; i++) {
            points[2 * i] = segments[i].start;
            points[2 * i + 1] = segments[i].end;
        }*/
		for(size=0;size<last_time.length && last_time[size]!=0;size++);
		int[] points = new int[size];
		for(int i =0;i<size;i++)
			points[i]=last_time[i];
		
		return points;
    }

    
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        int[] points = optimalPoints(segments);
        System.out.println(points.length);
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}
 
