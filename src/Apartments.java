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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }


    public String getByName3() {
        Scanner scan1 = new Scanner(System.in);
        String name1 = scan1.next();
        for (int i = 0; i < students.length; i++) {
            switch (name1) {
                case "Home":
                    if (name1.contains("Home")) ;
                    System.out.println(students[i]);
            }


        }
        return "Succesfully done";

    }

    public String getByName2(){
        Scanner scan=new Scanner(System.in);
        String name2=scan.next();
        for(int i=0; i<students.length; i++){
            switch (name2){
                case "Home1":
                    System.out.println(students[i]);
                    System.out.println("Put correct number");
            }
        }
        return "Done";
    }

    public String payPerMonth(Students[] students, int price) {
        Students[] arr = new Students[students.length];
        for (int i = 0; i < students.length; i++) {
            arr[i] = students[i];

            System.out.println(arr[i]+"this students will be pay"+" "+ this.price +"som");
        }
        return "All done";
    }

    public String payPerMonth2(Students [] students, int num2){
        Students [] arr2=new Students[students.length];
        for(int i=0; i<students.length; i++){
            arr2[i]=students[i];

            System.out.println(arr2[i]+" "+"this students has to pay: "+ num2+"som");
        }
        return "All done";
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
