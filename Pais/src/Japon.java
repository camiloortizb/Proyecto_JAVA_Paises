public class Japon extends Pais 

{ // hereda de Pais

    private int templos;
    private String capital;

    @Override
    public void mostrarAtractivo() { 
        
        System.out.println("|===Japón tiene " + templos + " templos antiguos, su capital es " + capital + ", ademas, es conocido por su mezcla de tradición y modernidad, con templos antiguos y tecnología avanzada===|");
       
    }

    // setter y getter para templos
    public int getTemplos(int templos, String capital) {
        return templos;
    }    

    public void setTemplos(int templos) {
        this.templos = templos;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCapital() {
        return capital;
    }

}
