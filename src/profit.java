import java.util.Scanner;

public class profit {
    profit() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = s.nextInt();
        }
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;

        }
        System.out.println(minprice);
        System.out.println(maxprofit);
    }

    public static void main(String[] args) {
        new profit();
    }
    }



