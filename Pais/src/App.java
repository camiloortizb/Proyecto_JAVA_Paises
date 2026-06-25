import java.util.Scanner;

public class App 
{
    public static void main(String[] args) throws Exception 
    
    {
        System.out.println("======== En este programa mostraremos información de nuestros paises favoritos del mundo =======");

        System.out.println("======== Ingresa A para ver Argentina, B para ver Brasil y J para ver Japon =======");
    
        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine().toUpperCase();

        // utilizamos un switch para manejar las diferentes opciones ingresadas por el usuario
        switch (opcion) {
            case "A":  // por cada caso, creamos una instancia de la clase correspondiente, establecemos sus atributos y llamamos al método para mostrar su atractivo
                Argentina argentina = new Argentina(); // instanciamos la clase Argentina
                argentina.setProvincias(23); // asignamos el número de provincias a través del setter
                argentina.mostrarAtractivo(); // llamamos al método para mostrar la información específica de Argentina
                argentina.setCapital("Buenos Aires"); // asignamos la capital a través del setter
                break;
            case "B":
                Brasil brasil = new Brasil(); // instanciamos la clase Brasil
                brasil.setPlayas(2095); // asignamos el número de playas a través del setter
                brasil.mostrarAtractivo(); // llamamos al método  para mostrar la información específica de Brasil
                break;
            case "J":
                Japon japon = new Japon(); // instanciamos la clase Japon
                japon.setTemplos(77000); // asignamos el número de templos a través del setter
                japon.setCapital("Tokio"); // asignamos la capital a través del setter
                japon.mostrarAtractivo(); // llamamos al método para mostrar la información específica de Japón
                break;
            default:
                System.out.println("Opción no válida. Por favor, ingresa A, B o J.");
                // si el usuario ingresa una opción no válida, se muestra un mensaje de error
        }

        scanner.close();
    
    }


}    
   
