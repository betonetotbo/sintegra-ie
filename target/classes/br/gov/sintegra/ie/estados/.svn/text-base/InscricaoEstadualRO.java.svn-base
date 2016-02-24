package br.gov.sintegra.ie.estados;

import br.gov.sintegra.ie.InscricaoEstadualBase;

/**
 *
 * @author kaoe
 */
public class InscricaoEstadualRO extends InscricaoEstadualBase {
    
    private static final Integer[] MULTIPLICADOR_1 = {6,5,4,3,2};
    private static final Integer[] MULTIPLICADOR_2 = {6,5,4,3,2,9,8,7,6,5,4,3,2};

    @Override
    public boolean validar(String numero) {
        boolean valido = false;
        
        String ie = limpar(numero, "[^0-9]");
        
        if (ie.length()==9) {
            String ie2 = ie.substring(3);
            Integer[] numeros = split(ie2);
            Integer[] calculo = multiplicar(numeros, MULTIPLICADOR_1);
            int soma = somar(calculo);
            int digito = 11 - modulo11(soma);
            if (digito == 10 || digito == 11) digito = digito-10;
            valido = numeros[5]==digito;
        } else if (ie.length()==14) {
            Integer[] numeros = split(ie);
            Integer[] calculo = multiplicar(numeros, MULTIPLICADOR_2);
            int soma = somar(calculo);
            int digito = 11 - modulo11(soma);
            if (digito == 10 || digito == 11) digito = digito-10;
            valido = numeros[13]==digito;
        }
        
        return valido;
    }
    
}
