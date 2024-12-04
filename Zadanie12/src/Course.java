import java.util.ArrayList;
import java.util.List;

public class Course implements CourseComponent {
    private String courseName;
    private List<CourseComponent> courseComponents = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addCourseComponent(CourseComponent component) {
        courseComponents.add(component);
    }

    public void removeCourseComponent(CourseComponent component) {
        courseComponents.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Курс: " + courseName);
        for (CourseComponent component : courseComponents) {
            component.showDetails();
        }
    }
}