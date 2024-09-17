package csd214.csd110.house;

public class House {
    private boolean isFireLit;
    private boolean isDoorOpen;

    public void openDoor(boolean open){
        isDoorOpen=open;
    }

    public void lightFire(boolean fire){
        isFireLit=fire;
    }
}
