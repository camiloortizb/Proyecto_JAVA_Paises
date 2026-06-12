public class Brasil extends Pais 

{ //hereda de Pais
    private int playas;
    
@Override
    public void mostrarAtractivo(){
        System.out.println("|===Brasil es famoso por sus playas, tiene mas de " + playas + " playas hermosas, como Copacabana e Ipanema, ademas de su cultura vibrante y su biodiversidad, incluyendo la selva amazónica===|");
    }

    // setter y getter para playas
    public int getPlayas() { 
        return playas;
    }

    public void setPlayas(int playas) {
        this.playas = playas; // ejemplo de asignación de valor
    }
}