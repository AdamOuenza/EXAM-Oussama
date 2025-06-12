public class Main {
    public static void main(String[] args) {
        Curso cursoPresencial = new Curso("Programación Java", "Profesor García", 6);
        OnlineCourse cursoOnline = new OnlineCourse("Desarrollo Web", "Ing. Rodríguez", 5, "Coursera", 12);

        System.out.println("Curso presencial:");
        cursoPresencial.displayCourseDetails();

        System.out.println("\nCurso en línea:");
        cursoOnline.displayCourseDetails();
        System.out.println("¿Elegible para certificado?: " + (cursoOnline.isEligibleForCertificate() ? "Sí" : "No"));
    }
}
