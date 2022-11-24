import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner date = new Scanner(System.in);
        System.out.println("Введите число рождения");
        int birthday = date.nextInt();
        System.out.println("Введите месяц рождения");
        int birthmonth = date.nextInt();
        System.out.println("Введите год рождения");
        int birthyear = date.nextInt();
        if ((birthday>31)||(birthday<0)||(birthmonth>12)||(birthmonth<0)||(birthyear>2022)||((birthyear==2022)&&(birthmonth==11)&&(birthday>24)))
        {System.out.println("Вы ввели некорректную дату."); System.exit(0);}//проверка что пользователь уже родился и ввел корректную дату
        int daytoday=25;
        int monthtoday=11;
        int yeartoday=2022;
        int days=0;
        int months=0;
        int years=yeartoday-birthyear;
        if (daytoday>birthday) {days=daytoday-birthday;}
             else {days=31-birthday+daytoday;months=months-1;}//подсчет дней
        if (monthtoday>birthmonth) {months=months-birthmonth+monthtoday;}
             else {months=months+10-monthtoday+birthmonth;years=years-1;}//подсчет месяцев
        if (days==31) {days=0;}
        if (months==12) {months=0;}
        System.out.println(days);
        System.out.println(months);
        System.out.println(years);




    }}