package presentacion;

public class Violinista extends Persona implements Accion{

    Violinista(){
        contador++;
        integrantes=new int [contador];
        papel=new String [contador];
    }
    
    public String agrego_Violines(){
        Violin ins_V=new Violin();
        return ins_V.afinar();
    }
    
    @Override
    public void reportarse() {
        rol="Violinista";
        papel[j]=rol;
        j++;
        
        if(n>0){
            System.out.println("iran "+n+" volines de los cuales:");
        }
        
        for(int j=1;j<(n+1);j++){
            System.out.println("el: "+"violinista"+" "+j+" "+agrego_Violines());
        }
    }
}