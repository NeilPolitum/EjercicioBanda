package presentacion;

class Persona {
    public String rol;
    public static int contador;
    public int n;
    public static String papel[];
    public static int []integrantes;
    public static int i=0;
    public static int j=0;
    
    public int asistencia(){
        n=(int)(Math.random()*5); 
        
        integrantes[i]=n;
        i++;
        
        return n;
    }  
   
    public int getcontador(){
        return contador;
    }
    
    public int reportar_asistencia(int j){
        return integrantes[j]; 
    }
    
    public String reportar_papel(int j){
        return papel[j];     
    }
}