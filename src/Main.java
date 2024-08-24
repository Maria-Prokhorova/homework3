public class Main {
    public static void main(String[] args) {

        //задача 1
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

        //Задача2:
        float l = 27.12F;
        long n = 987678965549L;
        float c = 2.786F;
        short m = 569;
        short i = -159;
        int f = 278978;
        byte h = 67;

        //задача 3
        System.out.println();
        System.out.println("Задача 3:");
        float numberStudentsLuda = 23;
        float numberStudentsAnna = 27;
        float numberStudentsKate = 30;
        float amoutPaper = 430;
        float oneStudentPaper;
        oneStudentPaper= amoutPaper/(numberStudentsAnna+numberStudentsKate+numberStudentsLuda);
        System.out.println("На каждого ученика рассчитано " + oneStudentPaper + " листов бумаги.");

        //задача 4
        System.out.println();
        System.out.println("Задача 4:");
        byte timeWorkMaсhine = 2;
        byte numberBottlesTwoMinutes = 16;
        int numberBottles;
        numberBottles = numberBottlesTwoMinutes * 20/timeWorkMaсhine;
        System.out.println("За 20 минут машина произвелам " + numberBottles + " штук бутылок.");
        numberBottles = numberBottlesTwoMinutes * 24*60/timeWorkMaсhine;
        System.out.println("За 1 сутки машина произвелам " + numberBottles + " штук бутылок.");
        numberBottles = numberBottlesTwoMinutes * 3*24*60/timeWorkMaсhine;
        System.out.println("За 3 дня машина произвелам " + numberBottles + " штук бутылок.");
        numberBottles = numberBottlesTwoMinutes * 31*24*60/timeWorkMaсhine;
        System.out.println("За 1 месяц машина произвелам " + numberBottles + " штук бутылок.");

        /*Задача 5
        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        На один класс уходит 2 банки белой и 4 банки коричневой краски.
        Сколько банок каждой краски было куплено?
        Выведите результат задачи в консоль в формате: «В школе, где … классов,
        нужно … банок белой краски и … банок коричневой краски».*/


    }
}