package main.java.com.rudkin.registrationform.model.entity;

public enum DBNoteBook {
    NOTE_ONE("Victor","vitya91"),
    NOTE_TWO("Daryna", "dashka10"),
    NOTE_THREE("Semen","slymak1999");

    private final String firstName;
    private final String login;

    DBNoteBook(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    public static boolean checkLogin(String loginData) {
        for(DBNoteBook note : DBNoteBook.values()){
            if(note.getLogin().equals(loginData)){
                return true;
            }
        }
        return false;
    }
}
