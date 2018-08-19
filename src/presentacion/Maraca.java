package presentacion;

class Maraca extends Instrumento implements Afinacion {

    @Override
    public String afinar() {
        return "no afina sus maracas.";
    }
}