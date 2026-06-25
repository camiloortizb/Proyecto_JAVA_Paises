public class Brasil extends Pais 

{ //hereda de Pais
    private int playas;
    
@Override  // implementa el método abstracto de la clase base - hereda el metodo mostrarAtractivo() de la clase pais y lo implementa de manera específica para Brasil
    public void mostrarAtractivo(){
        System.out.println("|===Brasil es famoso por sus playas, tiene mas de " + playas + " playas hermosas, como Copacabana e Ipanema, ademas de su cultura vibrante y su biodiversidad, incluyendo la selva amazónica===|");
    }

    // setter y getter para playas PILAR ENCAPSULAMIENTO
    public int getPlayas() { 
        return playas;
    }

    public void setPlayas(int playas){
        this.playas = playas; 
    }


}