/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cedulaecuador;

/**
 *
 * @author Ismael
 */
public class CedulaEcuador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    
    
    }
        
    public boolean validacionCedula (String document){
        
        byte sum = 0;
    try {
        if (document.trim().length() != 10)
            return false;
        String[] data = document.split("");
        byte verifier = Byte.parseByte(data[0] + data[1]);
        if (verifier < 1 || verifier > 24)
            return false;
        byte[] digits = new byte[data.length];
        for (byte i = 0; i < digits.length; i++)
            digits[i] = Byte.parseByte(data[i]);
        if (digits[2] > 6)
            return false;
        for (byte i = 0; i < digits.length - 1; i++) {
            if (i % 2 == 0) {
                verifier = (byte) (digits[i] * 2);
                if (verifier > 9)
                    verifier = (byte) (verifier - 9);
            } else
                verifier = (byte) (digits[i] * 1);
            sum = (byte) (sum + verifier);
        }
        if ((sum - (sum % 10) + 10 - sum) == digits[9])
            return true;
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
        }
    }
    
