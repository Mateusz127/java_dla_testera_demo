public class Zadaniedomowe1 {
    public static void main(String[] args) {
        // 1. 4 zmienne typu int

        int a = 5;
        int b = 18;
        int c = 1;
        int d = 53;

        // 2. Sprawdzamy czy suma dwóch pierwszych jest parzysta

        System.out.println((a+b) % 2 == 0);

        // 3. Sprawdzamy czy suma dwóch pozostałych jest parzysta

        System.out.println((c+d) % 2 == 0);

        // 4. Jeżeli dwie sumy są parzyste to wyświetl informację, że wszystkie liczby są parzyste
        int sumaOne = (a+b);
        int sumaTwo = (c+d);

        if (sumaOne % 2 == 0 && sumaTwo % 2 == 0){
            System.out.println("Wszystkie liczby są parzyste");
        }
        else{
            System.out.println("Wszystkie liczby nie są parzyste");
        }


    }
}
