package presentacion;

 class Instrumento {
    
    public int estado,dificultad;
   
    public int estado_de_afinacion(){
        estado=(int)(Math.random()*20);
        
        return estado;
    }   
}