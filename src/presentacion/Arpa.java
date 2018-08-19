package presentacion;

public class Arpa extends Instrumento implements Afinacion{

    @Override
    public String afinar() {
        dificultad=estado_de_afinacion();
    
        if(3>=dificultad){
            return "no debe afinar su arpa";
        } else {
            return "debe afinar su arpa";
        }   
    }    
}