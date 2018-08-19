package presentacion;

public class Arpista extends Persona implements Accion {

    Arpista(){
        contador++;
        integrantes=new int [contador];
        papel=new String [contador];
    }
    
    public String agrego_Arpa(){
        Arpa ins_A=new Arpa();
        return ins_A.afinar();
    }
    
    @Override
    public void reportarse() {
        rol="Arpista ";
        papel[j]=rol;
        j++;
        
        if(n>0){
            System.out.println("iran "+n+" arpistas de los cuales:");
        }
        
        for(int k=1;k<(n+1);k++){
            System.out.println("el: "+"arpista"+" "+k+" "+agrego_Arpa());
        }  
    }
}