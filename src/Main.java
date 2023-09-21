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
        }
        if (three > one && three > two) {
            System.out.println("Число " + three + " наибольшее среди трёх чисел.");
        }
    }
}