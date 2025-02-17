package j23_Encapsulation.task;


    public class RentApartments {//outher Clas level
        private String name;
        private int roomCount;
        private boolean balconyOrNo;

        public RentApartments(String name, int roomCount, boolean balconyOrNo) {
            this.name = name;
            this.roomCount = roomCount;
            this.balconyOrNo = balconyOrNo;
        }

        public RentApartments() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRoomCount() {
            return roomCount;
        }

        public void setRoomCount(int roomCount) {
            this.roomCount = roomCount;
        }

        public boolean isBalconyOrNo() {
            return balconyOrNo;
        }

        public void setBalconyOrNo(boolean balconyOrNo) {
            this.balconyOrNo = balconyOrNo;
        }
        private int rent;
        public int rentCalculator(){
            if (roomCount==0){
                this.rent=1400;
            }else if (roomCount==1){
                this.rent=1700;
            } else if (roomCount==2) {
                this.rent=2200;
            } else if (roomCount==3) {
                this.rent=2700;
            }
            return this.rent+=getBalconyOrNo();
        }

        private int getBalconyOrNo() {
            if (balconyOrNo){
                return 200;
            }else return 0;
        }

        @Override
        public String toString() {
            return
                    "kiracinin adi='" + name + '\'' +
                            ", oda sayisi=" + roomCount +
                            ", balconyOrNo=" + balconyOrNo +
                            " kira miktari="+ rentCalculator();
        }
    }//outher Clas sonu

