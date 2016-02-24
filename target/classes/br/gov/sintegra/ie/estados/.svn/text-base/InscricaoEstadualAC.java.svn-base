package br.gov.sintegra.ie.estados;

import br.gov.sintegra.ie.InscricaoEstadualBase;

/**
 *
 * @author kaoe
 */
public class InscricaoEstadualAC extends InscricaoEstadualBase {
    
    private static final Integer[] MULTIPLICADOR_1 = {4,3,2,9,8,7,6,5,4,3,2};
    private static final Integer[] MULTIPLICADOR_2 = {5,4,3,2,9,8,7,6,5,4,3,2};

    @Override
    public boolean validar(String numero) {
        boolean valido = false;
        
        String ie = limpar(numero, "[^0-9]");
        
        if (ie.length()==13 && "01".equals(ie.substring(0, 2))) {
            Integer[] numeros = split(ie);
            Integer[] calculo1 = multiplicar(numeros, MULTIPLICADOR_1);
            int soma = somar(calculo1);
            int digito = 11-modulo11(soma);
            if (digito==10 || digito==11) digito = 0;
            if (numeros[11]==digito) {
                Integer[] calculo2 = multiplicar(numeros, MULTIPLICADOR_2);
                soma = somar(calculo2);
                digito = 11-modulo11(soma);
                if (digito==10 || digito==11) digito = 0;
                valido = numeros[12]==digito;
            }
        }
        
        return valido;
    }
    
}
