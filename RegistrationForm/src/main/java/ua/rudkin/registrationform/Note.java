package main.java.ua.rudkin.registrationform;

public class Note implements Comparable<Note> {
    private String name;
    private String eMail;
    private String lastName;

    public Note(String name, String eMail, String lastName) {
        this.name = name;
        this.eMail = eMail;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Note o) {
        return lastName.compareTo(o.lastName);
    }

    public String generateFullName(String name, String lastName) {
        return name + " " + lastName.charAt(0) + ".";
    }

}
