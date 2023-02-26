package university.people;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthday) {
        this.birthDay = birthday;
    }
}
