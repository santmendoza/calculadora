
package calculadora;


public class Calculadora extends Exception  {
    
    
    public int sumar(int n1, int n2){
    int resultado=0;
    resultado = n1+n2;
    return resultado;
    
    
    }
    
    public int restar (int n1, int n2){
        
        int resultado=0;
        resultado = n1-n2;
        return resultado;
        
    }
    
    public int multiplicar(int n1, int n2) {
        int resultado=0;
       resultado = n1*n2;
        return resultado;
    
    }
    
    
    public int  division (int n1, int n2) throws Exception {
    
   
    int resultado=0;
    resultado= (int)(n1/n2);
    
    try{
       
 
    } catch (Exception e){
        
        throw new Exception("Enviando excepcion");
   
    }
       
    
    
    return resultado;
    
    
    
    }
    
    
    
    
    
    
    
}
