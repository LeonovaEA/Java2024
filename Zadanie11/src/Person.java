public class Person implements Cloneable {
    String name;
    int age;
    String email;
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public Cloneable clone() {
        return new Person(this.name, this.age, this.email);
    }
    @Override
    public String toString() {
        return "Имя: " + name + ", Возраст: " + age + ", Почта: " + email;
    }
}