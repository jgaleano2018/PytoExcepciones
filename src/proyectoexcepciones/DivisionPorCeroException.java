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
public class DivisionPorCeroException {
    
    public int valueDenominador;
    public int valueNumerador;
    public int valueCociente;

    public int getValueDenominador() {
        return valueDenominador;
    }

    public void setValueDenominador(int valueDenominador) {
        this.valueDenominador = valueDenominador;
    }

    public int getValueNumerador() {
        return valueNumerador;
    }

    public void setValueNumerador(int valueNumerador) {
        this.valueNumerador = valueNumerador;
    }

    public int getValueCociente() {
        return valueCociente;
    }

    public void setValueCociente(int valueCociente) {
        this.valueCociente = valueCociente;
    }
    
    public int ExecuteOperation(){
        
       this.setValueCociente(this.getValueNumerador()/this.getValueDenominador());
       
       return (this.getValueCociente());
    }
}
