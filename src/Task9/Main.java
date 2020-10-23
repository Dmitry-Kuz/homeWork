package Task9;

public class Main {
    public static void main (String[] args){

        int[][] arr1 = {
                {1, 1, 1 },
                {1, 1, 1 },
                {1, 1, 1 },

        };
        int[][] arr2 = {
                {3, 2, 2, 2, 2, 2, 2, 3},
                {4, 1, 1, 1, 1, 2, 2, 2},
                {5, 1, 1, 1, 1, 2, 2, 2},
                {6, 1, 1, 1, 2, 1, 1, 2},
                {7, 1, 1, 2, 1, 1, 1, 2},
                {8, 2, 2, 1, 1, 1, 1, 2},
                {9, 2, 2, 1, 1, 1, 2, 2},
                {3, 2, 2, 2, 2, 2, 2, 3},
        };
        int i, j, m, n, k, i1, j1, r;
        i = j = m = n = k = i1 = j1 = r =0;

        int p = arr1.length * arr1[i].length;

        int[][] arrNew = new int[arr1.length][arr1[i].length];

        for(n = 0; n < arr2.length - arr1.length ; n++) {
            for(m = 0; m < arr2[i].length - arr1.length ; m++ ) {

                for (i = 0, i1 = n; i < arr1.length; i++, i1++) {
                    for (j = 0, j1 = m; j < arr1[i].length; j++, j1++) {
                        arrNew[i][j] = arr2[i1][j1];
                    }

                }

                for (i = 0; i < arrNew.length; i++) {
                    //System.out.println();
                    for (j = 0; j < arrNew[i].length; j++) {
                        if (arrNew[i][j] == arr1[i][j]) k++;
                        //System.out.print(arrNew[i][j] + "  ");
                    }

                }
                //System.out.println(k);
                if (k == p){
                    r++;
                }
                k = 0;
            }
        }

        if (r == 0) {
            System.out.println("Не является!");
        }else {
            System.out.println("Является! Совпадений найдено: " + r);
        }

    }
}
/**/