package Task5;

public class Main {
    public static void main(String[] args) {

        int[] arr = {20, 5, 6, 8, 7, 4, 820, 4};
        int max = arr[1];
        int min = arr[1];

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max){
              max = arr[i];
            } if(arr[i] < min){
              min = arr[i];
            }
        }

        System.out.print("max = " + max + "  min = " + min);



    }
}
