public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача 1");
        byte b = 5;
        System.out.println("значение переменной b с типом byte равно 5");
        short s = 100;
        System.out.println("значение переменной s с типом short равно 100");
        int i = 700;
        System.out.println("значение переменной i с типом int равно 700");
     long l = 1000L;
        System.out.println(" значение переменной l с типом long равно 1000");
     float f = 45.78f;
        System.out.println(" значение переменной f с типом float равно 45.78");
     double d = 68.42;
        System.out.println(" значение переменной d с типом double равно 68.42");
        System.out.println("Задача 2");
        float f1 = 27.12f;
        long l1 = 987678965549L;
        double d1 = 2.786;
        short s1 = 569;
        short s2 = -159;
        short s3 = 27897;
        byte b1 = 67;
        System.out.println("Задача 3");
        byte ludmilaP = 23;
        byte annaS = 27;
        byte ekaterinaA = 30;
        short ollPapers = 480;
        int paperStudent = (ollPapers/(ludmilaP+annaS+ekaterinaA));
        System.out.println( " На каждого ученика расчитано " + paperStudent + " Листов бумаги " );
        System.out.println("Задача 4");
        System.out.println("Условия задачи");
        byte bottles = 16;
        byte timeMin = 2;
        byte timeMin2 = 20;
        byte timeHours = 24;
        byte timeDay = 3;
        short timeMonth = 1;
        System.out.println("Дополнительные данные");
        byte timeMinHours = 60;
        short timeHoursDay = 24;
        short timeMonthDay = 30;
        System.out.println("Решение задачи");
        int bottlesMin = bottles/timeMin;
        int minIn24Hours = timeMinHours*timeHours;
        int minIn3Day = minIn24Hours*timeDay;
        int minIn1Month = timeMonthDay*timeMinHours*timeHours;
        System.out.println(" За 1 мин машина произвела " + bottlesMin + " шт ");
        int bottles20Min = bottlesMin*timeMin2;
        System.out.println(" За 20 мин машина произвела " + bottles20Min + " шт " );
        int bottles24Hours = bottlesMin*minIn24Hours;
        System.out.println(" За 24 часа машина произвела " + bottles24Hours + " шт " );
        int bottles3Day = bottlesMin*minIn3Day;
        System.out.println(" За 3 дня машина произвела " + bottles3Day + " шт " );
        int bottles3Month = bottlesMin*minIn1Month;
        System.out.println(" За 1 месяц машина произвела " + bottles3Month + " шт " );


    }
}