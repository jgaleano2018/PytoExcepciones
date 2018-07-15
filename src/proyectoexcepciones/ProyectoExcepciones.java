/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoexcepciones;

/**
 *
 * @author Jose Mauricio
 */
public class ProyectoExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String respuesta = "";
        int resultadoDivision = 0;
        DivisionPorCeroException divisionPorCeroException = new DivisionPorCeroException();

        divisionPorCeroException.setValueNumerador(10);
        divisionPorCeroException.setValueDenominador(0);
 
        //Manejo de excepciones de la división por cero checked and checked:
        try{                        
            resultadoDivision = DivisionPorCeroChecked(divisionPorCeroException);                    
        }catch(ArithmeticException ex){
            respuesta="División entre cero";
        }
        System.out.println(respuesta);
        
        //Manejo de excepciones de la división por cero checked and unchecked:
        resultadoDivision = DivisionPorCeroChecked(divisionPorCeroException);
        

        if (DivisionPorCeroUnchecked(divisionPorCeroException)!=0){        
            throw new IllegalArgumentException("El valor del operando => denominador: "+divisionPorCeroException.getValueDenominador()+" debe ser mayor que cero.");
        }                    

        try {        
            if (DivisionPorCeroUncheckedToChecked(divisionPorCeroException))
            {
                
                throw new RuntimeException("No detectado");
            }
        }catch(ArithmeticException ex){
            throw new RuntimeException(ex);
        }
        System.out.println(respuesta);
                        
        //Lanzar un error
        
        DivisionPorCeroExcept divisionPorCeroExcept = new DivisionPorCeroExcept();
        
        
    }
    
    public static int DivisionPorCeroChecked(DivisionPorCeroException divisionPorCeroException){
        
        return divisionPorCeroException.ExecuteOperation();
               
    }
    
    public static int DivisionPorCeroUnchecked(DivisionPorCeroException divisionPorCeroException){
        
         return divisionPorCeroException.ExecuteOperation();
               
    }
    
    public static int ConvertUncheckedToChecked(DivisionPorCeroException divisionPorCeroException){
            
         return divisionPorCeroException.getValueDenominador();
               
    }
    
    public static boolean DivisionPorCeroUncheckedToChecked(DivisionPorCeroException divisionPorCeroException){
        
        divisionPorCeroException.ExecuteOperation();
        
        return true;        
    }

    public static void DivisionPorCeroTrown() throws Exception {
        throw new Exception("División por cero");
    }
}
