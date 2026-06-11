public class App 
{
    public static void main(String[] args) throws Exception 
    
    {
        System.out.println("======== Nuestros Paises favoritos del Mundo =======");
        
        
        // Creacion de instancias de cada país - son objetos concretos de las clases derivadas
        Argentina argentina = new Argentina();
        argentina.setProvincias(23);
        argentina.mostrarAtractivo();
        Brasil brasil = new Brasil();
        brasil.setPlayas(2095);
        brasil.mostrarAtractivo();
        
        Japon japon = new Japon();
        japon.setTemplos(77000);
        japon.setCapital("Tokio");
        japon.mostrarAtractivo();
    }


}    
   
