class Persona {

    // Atributos de la clase Persona
    private String nombre;
    private String apellido;
    private int dni;
 // clase encapsulada, por eso los atributos son privados




    // constructor de la clase Persona- pasamos como parametros los 3 datos
    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }  // this hace referencia a los atributos de la clase, para diferenciarlos de los parametros del constructor

}  // Getters y Setters para acceder a los atributos de la clase Persona


// polimorfismo es la capacidad de un objeto de tomar muchas formas, es decir, 
// una clase puede tener varios métodos con el mismo nombre pero con diferentes parámetros, 
// o una clase puede heredar de otra clase y sobrescribir sus métodos. En este caso, no se está utilizando 
// polimorfismo, ya que no hay ningún método con el mismo nombre ni ninguna clase que herede de otra clase.

public Persona() {
    // constructor vacio
}

// getter y setter 


// setter siempre es de tipo void, porque no devuelve nada, solo asigna un valor al atributo
// setter asigna un valor al atributo nombre, es decir, el nombre de la persona
public void setNombre(String nombre) {
    this.nombre = nombre;
}

//getter siempre es de tipo del atributo que devuelve, en este caso String, porque devuelve el nombre de la persona
// getter devuelve el valor del atributo nombre, es decir, el nombre de la persona
public String getNombre() {
    return nombre;
}

public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("DNI: " + dni);
}


