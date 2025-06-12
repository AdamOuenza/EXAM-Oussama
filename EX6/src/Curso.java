public class Curso {
    private String courseName;
    private String instructor;
    private int credits;

    public Curso(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    public void displayCourseDetails() {
        System.out.println("Nombre del curso: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Créditos: " + credits);
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCredits() {
        return credits;
    }
}
