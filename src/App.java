public class App {
    public static void main(String[] args) throws Exception {
        // Crear un objeto de la clase Persona utilizando el constructor con parámetros
        Persona persona1 = new Persona("Juan", "Pérez", 12345678);
        // Crear un objeto de la clase Persona utilizando el constructor vacío
        Persona persona2 = new Persona();
        // Asignar valores a los atributos de persona2 utilizando los setters
        persona2.setNombre("María");
        persona2.setApellido("Gómez");
        persona2.setDni(87654321); 
        persona1.mostrarInformacion();
        persona2.mostrarInformacion();

        Cliente cliente1 = new Cliente("Carlos", "Martínez", 55667788, false);
        cliente1.mostrarInformacion();
        Cliente cliente2 = new Cliente("Ana", "López", 11223344, true);
        
    }
}
