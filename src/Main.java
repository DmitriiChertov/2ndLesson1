public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1 ");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }  if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Задача №2 ");
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015 && clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
        else if (clientDeviceYear < 2015 && clientOS == 1 ) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке"); }
        if (clientDeviceYear >= 2015 && clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientDeviceYear < 2015 && clientOS == 0 ) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке"); }

        System.out.println("Задача №3");
        int year = 1968;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
            } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Задача №4");

        int deliveryDistant = 1000;
        int deliveryTime = (deliveryDistant / 40) + 1;
        if ( deliveryDistant <= 20) {
            System.out.println("доставка ожидается в течении суток");
        } else if (deliveryDistant > 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        System.out.println("Задача №5");

        int monthNumber = 12;
        if (monthNumber >= 13) {
            System.out.println("Такого месяца нет");
        }
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Это зимний месяц");
                break;
            case 3, 4, 5:
                System.out.println("Это весенний месяц");
                break;
            case 6, 7, 8:
                System.out.println("Это летний месяц");
                break;
            case 9, 10, 11:
                System.out.println("Это осенний месяц");
        }
        }


        }












