package br.gov.sintegra.ie.estados;

import br.gov.sintegra.ie.InscricaoEstadualBase;

/**
 *
 * @author kaoe
 */
public class InscricaoEstadualRN extends InscricaoEstadualBase {
    
    private static final Integer[] MULTIPLICADOR_1 = {9,8,7,6,5,4,3,2};
    private static final Integer[] MULTIPLICADOR_2 = {10,9,8,7,6,5,4,3,2};

    @Override
    public boolean validar(String numero) {
        boolean valido = false;
        
        String ie = limpar(numero, "[^0-9]");
        
        if (ie.length()==9 && "20".equals(ie.substring(0, 2))) {
            Integer[] numeros = split(ie);
            Integer[] calculo = multiplicar(numeros, MULTIPLICADOR_1);
            int soma = somar(calculo);
            int digito = modulo11(soma*10);
            if (digito == 10) digito = 0;
            valido = numeros[8]==digito;
        } else if (ie.length()==10 && "20".equals(ie.substring(0, 2))) {
            Integer[] numeros = split(ie);
            Integer[] calculo = multiplicar(numeros, MULTIPLICADOR_2);
            int soma = somar(calculo);
            int digito = modulo11(soma*10);
            if (digito == 10) digito = 0;
            valido = numeros[9]==digito;
        }
        
        return valido;
    }
    
}
