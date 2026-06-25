public class Argentina extends Pais 

{  // hereda el atributo de Pais
    private int provincias;
    private String capital;
    

    @Override  // implementa el método abstracto de la clase base - hereda el metodo mostrarAtractivo() de la clase pais y lo implementa de manera específica para Argentina
    public void mostrarAtractivo(){
        System.out.println("|===Argentina tiene " + provincias + "su capital es" + capital + " provincias, nuestras favoritas son Chubut y Santa Cruz===|");
    }

    // setter y getter para provincias PILAR ENCAPSULAMIENTO
    public int getProvincias() {
        return provincias;
    }

    public void setProvincias(int provincias) {
        this.provincias = provincias;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }


}

