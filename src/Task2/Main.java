package Task2;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        int k = 0;
        int[] arr = new int[8];

        do {
            arr[i] = k;
            i++;
            k = k + 3;

        }while (i < arr.length);

        for ( i = 0; i < arr.length; i++) {
              System.out.print(arr[i] + "  ");

        }
    }
}