package br.gov.sintegra.ie.estados;

import br.gov.sintegra.ie.InscricaoEstadualBase;

/**
 *
 * @author kaoe
 */
public class InscricaoEstadualMS extends InscricaoEstadualBase {
    
    private static final Integer[] MULTIPLICADOR = {9,8,7,6,5,4,3,2};

    @Override
    public boolean validar(String numero) {
        boolean valido = false;
        
        String ie = limpar(numero, "[^0-9]");
        
        if (ie.length()==9 && "28".equals(ie.substring(0, 2))) {
            Integer[] numeros = split(ie);
            Integer[] calculo = multiplicar(numeros, MULTIPLICADOR);
            int soma = somar(calculo);
            int digito = 11 - modulo11(soma);
            if (digito == 10 || digito == 11) digito = 0;
            valido = numeros[8]==digito;
        }
        
        return valido;
    }
    
}
