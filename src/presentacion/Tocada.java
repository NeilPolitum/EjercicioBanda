package presentacion;

import java.util.Timer;
import java.util.TimerTask;

class Tocada {
    int c,i=0;
    int gente[];
    String cargo[];
    int r;
    int total = 0;
    
    Tocada(int contador) {
        this.c=contador;
        gente=new int[c];
        cargo=new String[c];
    }
    
    public void asignar(int numero, String s){
        gente[i]=numero;
        cargo[i]=s;
        i++;
    }
    
    public void tocar(){
        for(int k=0;k<c;k++){
            total=total+gente[k];
        }
        
        System.out.println("todos han afinado su instrumento");
        
        Timer timer=new Timer();
                
        TimerTask task;
        task = new TimerTask(){
            @Override
            public void run(){
                r=(int) (Math.random()*(c-0.01));
                
                if(gente[r]>0 && total>0){
                    System.out.println(cargo[r]+" "+gente[r]+" esta tocando");
                    gente[r]=gente[r]-1;
                    total=total-1;
                } else if(total==0){
                    System.out.println("fin de la funcion");
                    System.out.println("¿desea convocar una banda? S/N ");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 1000, 350);   
    }
}