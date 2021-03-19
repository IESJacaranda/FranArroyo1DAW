package ejercicios;


public class Ejercicio4 {
   protected int hora, minutos, segundos;
   protected double totalHora, totalParametros;
   
   public Ejercicio4() {
	   this.hora = 10;
	   this.minutos = 50;
	   this.segundos = 26;
 	   setHora(hora); 
 	   setMinutos(minutos);
 	   setSegundos(segundos);
 	   this.totalHora = (double)hora + ((double)minutos/60) + ((double)segundos/3600);
   }
   

   public Ejercicio4(int hora, int minutos, int segundos) { 
      
    	  this.hora = hora; 
    	  this.minutos = minutos;
    	  this.segundos = segundos;
    	  setHora(hora); 
    	  setMinutos(minutos);
    	  setSegundos(segundos);
    	  this.totalParametros = (double)hora + ((double)minutos/60) + ((double)segundos/3600);
   }
      
   

   public void inc() { 
	   segundos++;
	   if(segundos > 59 && segundos <= 60) {
		   segundos = 0;
		   minutos++;
		   if (minutos > 59 && hora <= 60) { 
			   minutos = 0; 
			   hora++; 
			   	if (hora > 23 && hora <= 24) { 
			   		hora = 0; 
			   	}
		   }
	  }
   }

   public void setMinutos(int minutos) {
         this.minutos = minutos; 
   }

   public void setHora(int hora) { 
         this.hora = hora; 
   }
   
   public void setSegundos(int segundos) {
	   this.segundos = segundos;
   }

   public String toString() {
      String result;
    	  if(hora < 12) {
    	  	result = hora + ":" + minutos + ":" + segundos +  " am";
    	  	return result;
      	}else if(hora == 12) {
      		result = 12 + ":" + minutos +  ":" + segundos + " pm";
      		return result;
      	}else if(hora > 12 && hora < 24){
      		result = (hora - 12) + ":" + minutos + ":" + segundos + " pm";
      		return result;
      	}else {
      		result = (hora - 24) + ":" + minutos + ":" + segundos + " am";
      		return result;
      	
      	}	
    	  
      
      }
   public int getHora() {
	   return hora;
   }
   
   public int getMinutos() {
	   return minutos;
   }
   public int getSegundos() {
	   return segundos;
   }
   
   public void comparaHoras() {
	   if(this.totalHora == this.totalParametros) {
		   System.out.println("Son iguales");
	   }else {
		   System.out.println("Son distintas " + totalHora + " -- " +totalParametros);
	   }
   }
   
}