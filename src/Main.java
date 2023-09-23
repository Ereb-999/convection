public class Main {
    public static void main(String[] args) {
        short age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

        short tC = 6;
        if (tC <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        short speed = 100;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        short ageHuman = 30;
        if (ageHuman > 2 && ageHuman < 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в дедский сад.");
        }
        if (ageHuman > 7 && ageHuman < 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу.");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в университет.");
        }
        if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу.");
        }

        short ageChild = 10;
        if (ageChild < 5 && ageChild < 14) {
            System.out.println("Если возраст равен " + ageChild + ", то ему нельзя кататься на атракионе.");
        }
        if (ageChild >= 14) {
            System.out.println("Если возраст равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }


        short seats = 102;
        short seatsSedentary = 60;
        short place = 40;
        if (place <60) {
            System.out.println("Сидячих мест в вагоне " + (seatsSedentary - place) + ", а стоячих " + (seats - seatsSedentary));
        } else if (place >= 60 && place < 102) {
            System.out.println("Стоячих мест в вагоне: " + place);
        }else {
            System.out.println("Мест нет, жди следующий траснпорт!");
        }




        short one = 10;
        short two = 26;
        short three = 32;
        if (one > two && one > three) {
            System.out.println("Число " + one + " наибольшее среди трёх чисел.");
        }
        if (two > one && two > three) {
            System.out.println("Число " + two + " наибольшее среди трёх чисел.");
            if (three > one && three > two) {
                System.out.println("Число " + three + " наибольшее среди трёх чисел.");
            }
        } else {
            if (three > one && three > two) {
                System.out.println("Число " + three + " наибольшее среди трёх чисел.");
            }
        }

        short clientOS = 1;
        short clientDeviceYear = 2013;
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
                if (clientOS == 0 && clientDeviceYear > 2015 ) {
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                }
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
                if (clientOS== 0 && clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }

        short year = 2040;
        if ((year > 1584) && (year %4 == 0) && (year %100 != 0) && (year %400 == 0)) {
            System.out.println(year + " - год являеться високостным.");
        } else {
            System.out.println(year + " - год не являеться високостным.");
        }

        short deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуеться дней: " + 1);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуеться дней: " + 2);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуеться дней: " + 3);
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

        char monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний сезон.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний сезон.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний сезон.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний сезон.");
                break;
            default:
                System.out.println("Такого нет.");





        }



    }
}
