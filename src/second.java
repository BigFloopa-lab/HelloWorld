public class second {
    public static void main(String[] args) {
        //1 задание
        System.out.println("---1 задание---");
        byte clientOS = 1;
        if (clientOS ==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else{
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //2 задание
        System.out.println("---2 задание---");
        int clientDeviceYear = 2005;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        //3 задание
        System.out.println("---3 задание---");
        int year = 5232;
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");

        }
        //4 задание
        System.out.println("---4 задание---");
        int deliveryDistance = 95;
        var delyweryDay = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + delyweryDay);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            delyweryDay++;
            System.out.println("Потребуется дней " + delyweryDay);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            delyweryDay +=2;
            System.out.println("Потребуется дней " + delyweryDay);
        } else {
            System.out.println("Доставки нет");
        }

        //5 задание
        System.out.println("---5 задание---");
        byte monthNumber = 13;
        switch (monthNumber){
            case 12:
            case 2:
            case 1:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Ошибка: номер месяца должен быть от 1 до 12");
        }
    }
}

