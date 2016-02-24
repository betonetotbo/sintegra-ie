package br.gov.sintegra.ie.estados;

import br.gov.sintegra.ie.InscricaoEstadualBase;

/**
 *
 * @author kaoe
 */
public class InscricaoEstadualRR extends InscricaoEstadualBase {
    
    private static final Integer[] MULTIPLICADOR = {1,2,3,4,5,6,7,8};

    @Override
    public boolean validar(String numero) {
        boolean valido = false;
        
        String ie = limpar(numero, "[^0-9]");
        
        if (ie.length()==9) {
            Integer[] numeros = split(ie);
            Integer[] calculo = multiplicar(numeros, MULTIPLICADOR);
            int soma = somar(calculo);
            int digito = modulo9(soma);
            valido = numeros[8]==digito;
        }
        
        return valido;
    }
    
}
