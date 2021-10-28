import java.util.ArrayList;

public class CourseArrayList {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    public CourseArrayList(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students.add(student);
        numberOfStudents++;
    }

    public ArrayList<String> getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){
        students.remove(student);
    }
}
