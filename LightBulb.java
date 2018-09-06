package HangMan;

/**
 * Created by 708 on 9/6/2018.
 */
public class LightBulb {
    private boolean statue;
    private int hitCount;

    public LightBulb(){
            statue = false;
            hitCount = 10;
    }

    public void toggleSwitch() {
        if (hitCount > 0){
            statue = !statue;
            hitCount--;
        }
    }

    public void charge(int batteryHour) {
        if (batteryHour > 0) {
            hitCount += batteryHour;
        }
    }

    public String getCurrentStatus() {
        return (statue) ? "ON" : "OFF";
    }
}
