public class zadaniedomowe2 {
    public static void main(String[] args) {

        Bug First = new Bug("Brak możliwości logowania", "mateuszkowalski@test.pl", 5);

        First.getAllInfo();
        int errorPriority = First.getErrorPriority();
        System.out.println(errorPriority);
        First.reportingPerson();
        First.errorStatus();
    }
}
