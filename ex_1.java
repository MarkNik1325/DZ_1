/**
 * ex_1
 */
public class ex_1 {
public static void main(String[] args) {
    int [] arr = {12, 123, 3, 12, 22, 321, 2, 421, 1, 0};
    int max = findMax(arr);
    int min = findMin(arr);
    System.out.printf("Максимальное число в массиве равно %s \n", Integer.toString(max));
    System.out.printf("Минимальное число в массиве равно %s", Integer.toString(min));
}
public static int findMax (int [] arr) 
{
    int max = arr [0];
    for (int i : arr)
    {if (i > max)
    {
        max = i; 
    }
}
    return max;
} 
  
public static int findMin (int [] arr)
{int min = arr [0];
    for (int i : arr)
    {
        if (i < min)
        {
            min = i;
        }
    }
    return min;
}
}