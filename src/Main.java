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
        System.out.println("Задача 5");
        System.out.println("Условия задачи");
        byte totalBoxPaints = 120;
        byte paintsWhite = 2;
        byte paintsBrown = 4;
        System.out.println("Решение задачи");
        int boxPaints1Class = paintsWhite+paintsBrown;
        int classesInSchool = totalBoxPaints/boxPaints1Class;
        int totalWhiteBoxesPaint = paintsWhite*classesInSchool;
        int totalBrownBoxesPaint = paintsBrown*classesInSchool;
        System.out.println(" В школе, где " + classesInSchool + " классов, нужно " + totalWhiteBoxesPaint+ " банок белой краски и " + totalBrownBoxesPaint + " банок коричневой краски ");
       System.out.println("Задача 6");
       System.out.println("Условия задачи");
       byte bananas = 5;
       byte weight1BananaGr = 80;
       short milk = 200;
       byte weight100MlMilk = 105;
       byte iceСream = 2;
       byte weight1IceCream = 100;
       byte eggs = 4;
       byte weight1Egg = 70;
       System.out.println("Решение задачи");
       int totalWeightBananas = bananas*weight1BananaGr;
       int totalWeightMilk = ((milk*weight100MlMilk)/100);
       int totalWeightIceCream = iceСream*weight1IceCream;
       int totalWeighEggs = eggs*weight1Egg;
       int breakfastWeightGr = totalWeightBananas+totalWeightMilk+totalWeightIceCream+totalWeighEggs;
       float breakfastWeightKg = breakfastWeightGr/1000f;
       System.out.println(" Вес спортивного завтрока в граммах " + breakfastWeightGr + " Гр " + " Вес спортивного завтрока в килограммах " + breakfastWeightKg + " Кг " );

        System.out.println(" Задача 7 ");
        System.out.println(" Условия задачи ");
        byte weightKg = 7;
        short weight1Gr = 250;
        short weight2Gr = 500;
        System.out.println(" Решение задачи ");
        short weight1KgToGr = 1000;
        int days1Weight = ((weightKg*weight1KgToGr)/weight1Gr);
        int days2Weight = ((weightKg*weight1KgToGr)/weight2Gr);
        int averageDay = ((days1Weight+days2Weight)/2);
        System.out.println(" максимальное количество дней " + days1Weight);
        System.out.println(" минимальное количество дней " + days2Weight);
        System.out.println(" среднее количество дней " + averageDay);

        System.out.println(" Задача 8 ");
        System.out.println(" Условия задачи ");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaNewMonthSalary = ((masha*10)/100)+masha;
        System.out.println(" маша новая зарплата в месяц " + mashaNewMonthSalary);
        int mashaNewYearSalary = (((masha*10)/100)+masha)*12;
        System.out.println(" маша новая зарплата в год " + mashaNewYearSalary);
        int mashaOldYearSalary = masha*12;
        System.out.println(" маша зарабатывала в год " + mashaOldYearSalary);
        int mashaIncreaseSalaryYear = mashaNewYearSalary-mashaOldYearSalary;
        System.out.println(" маша зарплата увеличилась в году на  " + mashaIncreaseSalaryYear);
        System.out.println(" маша теперь зарабатывает " + mashaNewMonthSalary + " рублей " + " годовой доход вырос на " + mashaIncreaseSalaryYear + " рублей " );

        int denisNewMonthSalary = ((denis*10)/100)+denis;
        System.out.println(" денис новая зарплата в месяц " + denisNewMonthSalary);
        int denisNewYearSalary = (((denis*10)/100)+denis)*12;
        System.out.println(" денис новая зарплата в год " + denisNewYearSalary);
        int denisOldYearSalary = denis*12;
        System.out.println(" денис зарабатывал в год " + denisOldYearSalary);
        int denisIncreaseSalaryYear = denisNewYearSalary-denisOldYearSalary;
        System.out.println(" денис зарплата увеличилась в году на  " + denisIncreaseSalaryYear);
        System.out.println(" денис теперь зарабатывает " + denisNewMonthSalary + " рублей " + " годовой доход вырос на " + denisIncreaseSalaryYear + " рублей " );

        int kristinaNewMonthSalary = ((kristina*10)/100)+kristina;
        System.out.println(" кристина новая зарплата в месяц " + kristinaNewMonthSalary);
        int kristinaNewYearSalary = (((kristina*10)/100)+kristina)*12;
        System.out.println(" кристина новая зарплата в год " + kristinaNewYearSalary);
        int kristinaOldYearSalary = kristina*12;
        System.out.println(" кристина зарабатывала в год " + kristinaOldYearSalary);
        int kristinaIncreaseSalaryYear = kristinaNewYearSalary-kristinaOldYearSalary;
        System.out.println(" кристина зарплата увеличилась в году на  " + kristinaIncreaseSalaryYear);
        System.out.println(" кристина теперь зарабатывает " + kristinaNewMonthSalary + " рублей " + " годовой доход вырос на " + kristinaIncreaseSalaryYear + " рублей " );











    }
}