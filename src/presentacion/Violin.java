package presentacion;

class Violin extends Instrumento implements Afinacion {

    @Override
    public String afinar() {
        dificultad=estado_de_afinacion();
    
        if(5>=dificultad){
            return " no debe afinar su violin";
        } else {
            return " debe afinar su violin";
        }  
    }
}