package presentacion;

public class Guitarra extends Instrumento implements Afinacion {

    @Override
    public String afinar() {
        dificultad=estado_de_afinacion();    
        
        if(dificultad<=10){
            return "no debe afinar su guitarra";
        } else {
            return "debe afinar su guitarra";
        }
    }    
}