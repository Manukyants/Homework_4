public class Main {
    public static void main(String[] args) {

        // Задание №1
        int i;
        for (i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n");
        while(i > 0){
            System.out.print(i + " ");
            i--;
        }
        System.out.println("\n");

        // Задание №2
        int friday = 5;
        for (friday = 5; friday < 31; friday = friday + 7){
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
        }


        // Задание №3
        int year = 2022;
        int futureYear = year + 100;
        int lastYear = year - 200;
        for (year = 0; year < 2122; year = year + 79 ){
            if (year<futureYear && year>lastYear){
                System.out.println(year);
            }
        }


            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            



        }
        
    }