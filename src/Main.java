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
        } else {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему ненужно ходить в дедский сад.");
        }
        if (ageHuman > 7 && ageHuman < 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу.");
        } else {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему ненужно ходить в школу.");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему ненужно ходить в университет.");
        }
        if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему неразрешено ходить на работу.");
        }

        short ageChild = 10;
        if (ageChild < 5 && ageChild < 14) {
            System.out.println("Если возраст равен " + ageChild + ", то ему нельзя кататься на атракионе.");
        } else {
            System.out.println("Если возраст равен " + ageChild + ", то ему можно кататься на атракционе в сопровождении взрослого.");
        }
        if (ageChild >= 14) {
            System.out.println("Если возраст равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        } else {
            System.out.println("Если возраст равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }

        short seats = 102;
        short seatsSedentary = 60;
        int seatsStanding = seats - seatsSedentary;
        int seatsStandingOccupied = 30;
        int seatsSedentaryOccupied = 60;
        if (seatsStandingOccupied < seatsStanding) {
            System.out.println("Если стоячих мест занято в вагоне " + seatsStandingOccupied + ", то в в вагоне есть свободные стоячие места.");
        } else {
            System.out.println("Если стоячих мест занято в вагоне " + seatsStandingOccupied + ", то в в вагоне нет свободных стоячих мест.");
        }
        if (seatsSedentaryOccupied < seatsSedentary) {
            System.out.println("Если сидячих мест занято в вагоне " + seatsSedentaryOccupied + ", то в в вагоне есть свободные сидячие места.");
        } else {
            System.out.println("Если сидячих мест занято в вагоне " + seatsSedentaryOccupied + ", то в в вагоне нет свободных сидячих мест.");
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
        if (clientOS == 1 && clientOS > 0) {
            System.out.println("Установите версию приложения для Android по ссылке.");
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
                if (clientDeviceYear < 2015) {
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
        if (deliveryDistance == 20) {
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
            case 1:
                System.out.println("Январь, зимний месяц.");
                break;
            case 2:
                System.out.println("Февраль, зимний месяц.");
                break;
            case 3:
                System.out.println("Март, весенний месяц.");
                break;
            case 4:
                System.out.println("Апрель, весенний месяц.");
                break;
            case 5:
                System.out.println("Май, весенний месяц.");
                break;
            case 6:
                System.out.println("Июнь, летний месяц.");
                break;
            case 7:
                System.out.println("Июль, летний месяц.");
                break;
            case 8:
                System.out.println("Август, летний месяц.");
                break;
            case 9:
                System.out.println("Сентябрь, осенний месяц.");
                break;
            case 10:
                System.out.println("Октябрь, осенний месяц.");
                break;
            case 11:
                System.out.println("Ноябрь, осенний месяц.");
                break;
            case 12:
                System.out.println("Декабрь, зимний месяц.");
                break;
            default:
                System.out.println("Такого месяца нет.");





        }



    }
}
