// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Students student = new Students("Adel", 234567, "Ak", 50);
        Students student1 = new Students("Alina", 345678, "Korea", 1000);
        Students student2 = new Students("Aziz", 456789, "Moscow", 100);
        Students student3 = new Students("Elina", 23456789, "Russia", 100);
        Students students4 = new Students("Alina", 6, "China", 500);


        Students[] students = {student, student1};
        Students[] students1 = {student2, student3, students4};

        Apartments apartment = new Apartments("Home", 3000, "Lenin", students);
        Apartments apartment1 = new Apartments("Home1", 4000, "Dubai", students1);

        Apartments[] arr ={apartment, apartment1};


        System.out.println("How many day my students could live");
        student1.liveIn( students);
        student2.liveIn( students1);
        System.out.println("--------------------------------------");


        System.out.println("How much they have to pay?");
        apartment.payPerMonth(students);
        System.out.println("------------------------------");
        apartment1.payPerMonth(students1);
        System.out.println("---------------------------------------");


        System.out.println("Update the info about student Aziz: ");
        System.out.println(apartment1.updateInfo("Aziz", "Japan"));
        System.out.println("----------------------------------------");


        apartment.getMyStudentsByApartments(apartment, students);
        apartment.getMyStudentsByApartments(apartment1,students1);


        System.out.println("----------------------------");
        apartment.getMy(arr);
        apartment1.getMy(arr);

    }
}