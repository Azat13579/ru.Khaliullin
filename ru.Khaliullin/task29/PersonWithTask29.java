package task29;

public class PersonWithTask29 {

    private Integer age;
    private String surname;
    private String sex;

    public PersonWithTask29(Integer age, String surname, String sex) {
        this.age = age;
        this.surname = surname;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonWithTask29 that = (PersonWithTask29) o;

        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        return sex != null ? sex.equals(that.sex) : that.sex == null;

    }

    @Override
    public int hashCode() {
        int result = age != null ? age.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PersonWithTask29{" +
                "age=" + age +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
