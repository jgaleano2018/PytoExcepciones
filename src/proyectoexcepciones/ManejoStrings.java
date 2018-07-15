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
public class ManejoStrings {
    
    public String wordRoot;

    public String getWordRoot() {
        return wordRoot;
    }

    public void setWordRoot(String wordRoot) {
        this.wordRoot = wordRoot;
    }
     
    
    public boolean CalcularPalindromoStringBuffer(ManejoStrings manejoStrings){
    
        boolean result = false;
        String strLocalWordRoot = manejoStrings.getWordRoot();
        StringBuffer sBufferPalindromo = new StringBuffer();
        StringBuffer sBufferReversePalindromo = new StringBuffer();
        int i = 0;
        
        while (i<strLocalWordRoot.length()){            
            sBufferPalindromo.append(strLocalWordRoot.substring(i, i+1));
        }
        
        i=strLocalWordRoot.length()-1;
        while (i>0){            
            sBufferReversePalindromo.append(strLocalWordRoot.substring(i - 1, i));
        }
        
        if (sBufferPalindromo.toString() == sBufferReversePalindromo.toString())
        {
            result = true;
        }
        //System.out.println("Tiempo del StringBuffer: " + (fin-inicio));       
        
        return result;
    }
    
    public boolean CalcularPalindromoStringBuilder(ManejoStrings manejoStrings){
    
        boolean result = false;
        String strLocalWordRoot = manejoStrings.getWordRoot();
        StringBuilder sBuilderPalindromo = new StringBuilder();
        StringBuilder sBuilderReversePalindromo = new StringBuilder();
        int i = 0;
        
        while (i<strLocalWordRoot.length()){            
            sBuilderPalindromo.append(strLocalWordRoot.substring(i, i+1));
        }
        
        i=strLocalWordRoot.length()-1;
        while (i>0){            
            sBuilderReversePalindromo.append(strLocalWordRoot.substring(i - 1, i));
        }
        
        if (sBuilderPalindromo.toString() == sBuilderReversePalindromo.toString())
        {
            result = true;
        }
        //System.out.println("Tiempo del StringBuilder: " + (fin-inicio));       
        
        return result;
    }

}
