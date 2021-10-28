public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents > students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = student;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        String[] updatedStudent = new String[students.length];
        int j = 0;
        int i;
        for (i = 0; i < students.length; i++) {
            if (students[i] != student) {
                updatedStudent[j] = students[i];
                j++;
            }
        }
        if ( i == j){
            System.out.println("The student is not in the course.");
        }
        students = updatedStudent;
        numberOfStudents--;
    }

    public void clear(){
        String[] temp = new String[students.length];
        for(int i =0; i<students.length;i++){
            students[i] = temp[i];
        }
    }
}
