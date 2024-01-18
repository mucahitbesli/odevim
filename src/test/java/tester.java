import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bölünen sayıyı girin: ");
        int bolunen = scanner.nextInt();

        System.out.print("Bölen sayıyı girin: ");
        int bolen = scanner.nextInt();

        try {
            double sonuc = bolmeIslemi(bolunen, bolen);
            System.out.println("Sonuç: " + sonuc);
        } catch (ArithmeticException e) {
            System.err.println("Hata: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double bolmeIslemi(int bolunen, int bolen) throws ArithmeticException {
        if (bolen == 0) {
            throw new ArithmeticException("Sıfıra bölme hatası!");
        }
        return (double) bolunen / bolen;
    }
}
