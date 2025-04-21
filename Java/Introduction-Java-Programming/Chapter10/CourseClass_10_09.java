public class CourseClass_10_09 {
    public static void main(String[] args) {
        Course newCourse = new Course("Java");
        newCourse.addStudent("Julia");
        newCourse.addStudent("Tom");
        newCourse.addStudent("Kern May");
        for (int i = 0; i < newCourse.getNumberOfStudents(); i++) {
            System.out.printf("%s, ", newCourse.getStudents()[i]);
        }
        System.out.println();
        newCourse.dropStudent("Tom");
        for (int i = 0; i < newCourse.getNumberOfStudents(); i++) {
            System.out.printf("%s, ", newCourse.getStudents()[i]);
        }
    }
}
