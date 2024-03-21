package j23_Encapsulation.task;


    class RunnerRentApartments {//inner Class level
        public static void main(String[] args) {
            RentApartments obj1=new RentApartments("Halit Bey",3,true);
            System.out.println("obj1 = " + obj1);
            RentApartments obj2=new RentApartments();
            obj2.setName("Sema hanim");
            obj2.setRoomCount(2);
            System.out.println("obj2 = " + obj2);
        }
    }//inner Class sonu

