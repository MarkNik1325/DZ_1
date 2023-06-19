import java.util.Calendar;
import java.util.Scanner;
public class ex_3 {
    public static void main(String[] args) {
    System.out.println("Введите имя!");
    Scanner scaner = new Scanner(System.in);
    String name = scaner.next();
    if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
                 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
             System.out.println("Доброе утро, " + name + "!");
         } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
                 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
             System.out.println("Добрый день, " + name + "!");
         } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
                 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
             System.out.println("Добрый вечер, " + name + "!");
         } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
                 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
             System.out.println("Доброй ночи, " + name + "!");
         }
        System.out.print("Время ");
        System.out.print("сейчас: ");
      System.out.print(Calendar.getInstance().get(Calendar.HOUR_OF_DAY) + ":");
      System.out.print(Calendar.getInstance().get(Calendar.MINUTE) + ":");
    }
   
}
