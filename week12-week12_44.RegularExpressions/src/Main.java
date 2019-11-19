
public class Main {

    public static void main(String[] args) {
        // write test code here
    }
    public static boolean isAWeekDay(String string){
        return string.matches("(mon|tue|wed|thu|fri|sat|sun)");
    }
    public static boolean allVowels(String string){
        return string.matches("(a|e|i|o|u|ä|ö)*");
    }
    public static boolean clockTime(String string){
        return string.matches("([2][0-3]|[0-1][0-9]):[0-5][0-9]:[0-5][0-9]");
    }
}
