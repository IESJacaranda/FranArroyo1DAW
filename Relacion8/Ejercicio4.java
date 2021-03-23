package ejercicios;


public class Ejercicio4 extends Exception {
   protected int dia, mes, ano;
   
   public Ejercicio4() {
	   this.dia = 10;
	   this.mes = 50;
	   this.ano = 26;
 	   setDia(dia); 
 	   setMes(mes);
 	   setAno(ano);
   }
   

   public Ejercicio4(int hora, int minutos, int segundos) { 
      
    	  this.dia = dia; 
    	  this.mes = mes;
    	  this.ano = ano;
    	  setDia(dia); 
    	  setMes(mes);
    	  setAno(ano);
   }
      
   

   public void inc() { 
	   ano++;
	   if(ano > 59 && ano <= 60) {
		   ano = 0;
		   mes++;
		   if (mes > 59 && dia <= 60) { 
			   mes = 0; 
			   dia++; 
			   	if (dia > 23 && dia <= 24) { 
			   		dia = 0; 
			   	}
		   }
	  }
   }

   public void setMes(int mes) {
         this.mes = mes; 
   }

   public void setDia(int dia) { 
         this.dia = dia; 
   }
   
   public void setAno(int ano) {
	   this.ano = ano;
   }

   public String toString() {
      String result = null;
    		  if (mes==2) {
    			  if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))) {
    				  if (dia>0 && dia<=29) {
    					result = dia + ":" + mes + ":" + ano +  " am";
      		    	  	return result;
    				  }    		    	  	    			  
    				} else if (dia>0 && dia<=29)  {
        					result = dia + ":" + mes + ":" + ano +  " am";
          		    	  	return result;
        				  }  
    		  }else if(mes<=12 && mes>0 ) {
    			  if (mes==1 ||
    	            mes== 3 ||
    	            mes== 5 ||
    	            mes== 7||
    	            mes== 8||
    	            mes== 10||
    	            mes== 12) {
    				  if (dia>0 && dia<=31) {
    					  result = dia + ":" + mes + ":" + ano +  " am";
        		    	  	return result;
    				  }else {
    			          throw new RuntimeException("La edad debe ser positiva");    				 
    			          }
    			  }
        		  if (mes==1 ||
            	            mes== 4 ||
            	            mes== 6 ||
            	            mes== 9||
            	            mes== 11) {
    				  if (dia>0 && dia<=30) {
    					  result = dia + ":" + mes + ":" + ano +  " am";
        		    	  	return result;
    				  }else {
    			          throw new RuntimeException("La edad debe ser positiva");    				 
    			          }
        		  }
    		  }

			return result;
    	}

      
      
   public int getDia() {
	   return dia;
   }
   
   public int getMes() {
	   return mes;
   }
   public int getAno() {
	   return ano;
   }
   
   
}