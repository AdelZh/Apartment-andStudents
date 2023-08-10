public class Students {


        private String fullName;
        private int phoneNumber;
        private String address;

        private int bankAccount;
        private Students [] students;



    public Students(String fullName, int phoneNumber, String address, int bankAccount) {
            this.fullName = fullName;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.bankAccount = bankAccount;

        }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBankAccount() {
            return bankAccount;
        }

        public void setBankAccount(int bankAccount) {
            this.bankAccount = bankAccount;
        }

    public void setAddress(String address) {
        this.address = address;
    }

    public void liveIn(Students [] students) {

            int num = 100;
            int num1 = 500;
            int num2 = 50;
            int num3 = 1000;

            for (int i = 0; i < students.length; i++) {
                if (students[i].getBankAccount() == num) {
                    System.out.println(students[i] + " " + ":" + "Has to live 3 month");

                }
                if (students[i].getBankAccount() == num2) {
                    System.out.println(students[i] + " " + ":" + "Has to live 1 month");
                }
                if (students[i].getBankAccount() == num1) {
                    System.out.println(students[i] + " " + " :" + "Has to live 5 month");
                }
                if (students[i].getBankAccount() == num3) {
                    System.out.println(students[i] + " " + ":" + "Has to live 7 month");
                    break;
                }
            }
        }





        @Override
        public String toString() {
            return "Student{" +
                    "fullName='" + fullName + '\'' +
                    ", phoneNumber=" + phoneNumber +
                    ", address='" + address + '\'' +
                    ", bankAccount=" + bankAccount +
                    '}';
        }
    }


