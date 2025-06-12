import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> empleados = List.of(
                new Employee("alberto", "Garcia", 5000, "IT"),
                new Employee("Basilio", "Garcia", 7600, "IT"),
                new Employee("Carlos", "Gomez", 3587.5, "Sales"),
                new Employee("David", "Gutierrez", 4700.77, "Marketing"),
                new Employee("Emilio", "Gonzalo", 6200, "IT"),
                new Employee("Fernando", "Gasmon", 3200, "Sales"),
                new Employee("Gabriel", "Gyster", 4236.4, "Marketing"),
                new Employee("Hector", "zabal", 5000, "AI"),
                new Employee("Ignacio", "xermio", 4300, "AI"),
                new Employee("Jorge", "yelmes", 5000, "AI"),
                new Employee("Kevin", "veiles", 2500, "AI"),
                new Employee("Lucrecio", "tibio", 3210, "IT"),
                new Employee("Miguel", "ubal", 9000, "ceo"),
                new Employee("Nicolas", "quilves", 4700, "parking"),
                new Employee("Omar", "pontrio", 5000, "parking"),
                new Employee("Pablo", "ovez", 6000, "parking")
        );

        empleados.stream()
                .filter(e -> e.getDepartamento().equalsIgnoreCase("AI"))
                .forEach(e -> e.setSueldo(e.getSueldo() * 1.15));

        System.out.println("Empleados AI con aumento del 15%:");
        empleados.stream()
                .filter(e -> e.getDepartamento().equalsIgnoreCase("AI"))
                .forEach(System.out::println);

        System.out.println("\nEmpleados con sueldo > 2000 y < 5000:");
        empleados.stream()
                .filter(e -> e.getSueldo() > 2000 && e.getSueldo() < 5000)
                .forEach(System.out::println);
    }
}
