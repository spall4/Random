//Name: Pallav Shah  Date: 6/30/15   Title : Polling
/*Description : Asks user from range (5-13) to rate of 5 issues and prints a table according to the rates and
                average points for each issue. It also prints out the most and the least rated issue and
                the total points they have.*/

package polling;

import java.util.*;

public class Polling {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        String topics[] = {"Global Warming", "Birth Abortion", "Nuclear weapons", "Genetic food", "Sea level rise"};
        int num = rand.nextInt(9) + 5;

        int a[][] = new int[5][10];
        int sum = 0, count = 0;
        int[] total = new int[5];
        double[] avg = new double[5];
        for (int i = 0; i < num; i++) {
            System.out.println("person : " + (i + 1));
            System.out.println("Rate these topics from 1(Least Important)- 10(Most Important)");

            for (int j = 0; j < topics.length; j++) {
                System.out.printf("%-16s", topics[j]);
                System.out.print(": ");
                int n = in.nextInt();
                a[j][n - 1]++;

            }

            System.out.println();
        }
        for (int i = 0; i < total.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j] * (j + 1);
                count += a[i][j];
            }
            total[i] = sum;
            sum = 0;
            avg[i] = (double) total[i] / count;
            count = 0;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%-16s", topics[i]);
            System.out.print(": ");
            for (int j = 0; j < a[i].length; j++) {

                System.out.printf(" %-3d", a[i][j]);

            }
            System.out.printf("    Average Rating: " + avg[i]);
            System.out.println();
        }
        System.out.println();
        int max = 0, min = 0;
        for (int i = 0; i < total.length; i++) {
            if (total[max] < total[i]) {
                max = i;
            }
            if (total[min] > total[i]) {
                min = i;
            }
        }
        System.out.println("Highest Rated Issue : " + topics[max] + "\t Total Points : " + total[max]);
        System.out.println("Lowest Rated Issue  : " + topics[min] + "\t Total Points : " + total[min]);
    }

}
