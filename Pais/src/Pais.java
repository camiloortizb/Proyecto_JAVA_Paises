public abstract class Pais 

{  // clase abstracta que no se puede instanciar directamente porque es una plantilla para los países específicos
    private String nombre;
    private String capital;
    
    // setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public abstract void mostrarAtractivo(); // funcion abstracta que cada país implementará de manera diferente
}
