package csd214.csd110.house;

public class Main {
    public static void main(String[] args) {

        String firstname=new String("Fred");

        House fredsHouse=new House();
        House amandasHouse=new House();

        fredsHouse.lightFire(false);
        amandasHouse.lightFire(true);
        fredsHouse.openDoor(true);
        amandasHouse.openDoor(false);

    }
}
