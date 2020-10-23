package Task8;

public class Main {
    public static void main(String[] args){

        int[] arr1 = {1, 2, 9, 5, 8, 7, 5, 4, 8};
        int[] arr2 = {1, 6, 5, 6, 8};
        int m = 0;
        int k = 0;
        int n =0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++){
                k = 0;
                if (arr1[i] == arr2[j]) {
                    break;
                }else{
                    k++;
                }
            }
            if ( k != 0) {
                n++;
            }
        }

        System.out.println(n);

        int[] arrNew = new int[n] ;
        for (int i = 0; i < arr1.length; i++) {
            k = 0;
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    k = 0;
                    break;
                }else{
                   k++;
                }
            }
            if(k !=0) {
                arrNew[m] = arr1[i];
                m++;
            }
        }

         for (int i = 0; i < arrNew.length; i++) {
             System.out.print(arrNew[i] + " ");
         }
    }
}
