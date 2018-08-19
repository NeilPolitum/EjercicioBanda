package presentacion;

class Maraquero extends Persona implements Accion {

    Maraquero(){
        contador++;
        integrantes=new int [contador];
        papel=new String [contador];
    }
    
    public String agrego_Maracas(){
        Maraca ins_M=new Maraca();
        return ins_M.afinar();
    }
    
    @Override
    public void reportarse() {
        rol="maraquero ";
        papel[j]=rol;
        j++;
        
        if(n>0){
            System.out.println("iran "+n+" maracasas de las cuales:");
        }
        
        for(int j=1;j<(n+1);j++){
            System.out.println("el: "+"maraquero"+" "+j+" "+agrego_Maracas());
        }
    }  
}