package presentacion;

import java.util.Scanner;

public class Banda{
    public static void main(String[] args) {
        int k=0;
        int c=0;
        String opcion;
        Scanner sc = new Scanner(System.in);
        
        Persona p=new Persona(); 
        Instrumento I=new Instrumento();
        
        System.out.println("¿desea convocar una banda? S/N ");
        
        while(true){
            opcion=sc.next();
            
            Guitarrista persona_g=new Guitarrista();
            Trompetero persona_t=new Trompetero();
            Violinista persona_v=new Violinista();
            Maraquero persona_m=new Maraquero();
            Arpista persona_a=new Arpista();

            c=p.getcontador();

            if("s".equals(opcion)||"S".equals(opcion)){
                persona_g.asistencia();
                persona_t.asistencia();
                persona_v.asistencia();
                persona_m.asistencia();
                persona_a.asistencia();

                persona_g.reportarse();
                persona_t.reportarse();
                persona_v.reportarse();
                persona_m.reportarse();
                persona_a.reportarse();

                System.out.println("¿desea que toquen? S/N ");
                opcion=sc.next();
                if("s".equals(opcion)||"S".equals(opcion)){
                    Tocada T=new Tocada(p.getcontador());

                    for(int i=k;i<p.getcontador();i++){
                        T.asignar(p.reportar_asistencia(i),p.reportar_papel(i));
                    }
                    
                    T.tocar();
                    k=c;
                } else {
                    System.exit(0);
                }
            } else { 
                System.exit(0);
            }
        }
    }
}