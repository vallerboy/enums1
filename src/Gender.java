/**
 * Created by Lenovo on 18.08.2017.
 */
public enum Gender {
    MEN(false, true, false), WOMEN(true, false, true);

    private boolean hasLongHair;
    private boolean hasMustage;
    private boolean hasMakeup;

    Gender(boolean hasLongHair, boolean hasMustage, boolean hasMakeup) {
        this.hasLongHair = hasLongHair;
        this.hasMustage = hasMustage;
        this.hasMakeup = hasMakeup;
    }

    public boolean isHasLongHair() {
        return hasLongHair;
    }

    public void setHasLongHair(boolean hasLongHair) {
        this.hasLongHair = hasLongHair;
    }

    public boolean isHasMustage() {
        return hasMustage;
    }

    public void setHasMustage(boolean hasMustage) {
        this.hasMustage = hasMustage;
    }

    public boolean isHasMakeup() {
        return hasMakeup;
    }

    public void setHasMakeup(boolean hasMakeup) {
        this.hasMakeup = hasMakeup;
    }
}
