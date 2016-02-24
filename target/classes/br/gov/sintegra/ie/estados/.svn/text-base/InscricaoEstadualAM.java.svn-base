package br.gov.sintegra.ie.estados;

import br.gov.sintegra.ie.InscricaoEstadualBase;

/**
 *
 * @author kaoe
 */
public class InscricaoEstadualAM extends InscricaoEstadualBase {
    
    private static final Integer[] MULTIPLICADOR = {9,8,7,6,5,4,3,2};

    @Override
    public boolean validar(String numero) {
        boolean valido = false;
        
        String ie = limpar(numero, "[^0-9]");
        
        if (ie.length()==9) {
            Integer[] numeros = split(ie);
            Integer[] calculo = multiplicar(numeros, MULTIPLICADOR);
            int soma = somar(calculo);
            int digito;
            if (soma<11) digito = 11-soma;
            else {
                int modulo = modulo11(soma);
                if (modulo<=1) digito = 0;
                else digito = 11 - modulo;
            }
            valido = numeros[8]==digito;
        }
        
        return valido;
    }
    
}
