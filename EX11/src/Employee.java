public class Employee {
    private String nombre;
    private String apellido;
    private double sueldo;
    private String departamento;

    public Employee(String nombre, String apellido, double sueldo, String departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " | " + departamento + " | " + sueldo;
    }
}
