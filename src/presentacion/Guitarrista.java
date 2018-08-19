package presentacion;

public class Guitarrista extends Persona implements Accion{
    
    Guitarrista(){
        contador++;
        integrantes=new int [contador];
        papel=new String [contador];
    }
    
    public String agrego_Guitarra(){
        Guitarra ins_G=new Guitarra();
        return ins_G.afinar();
    }
    
    @Override
    public void reportarse() {
        rol="Guitarrista ";
        papel[j]=rol;
        j++;
        
        if(n>0){
            System.out.println("iran "+n+" guitarristas de los cuales:");
        }
        
        for(int j=1;j<(n+1);j++){
            System.out.println("el: "+"guitarrista"+" "+j+" "+agrego_Guitarra());
        }
    }     
}