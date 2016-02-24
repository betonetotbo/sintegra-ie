package br.gov.sintegra.ie.estados;

import br.gov.sintegra.ie.InscricaoEstadualBase;

/**
 *
 * @author kaoe
 */
public class InscricaoEstadualGO extends InscricaoEstadualBase {
    
    private static final Integer[] MULTIPLICADOR = {9,8,7,6,5,4,3,2};

    @Override
    public boolean validar(String numero) {
        boolean valido = false;
        
        String ie = limpar(numero, "[^0-9]");
        
        if (ie.length()==9) {
            int base = toInt(ie.substring(0,2));
            if (in(base, 10,11,15)) {
                int num = toInt(ie.substring(0, 8));
                Integer[] numeros = split(ie);
                Integer[] calculo = multiplicar(numeros, MULTIPLICADOR);
                int soma = somar(calculo);
                int digito = 11 - modulo11(soma);
                if (digito == 11) digito = 0;
                else if (digito == 10 && num>=10103105 && num<=10119997) digito = 1;
                else if (digito == 10) digito = 0;
                if (num==11094402 && numeros[8]==1) digito = 1;
                valido = numeros[8]==digito;
            }
        }
        
        return valido;
    }
    
}
