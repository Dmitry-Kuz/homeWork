package Task4;

public class Main {
    public static void main(String[] args) {

        int counter = 2;
        int[][] arr = new int[6][6];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j){
                    arr[i][j] =1;
                }else {
                    arr[i][j] = counter;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i + j == arr.length -1 ){
                    arr[i][j] =1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "  ");
            }

        }

    }


}
