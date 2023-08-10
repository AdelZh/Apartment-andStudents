import java.util.Arrays;
import java.util.Scanner;

public class Apartments {

    private String name;
    private int price;
    private String address;

    private Students[] students;


    public Apartments(String name, int price, String address, Students[] students) {
        this.name = name;
        this.price = price;
        this.address = address;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void getMyStudentsByApartments(Apartments apartments, Students[] students){
        Scanner scan=new Scanner(System.in);
        String num=scan.next();
        for(int i=0; i<students.length; i++){
            if(apartments.getName().equals(num)){
                System.out.println(students[i]+ " "+ "Apartment name is"+" " +apartments.getName());
            }else{
                System.out.println("Put correctly");
            }
        }

        }



        public void getMy(Apartments [] apartments){
        Scanner scan1=new Scanner(System.in);
        String num1=scan1.next();
        for(int i=0; i<apartments.length; i++){
            if(apartments[i].getName().equals(num1)){
                System.out.println(apartments[i]);
            }else{
                System.out.println("Put correctly");
            }
        }
        }


        public void payPerMonth(Students[] student) {
        for (int i = 0; i < students.length; i++) {
           if(students[i].equals(student));

            System.out.println(student[i]+"this students will be pay"+" "+ this.price +"som");

        }

    }


    public void getAll(){
        for(int i=0; i<students.length; i++){
            System.out.println(students[i]+" ");
        }


    }


    public String updateInfo(String name, String newAddress) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFullName().equals(name)) {
                students[i].setAddress(newAddress);
                System.out.println(students[i]);
            }
        }
       return "Succesfully changed";

    }

    @Override
    public String toString() {
        return "Apartments{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
