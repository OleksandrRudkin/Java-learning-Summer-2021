package main.java.com.rudkin.registrationform.model.entity;

public class NoteBook {
    private String firstName;
    private String login;

    public NoteBook(String firstName, String login) throws NotUniqueLoginException {
        if (DBNoteBook.checkLogin(login)) {
            throw new NotUniqueLoginException("Not Unique Login",
                    login);
        }
        this.firstName = firstName;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "firstName='" + firstName + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}

