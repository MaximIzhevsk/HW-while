public class Main {
    public static void main(String[] args) {

        System.out.println("task 1");
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total += 15000;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total);
        }
        System.out.println();

        System.out.println("task 2");
        int cnt = 1;
        while (cnt <= 10){
            System.out.print(cnt + " ");
            cnt++;
        }
        System.out.println();
        for (cnt = 10; cnt != 0; cnt--) {
            System.out.print(cnt + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("task 3");
        int population = 12_000_000;
        for (int i = 1; i < 11; i++) {
            population += (population/1000) * (17 - 8);
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
        System.out.println();

        System.out.println("task 4");
        double total4 = 15000;
        int month4 = 1;
        while (total4 <= 12_000_000){
            total4 += total4 * 0.07;
            System.out.println("Месяц " + month4 + " сумма накоплений " + (int)total4);
            month4++;
        }
        System.out.println();

        System.out.println("task 5");
        double total5 = 15000;
        int month5 = 1;
        while (total5 <= 12_000_000){
            total5 += total5 * 0.07;
            if (month5 % 6 == 0) {
                System.out.println("Месяц " + month5 + " сумма накоплений " + (int)total5);
            }
            month5++;
        }
        System.out.println();

        System.out.println("task 6");
        double total6 = 15000;
        for (int i = 1; i <= 9 * 12 ; i++) {
            total6 += total6 * 0.07;
            if (i % 6 == 0){
                System.out.println("Месяц " + i + " сумма накоплений " + (int)total6);
            }
        }
        System.out.println();

        System.out.println("task 7");
        int friday = 5;
        for (int i = 1; i <= 31; i++) {
            if (i == friday){
                System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет");
                friday += 7;
            }
        }
        System.out.println();

        System.out.println("task 8");
        int currentYear = 2024;
        int beforeYear = currentYear - 200;
        int afterYear = currentYear + 100;
        for (int i = beforeYear; i <= afterYear ; i++) {
            if (i % 79 == 0){
                System.out.println(i);
            }
        }

    }
}