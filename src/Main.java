import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Students student = new Students("Adel", 234567, "Ak", 50);
        Students student1 = new Students("Alina", 345678, "Korea", 50);
        Students student2 = new Students("Aziz", 456789, "Moscow", 100);
        Students student3 = new Students("Elina", 23456789, "Russia", 100);
        Students students4 = new Students("Alina", 6, "China", 50);




        Students[] students = {student, student1};
        Students[] students1 = {student2, student3, students4};

        Apartments apartment = new Apartments("Home", 3456, "Lenin", students);
        Apartments apartment1 = new Apartments("Home1", 2345678, "Dubai", students1);



        System.out.println(student1.liveIn(apartment, students));

        System.out.println(student2.liveIn(apartment1, students1));


        System.out.println("---------------------------");


        System.out.println(apartment.getByName3());
        System.out.println("---------------------");

        System.out.println(apartment1.getByName2());
        System.out.println("-----------------------------");
        System.out.println(apartment.payPerMonth(students, 3456));
        System.out.println("------------------------------");
        System.out.println(apartment1.payPerMonth2(students1, 3000));
        System.out.println("-------------------------------");


        System.out.println(apartment1.updateInfo("Aziz", "Japan"));



    }
}