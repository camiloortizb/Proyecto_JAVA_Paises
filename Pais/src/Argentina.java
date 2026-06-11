public class Argentina extends Pais 

{  // hereda de Pais
    private int provincias;
    

    @Override  // implementa el método abstracto de la clase base
    public void mostrarAtractivo(){
        System.out.println("Argentina tiene " + provincias + " provincias, nuestras favoritas son Chubut y Santa Cruz.");
    }

    // setter y getter para provincias
    public int getProvincias() {
        return provincias;
    }

    public void setProvincias(int provincias) {
        this.provincias = provincias;
    }
}
