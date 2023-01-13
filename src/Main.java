import java.sql.SQLOutput;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        task1();

        System.out.println();

        task2();

        System.out.println();

        task3();

        System.out.println();

        task4();
    }
    public static void task1(){
        int p = 6;
        if (p % 2 == 0){
            System.out.println("Число четное");
        }else if (p == 0 || p % 2 ==1){
            System.out.println("Число не чётное");
        }else{
            System.out.println("Ввели что то не так!");
        }
    }
    public static void task2(){
        float p = 7.3f;
        float d = 11.3f;
        int number = 10;

        double nextNumberP = number - p;
        double nextNumberD = number - d;

        double nextNumberP1 = Math.abs(nextNumberP);
        double nextNumberD1 = Math.abs(nextNumberD);

        if(nextNumberP1<=nextNumberD1){
            System.out.println(p + " ближе к " + number);
        }else if (nextNumberP1>=nextNumberD1) {
            System.out.println(d + " ближе к " + number);
        }else{
            System.out.println("Ввели что то не так!");
        }
    }
    public static void task3(){
        int a = 3 + ThreadLocalRandom.current().nextInt(156);
        if (a >= 26 && a<=99){
            System.out.println(a);
        }else{
            System.out.println("число в дипазоне 26 и 99 нет");
        }
    }
    public static void task4(){
        int a = 100 + ThreadLocalRandom.current().nextInt(999);
        System.out.println(a);
        String str = Integer.toString(a);

        String b = String.valueOf(str.charAt(0));
        String c = String.valueOf(str.charAt(1));
        String d = String.valueOf(str.charAt(2));

        int num1 = Integer.parseInt(b);
        int num2 = Integer.parseInt(c);
        int num3 = Integer.parseInt(d);
        if (num1 > num2){
            if(num1 > num3) {
                System.out.println("Самое большое число " + num1);
            }
        }
        else if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("Самое большое число " + num2);
            }
        }
        else{
            System.out.println("Самое большое число " + num3);
        }
    }


}