import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
        ArrayList <String> ar = new <String> ArrayList();
        ar.add("Саша");
        ar.add("Таня");
        ar.add("Руслан");
        try {
            ar.remove(4);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        } finally {
            System.out.println("Мы в блоке finally");
        }
    }
}
