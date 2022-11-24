import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Введите переменную х");
        int x = num.nextInt();
        int xx = x;//xx - вспомогательная переменная, чтобы х возводился в степень корректно
        System.out.println("Введите переменную n");
        int n = num.nextInt();
        if ((n > 15) || (n < -15)) {
            System.out.println("Введите N промежутке от -15 до 15");
        }
        int count = 0;
        while (count < n-1) {
            x = x*xx; count+=1;
        }
        System.out.print("Получившееся число х = ");
        System.out.print(x);

    }}