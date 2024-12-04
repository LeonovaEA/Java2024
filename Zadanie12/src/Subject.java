public class Subject implements CourseComponent {
    private String name;

    public Subject(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Предмет: " + name);
    }
}