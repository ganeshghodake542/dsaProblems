package Array;

/**
 * countIntersectoin
 */
public class countIntersectoin {

    public static void main(String[] args) {

        int[][] intervals = {
                { 1, 2 },
                { 2, 3 },
                { 3, 4 }
        };


        int count = 0;

        for (int i = 0; i < intervals.length; i++) {

            for (int j = i + 1; j < intervals.length; j++) {

                int start = Math.max(intervals[i][0], intervals[j][0]);
                int end = Math.min(intervals[i][1], intervals[j][1]);

                if (start <= end) {
                    count++;
                }
            }
        } System.out.println(count);

    }
}