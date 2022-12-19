import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy, kilo, endeks;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Giriniz: ");
        boy = inp.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kilo = inp.nextDouble();

        endeks = kilo /(boy * boy);
        System.out.println("Vücut Kitle Endeksiniz (BMI): " + endeks);


    }
}