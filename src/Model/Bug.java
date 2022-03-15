package Model;

public class Bug {
    //POLA OBIEKTU
    // - opis błędu
    // - adres email osoby zgłaszającej błąd
    // - priorytet błędu (1-5)
    // - status błędu (otawrty/zamkniety) - domyślnie, podczas tworenia zawsze otwarty

    private String errorDescription;
    private String email;
    private int errorPriority;
    private boolean status;

    public String getErrorDescription() {
        return errorDescription;
    }
    public void setErrorDescription(String errorDescription) {
        if (errorDescription.length()<10) {
            System.out.println("Too few characters were entered");
        }
        else {
            this.errorDescription = errorDescription;
        }
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
        else {
            System.out.println("Incorrect email address");
        }
    }
    public int getErrorPriority() {
        return errorPriority;
    }
    public void setErrorPriority(int errorPriority) {
        if (errorPriority>=0 & errorPriority<=5){
            this.errorPriority = errorPriority;
        }
        else {
            System.out.println("Wrong value");
        }
    }

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
// KONSTRUKTOR

    public Bug(String errorDescription, String email, int errorPriority){
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

    public void getAllInfo(){System.out.println(errorDescription + " " + email + " " + errorPriority + " " + status);}

    public void reportingPerson(){System.out.println(email);}

    public void errorStatus(){System.out.println(status);}

}
