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

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getBankAccount() {
            return bankAccount;
        }

        public void setBankAccount(int bankAccount) {
            this.bankAccount = bankAccount;
        }


        public String liveIn(Apartments apartments, Students [] students) {
            //Students [] arr1=new Students[students.length];
            int num = 100;
            for (int i = 0; i < students.length; i++) {
                if (students[i].getBankAccount() == num) {
                    System.out.println(students[i] + " " + "Has to live 3 month");

                } else if (students[i].getBankAccount() != num) {
                    System.out.println(students[i] + " " + "Has to live 1 month");
                }
            }
            return "How many days my students could live: ";
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


