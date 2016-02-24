package br.gov.sintegra.ie.estados;

import br.gov.sintegra.ie.InscricaoEstadualBase;

/**
 *
 * @author kaoe
 */
public class InscricaoEstadualSP extends InscricaoEstadualBase {

    private static final Integer[] MULTIPLICADOR_1 = {1,3,4,5,6,7,8,10};
    private static final Integer[] MULTIPLICADOR_2 = {3,2,10,9,8,7,6,5,4,3,2};
    
    @Override
    public boolean validar(String numero) {
        boolean valido = false;
        
        String ie = limpar(numero, "[^0-9P]");
        
        if (ie.length()==12 || (ie.length()==13 && "P".equals(ie.subSequence(0, 1)))) {
            Integer[] numeros = split(ie);
            if (!"P".equals(ie.subSequence(0, 1))) {
                Integer[] calculo1 = multiplicar(numeros, MULTIPLICADOR_1);
                int soma = somar(calculo1);
                int digito = right(modulo11(soma));
                if (numeros[8]==digito) {
                    Integer[] calculo2 = multiplicar(numeros, MULTIPLICADOR_2);
                    soma = somar(calculo2);
                    digito = right(modulo11(soma));
                    valido = numeros[11]==digito;
                }
            } else {
                Integer[] calculo1 = multiplicar(numeros, MULTIPLICADOR_1);
                int soma = somar(calculo1);
                int digito = right(modulo11(soma));
                valido = numeros[8]==digito;
            }
        }
        
        return valido;
    }
    
}
