import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Домашнее задание - 1
        //Задание 1
        int totalMustHave = 2459000, totalHave = 0, population=12_000_000;
        short contribution = 15000, monthCounter=0, iterationCounter=0;
        byte birthrate=17, deathRate = 8;
        System.out.println("\033[4mДомашнее задание - 1\033[0m \nЗадание 1");
        while(totalHave <= totalMustHave){
            totalHave+=contribution;
            monthCounter++;
        }
        System.out.println("Месяц "+monthCounter+", сумма накоплений равна "+totalHave+" рублей");

        //Задание 2
        System.out.println("\nЗадание 2");
        while(iterationCounter < 10){
            iterationCounter++;
            System.out.print(iterationCounter+" ");
        }
        System.out.println();
        for(;iterationCounter > 0;iterationCounter--){
            System.out.print(iterationCounter+" ");
        }

        //Задание 3
        System.out.println("\n\nЗадание 3");
        for(int i=1;i <= 10;i++){
            population += (population/1000)*(birthrate-deathRate);
            System.out.println("Год "+i+", численность населения составляет "+population);
        }

        //Домашнее задание - 2
        //Задание 1
        int savingsOnDeposit = 15000;
        monthCounter=2;
        System.out.println("\n\033[4mДомашнее задание - 2\033[0m \nЗадание 1");
        //Если проценты начинают начисляться с начала второго месяца
        while(savingsOnDeposit <= 12_000_000){
            savingsOnDeposit+=(savingsOnDeposit/100)*7;
            System.out.println("Месяц "+monthCounter+", сумма накоплений составляет "+savingsOnDeposit);
            monthCounter++;
        }

        //Задание 2
        savingsOnDeposit = 15000;
        monthCounter=2;
        System.out.println("\nЗадание 2");
        while(savingsOnDeposit <= 12_000_000){
            savingsOnDeposit+=(savingsOnDeposit/100)*7;
            if(monthCounter%6 == 0) System.out.println("Месяц "+monthCounter+", сумма накоплений составляет "+savingsOnDeposit);
            monthCounter++;
        }

        //Задание 3
        savingsOnDeposit = 15000;
        monthCounter=2;
        System.out.println("\nЗадание 3");
        while(monthCounter <= 108){
            savingsOnDeposit+=(savingsOnDeposit/100)*7;
            if(monthCounter%6 == 0) System.out.println("Месяц "+monthCounter+", сумма накоплений составляет "+savingsOnDeposit);
            monthCounter++;
        }

        //Задание 4
        System.out.println("\nЗадание 4");
        int fridayDate;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дату первой пятницы (от 1 до 7)");
        while (true){
            while(!scan.hasNextInt()){
                System.out.println("Введено недопустимое значение, попробуйте снова: ");
                scan.nextLine();
            }
            fridayDate=scan.nextInt();
            if (fridayDate >= 1 && fridayDate <= 7){
                break;
            }
            else{
                System.out.println("Значение должно быть от 1 до 7 включительно");
                scan.nextLine();
            }
        }
        while(fridayDate <= 31){
            System.out.println("Сегодня пятница, "+fridayDate+"-е число. Необходимо подготовить отчет.");
            fridayDate+=7;
        }

        //Домашнее задание - 3
        //Задание 1
        int yearCounter, referenceYear;
        System.out.println("\n\033[4mДомашнее задание - 3\033[0m \nЗадание 1");

        System.out.println("\nУкажите год отсчёта:");
        while(!scan.hasNextInt()){
            System.out.println("Введено недопустимое значение, попробуйте снова: ");
            scan.nextLine();
        }
        referenceYear=scan.nextInt();
        yearCounter = referenceYear - 200;

        do{
            if(yearCounter%79 == 0){
                System.out.println(yearCounter);
            }
            yearCounter++;
        }while (yearCounter <= (referenceYear+100));

        //Задание 2
        System.out.println("\nЗадание 2");
        for(int i = 1; i <= 10;i++){
            System.out.println("2*"+i+"="+(2*i));
        }

        scan.close();
    }
}