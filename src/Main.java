public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int android = 0;
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (android == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int android = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if ( clientDeviceYear >= 2015 && clientOS == 0){
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear >= 2015 && android == 0){
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear < 2015 && android == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2020;
        System.out.println();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println("Год " + year + " является високосным");}
        else{
            System.out.println("Год " + year + " является високосным");}
    }

        public static void task4 () {
            System.out.println("Задача 4");
            int diliveryDistance = 95;
            int diliveryDays = 0;
            if (diliveryDistance <= 20) {
                diliveryDays = 1;
            } else if (diliveryDistance <= 60) {
                diliveryDays = 2;

            } else if (diliveryDistance <= 100) {
                diliveryDays = 3;

            } else {
                System.out.println("Доставка невозможна");
            }
            System.out.println("Потребуется дней " + diliveryDays);


        }

        public static void task5 () {
            System.out.println("Задача 5");
            int monthNumber = 12;
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Декабрь принадлежит к сезону зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Май принадлежит к сезону весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Август принадлежит к сезону лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Ноябрь принадлежит к сезону осень");
                    break;


            }
        }
    }


