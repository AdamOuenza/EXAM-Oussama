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

        System.out.println("Penúltimo y antepenúltimo que menos ganan:");
        empleados.stream()
                .sorted(Comparator.comparingDouble(Employee::getSueldo))
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        System.out.print("\nSueldo medio del departamento Marketing: ");
        double media = empleados.stream()
                .filter(e -> e.getDepartamento().equalsIgnoreCase("Marketing"))
                .mapToDouble(Employee::getSueldo)
                .average()
                .orElse(0.0);
        System.out.printf("%.2f\n", media);

        System.out.print("\nDepartamento del empleado que más gana: ");
        empleados.stream()
                .max(Comparator.comparingDouble(Employee::getSueldo))
                .ifPresent(e -> System.out.println( e.getDepartamento()));

    }
}
