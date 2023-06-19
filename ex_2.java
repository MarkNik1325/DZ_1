public class ex_2 {
    public static void main(String[] args) {
        int x = 9;
        int [] [] array1 = new int [x] [x];
        Array_diagonal (array1);
        printDiagonal(array1);

        
    }

    private static void Array_diagonal (int [] [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0;  j < arr.length; j++) {
                for (int  k = arr.length; k > -2; k--) {
                    
                
                if (i == j | i == k) {
                    arr [i][j] = 9;
                }
                else {arr [i] [j] = 1;}
            }
            
        }
    }
}


    private static void printDiagonal (int [] [] arr)
    {
    for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.print("\b\b]");
            System.out.println();
        }
    }
}
