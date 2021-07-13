package main.java.com.rudkin.immutableobject;

public final class ImmutableCat {

    private final String name;
    private final String breed;
    private final Age age;

    public ImmutableCat(String name, String breed, Age age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public Age getAge() {
        Age cloneAge = new Age();
        cloneAge.setDay(this.age.getDay());
        cloneAge.setMonth(this.age.getMonth());
        cloneAge.setYear(this.age.getYear());
        return cloneAge;
    }

    @Override
    public String toString() {
        return "ImmutableCat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}

