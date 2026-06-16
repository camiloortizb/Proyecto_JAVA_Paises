public class Cliente extends Persona {

    // esto es herencia, Cliente es una subclase de Persona,
    //  por lo tanto hereda sus atributos y métodos, pero también 
    // puede tener sus propios atributos y métodos
    private boolean pago;


    // constructor de la clase Cliente, que recibe como parámetros los atributos de la clase Persona y el atributo pago

    public Cliente(String nombre, String apellido, int dni, boolean pago) {
        
        //super es una palabra reservada que se utiliza para llamar al constructor de la clase padre osea Persona, 
        // en este caso Persona, para inicializar los atributos heredados de la clase Persona
        super(nombre, apellido, dni); // super hace referencia al constructor de la clase padre, en este caso Persona
        this.pago = pago;
    }


    @Override  // esto es polimorfismo, porque estamos sobrescribiendo el método mostrarInformacion() de la clase Persona,   
   
}