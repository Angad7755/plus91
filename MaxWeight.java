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
































