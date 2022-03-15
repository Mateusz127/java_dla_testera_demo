import Model.Bug;

public class zadaniedomowe3 {
    public static void main(String[] args) {

        Bug bug = new Bug("Brak możliwości logowania", "mateuszkowalski@test.pl", 5);

        bug.setErrorDescription("12345678");

        System.out.println(bug.getErrorDescription());

        bug.setEmail("mateogmail.com");

        System.out.println(bug.getEmail());

        bug.setErrorPriority(3);

        System.out.println(bug.getErrorPriority());

    }
}
