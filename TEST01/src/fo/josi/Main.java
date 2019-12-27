package fo.josi;

public class Main {

    public static void main(String[] args) {
        System.out.print("Test av forrit við dato sum input: ");

        String dato = System.console().readLine();

        String[] dateParts = dato.split("-");
        String dateDay = dateParts[0];
        String dateMonth = dateParts[1];
        String

        Integer[] monthLength = new Integer[]{31, 30, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31};

        System.out.println("Dato: " + dato);

    }
}
