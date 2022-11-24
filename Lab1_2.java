import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner date = new Scanner(System.in);
        System.out.println("Введите число");
        int day = date.nextInt();
        System.out.println("Введите месяц");
        int month = date.nextInt();
        if ((day>31)||(day<0)){System.out.println("Вы ввели некорректную дату. Введите число от 1 до 31"); System.exit(0)
        ;} //проверка на то что 31 день в месяце
        if (((1<=month) && (2>=month))||(month==12)){System.out.println("Время года - зима");}
        if ((3<=month) && (5>=month)){System.out.println("Время года - весна");}
        if ((6<=month) && (8>=month)){System.out.println("Время года - лето");}
        if ((9<=month) && (11>=month)){System.out.println("Время года - осень");}
        if (month>12) {System.out.println("Вы ввели некорректное число. Необходимо ввести целое число от 1 до 12");}//проверка на то что 12 месяцев в году





    }
}