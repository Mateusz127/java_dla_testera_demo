public class Bug {
    //POLA OBIEKTU
    // - opis błędu
    // - adres email osoby zgłaszającej błąd
    // - priorytet błędu (1-5)
    // - status błędu (otawrty/zamkniety) - domyślnie, podczas tworenia zawsze otwarty

    String errorDescription;
    String email;
    int errorPriority;
    boolean status;

    // KONSTRUKTOR

    Bug(String errorDescription, String email, int errorPriority){
        this.errorDescription = errorDescription;
        this.email = email;
        this.errorPriority = errorPriority;
        this.status = false;
    }

    // METODY
    // - pokaż wszystkie informacje na temat błędu
    // - pokaż osobę zgłaszającą błąd
    // - pokaż status błędu
    // - zwróć priorytet błędu

    void getAllInfo(){System.out.println(errorDescription + " " + email + " " + errorPriority + " " + status);}

    void reportingPerson(){System.out.println(email);}

    void errorStatus(){System.out.println(status);}

    int getErrorPriority(){
        return errorPriority;}
}
