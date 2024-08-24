public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Задача 1:");
        int a = -158368;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 100;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short e = 30000;
        System.out.println("Значение переменной e с типом short равно " + e);
        long d = 45L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float q = 3.5F;
        System.out.println("Значение переменной q с типом float равно " + q);
        double z = -12.43;
        System.out.println("Значение переменной z с типом double равно " + z);
        System.out.println();

        //Задача2:
        float l = 27.12F;
        long n = 987678965549L;
        float c = 2.786F;
        short m = 569;
        short i = -159;
        int f = 278978;
        byte h = 67;

        System.out.println("Задача 3:");
        int numberStudentsLuda = 23;
        int numberStudentsAnna = 27;
        int numberStudentsKate = 30;
        int amoutPaper = 480;
        int oneStudentPaper;
        oneStudentPaper = amoutPaper / (numberStudentsAnna + numberStudentsKate + numberStudentsLuda);
        System.out.println("На каждого ученика рассчитано " + oneStudentPaper + " листов бумаги.");
        System.out.println();

        System.out.println("Задача 4:");
        int timeWorkMaсhine = 2;
        int numberBottlesTwoMinutes = 16;
        int numberBottles;
        numberBottles = numberBottlesTwoMinutes * 20 / timeWorkMaсhine;
        System.out.println("За 20 минут машина произвелам " + numberBottles + " штук бутылок.");
        numberBottles = numberBottlesTwoMinutes * 24 * 60 / timeWorkMaсhine;
        System.out.println("За 1 сутки машина произвелам " + numberBottles + " штук бутылок.");
        numberBottles = numberBottlesTwoMinutes * 3 * 24 * 60 / timeWorkMaсhine;
        System.out.println("За 3 дня машина произвелам " + numberBottles + " штук бутылок.");
        numberBottles = numberBottlesTwoMinutes * 31 * 24 * 60 / timeWorkMaсhine;
        System.out.println("За 1 месяц машина произвелам " + numberBottles + " штук бутылок.");
        System.out.println();

        System.out.println("Задача 5:");
        int totalPain = 120;
        int whiteBanks = 2;
        int brownBanks = 4;
        int totalClass = 120 / (whiteBanks + brownBanks);
        int totalWhiteBanks = totalClass * whiteBanks;
        int totalBrownBanks = totalClass * brownBanks;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhiteBanks +
                " банок белой краски и " + totalBrownBanks + " банок коричневой краски.");
        System.out.println();

        System.out.println("Задача 6:");
        int bananaWeight = 5 * 80;
        int milkWeight = 2 * 105;
        int iceCreamWeight = 2 * 100;
        int eggWeight = 4 * 70;
        int weightGr = bananaWeight + milkWeight + iceCreamWeight + eggWeight;
        float weightKg = (float) weightGr / 1000;
        System.out.println("Вес завтрака в гр. = " + weightGr);
        System.out.println("Вес завтрака в кг. = " + weightKg);
        System.out.println();

        System.out.println("Задача 7:");
        int loseWeight = 7 * 1000;
        int minWeight = 250;
        int maxWeight = 500;
        int minDays = loseWeight / minWeight;
        System.out.println("Если спортсмен будет терять в весе 250гр в день, для похудения ему потребуется " + minDays + " дней.");
        int maxDays = loseWeight / maxWeight;
        System.out.println("Если спортсмен будет терять в весе 500гр в день, для похудения ему потребуется " + maxDays + " дней.");
        int averageDays = (minDays + maxDays) / 2;
        System.out.println("Среднее коли-во дней для похудения " + averageDays);
        System.out.println();

        System.out.println("Задача 8:");
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKris = 76_230;
        int newSalaryMasha = salaryMasha + salaryMasha * 10 / 100;
        int newSalaryDenis = salaryDenis + salaryDenis * 10 / 100;
        int newSalaryKris = salaryKris + salaryKris * 10 / 100;
        int differenceSalaryMashaYear = (newSalaryMasha - salaryMasha) * 12;
        int differenceSalaryDenisYear = (newSalaryDenis - salaryDenis) * 12;
        int differenceSalaryKrisYear = (newSalaryKris - salaryKris) * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceSalaryMashaYear + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceSalaryDenisYear + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKris + " рублей. Годовой доход вырос на " + differenceSalaryKrisYear + " рублей.");

    }
}