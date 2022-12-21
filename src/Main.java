import java.time.LocalDate;

public class Main {
    private  final static int CURRENTYEAR = LocalDate.now().getYear();
    public static void main(String[] args) {
       printLeapOrNotLeapYear(2029);
       printVersionOS(2022, 1);
       printCalculateTimeDeLivery(20);

    }
    public static boolean isLeapYear (int year){
        return year % 4 ==0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printLeapOrNotLeapYear(int year){
        if (isLeapYear(year)){
            System.out.println(year + " - високосный год");
            return;
        }
        System.out.println(year + " - не високосный год");
    }
    public static boolean isNowYear(int year){
        return year == CURRENTYEAR;
    }
    public static String getVersionOS(int versionOS){
        if (versionOS == 0){
            return "IOS";
        } else if (versionOS == 1) {
            return "Android";
        }
        return "Мы не знаем такой операционной системы";
    }
    public static void printVersionOS(int year, int versionOS){
        if (isNowYear(year)){
            System.out.println("Установите полную версию для вашего " + getVersionOS(versionOS));
        } else {
            System.out.println("Установите облегченную версию для вашего " + getVersionOS(versionOS));
        }
    }
    public static  void printCalculateTimeDeLivery(int distance){
        if (distance > 0 && distance < 3000){
            System.out.println("Время доставки = " + ((distance + 19)/40 + 1));
            return;
        }
        System.out.println("Не осуществляется доставка");
    }
}