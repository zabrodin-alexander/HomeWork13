import classes.*;

public class Main {
    public static void main(String[] args) {


        Gryffindor[] studentGryffindor = {
                new Gryffindor("Гарри ", "Поттер", 4, 85, 15, 30, 46),
                new Gryffindor("Гериона ", "Грейнджер", 10, 31, 20, 15, 51),
                new Gryffindor("Рон", "Уизли", 7, 45, 16, 6, 22),
        };

        Hufflepuff[] studentHufflepuff = {
                new Hufflepuff("Захария", "Смит", 1, 2, 4, 45, 45),
                new Hufflepuff("Седрик", "Диггори", 2, 6, 46, 4, 10),
                new Hufflepuff("Джастин", "Финч-Флетчли", 5, 10, 7, 8, 32),
        };

        Kogtevran[] studentKogtevran = {
                new Kogtevran("Чжоу", "Чанг", 4, 12, 20, 17, 25),
                new Kogtevran("Падма", "Патил", 4, 12, 20, 17, 25),
                new Kogtevran("Маркус", "Белби", 7, 4, 6, 10, 2),
        };

        Slytherin[] studentSlytherin = {
                new Slytherin("Драко", "Малфой", 4, 10, 1, 3, 8, 4, 15),
                new Slytherin("Грэхэм", "Монтегю", 10, 11, 2, 13, 8, 20, 99),
                new Slytherin("Грегори", "Гойл", 7, 1, 3, 15, 75, 45, 15),
        };

        System.out.println(studentGryffindor[0].toString());
        System.out.println(studentHufflepuff[1].toString());
        System.out.println(studentKogtevran[2].toString());
        System.out.println(studentSlytherin[0].toString());
        System.out.println();
        Hogwarts.comparingStudents(studentGryffindor[0], studentHufflepuff[0]);
        Gryffindor.comparingStudents(studentGryffindor[0], studentGryffindor[1]);
        Kogtevran.comparingStudents(studentKogtevran[0], studentKogtevran[1]);
    }
}
