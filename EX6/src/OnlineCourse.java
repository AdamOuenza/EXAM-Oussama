public class OnlineCourse extends Curso {
    private String plataforma;
    private int duracion; // en horas

    public OnlineCourse(String courseName, String instructor, int credits, String plataforma, int duracion) {
        super(courseName, instructor, credits);
        this.plataforma = plataforma;
        this.duracion = duracion;
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Duración: " + duracion + " horas");
    }

    public boolean isEligibleForCertificate() {
        return duracion >= 10;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getDuracion() {
        return duracion;
    }
}
