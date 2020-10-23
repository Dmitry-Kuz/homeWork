package Task6;

public class Main {

    public static void main (String[] args) {

        int[] arr = {2, 3, 2, 1, 2, 2, 11, 1};
        int sum1 = 0;
        int sum2 = 0;
        //int j = 0;
        int k = 0;
        //int i =0;

        for(k = 0; k < 8; k++) {

            for ( int i = k; i < arr.length; i++) {
                sum1 = sum1 + arr[i];
                sum2 = 0;
                for (int j = arr.length-1; j > k; j--) {
                    sum2 = sum2 + arr[j];

                }
                break;
            }
            if (sum1 == sum2) {
                System.out.println(true);
                break;
            }
        }
       /* for(int i = 0, j = 8; i < j ; i++, j--){
             sum1 = sum1 + arr[i];
             sum2 = sum2 + arr[j-1];
             if (sum1 == sum2){
             System.out.println(true);
             break;
             }

        }*/



    }
}
