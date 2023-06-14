public class ChefShopping {
      public static int maxWeightDiff(int[] weights) {
        Arrays.sort(weights); // 
        int cw = 0;
        int sw = 0;
           for (int i = weights.length - 1; i >= 0; i--) {
            if (cw <= sw) {
                cw += weights[i];
            } else {
                sw += weights[i];
            }
        }
        return Math.abs(cw - sw);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k= sc.nextint();
        int[] weights = {2,4,5,2,10};
        System.out.println(maxWeightDiff(weights)); 
    }
}























import java.util.Arrays;
import java.util.Scanner;

public class ChefShopping {
    public static int maxWeightDifference(int[] weights) {
        Arrays.sort(weights); 
        int chefWeight = 0;
        int sonWeight = 0;

        for (int i = weights.length - 1; i >= 0; i--) {
            if (chefWeight <= sonWeight) {
                chefWeight += weights[i];
            } else {
                sonWeight += weights[i];
            }
        }

        return Math.abs(chefWeight - sonWeight);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();
        
        int[] weights = new int[n];
        System.out.println("Enter the weights of the items:");
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }
        
        System.out.println("Maximum weight difference: " + maxWeightDifference(weights));
    }
}










