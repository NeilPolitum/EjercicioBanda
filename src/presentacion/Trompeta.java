package presentacion;

class Trompeta extends Instrumento implements Afinacion  {

    @Override
    public String afinar() {
        dificultad=estado_de_afinacion();
    
        if(15>=dificultad){
            return "no debe afinar su trompeta";
        } else {
            return "debe afinar su trompeta";
        }   
    }
}