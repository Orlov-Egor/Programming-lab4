package Utilities;

public class HatIsSmallExeption extends RuntimeException {
    @Override
    public String toString() {
        return "Шляпа на самом деле маленькая!";
    }
}