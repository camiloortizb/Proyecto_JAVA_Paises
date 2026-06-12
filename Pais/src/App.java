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
                Argentina argentina = new Argentina();
                argentina.setProvincias(23);
                argentina.mostrarAtractivo();
                break;
            case "B":
                Brasil brasil = new Brasil();
                brasil.setPlayas(2095);
                brasil.mostrarAtractivo();
                break;
            case "J":
                Japon japon = new Japon();
                japon.setTemplos(77000);
                japon.setCapital("Tokio");
                japon.mostrarAtractivo();
                break;
            default:
                System.out.println("Opción no válida. Por favor, ingresa A, B o J.");
                // si el usuario ingresa una opción no válida, se muestra un mensaje de error
        }

        scanner.close();
    
    }


}    
   
