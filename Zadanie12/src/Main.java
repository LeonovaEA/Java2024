public class Main {
    public static void main(String[] args) {
        CourseComponent math = new Subject("Математика");
        CourseComponent physics = new Subject("Физика");
        CourseComponent computerScience = new Subject("Информатика");

        Course basicCourse = new Course("Основы науки");
        Course advancedCourse = new Course("Продвинутый курс");

        basicCourse.addCourseComponent(math);
        basicCourse.addCourseComponent(physics);

        advancedCourse.addCourseComponent(computerScience);

        System.out.println("Учебный план:");
        basicCourse.showDetails();
        System.out.println("");
        advancedCourse.showDetails();
    }
}