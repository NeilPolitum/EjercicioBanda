package presentacion;

class Trompetero extends Persona implements Accion{
    
    Trompetero(){
        contador ++;
        integrantes=new int [contador];
        papel=new String [contador];
    }
    
    public String agrego_Trompetas(){
        Trompeta ins_T=new Trompeta();
        return ins_T.afinar();
    }
    
    @Override
    public void reportarse() {
        rol="Trompetero ";
        papel[j]=rol;
        j++;
        
        if(n>0){
            System.out.println("iran "+n+" trompetas de las cuales:");
        }
        
        for(int j=1;j<(n+1);j++){
            System.out.println("el: "+"trompetista"+" "+j+" "+agrego_Trompetas());
        }
    }
}