package br.gov.sintegra.ie.estados;

import br.gov.sintegra.ie.InscricaoEstadualBase;

/**
 *
 * @author kaoe
 */
public class InscricaoEstadualMG extends InscricaoEstadualBase {
    
    private static final Integer[] MULTIPLICADOR_1 = {1,2,1,2,1,2,1,2,1,2,1,2};
    private static final Integer[] MULTIPLICADOR_2 = {3,2,11,10,9,8,7,6,5,4,3,2};

    @Override
    public boolean validar(String numero) {
        boolean valido = false;
        
        String ie = limpar(numero, "[^0-9]");
        
        if (ie.length()==13) {
            String ie1 = ie.substring(0,3)+"0"+ie.substring(3);
            Integer[] numeros1 = split(ie1);
            Integer[] calculo1 = multiplicar(numeros1, MULTIPLICADOR_1);
            int soma = reduzir(calculo1);
            int digito = dezena(soma) - soma;
            if (numeros1[12]==digito) {
                Integer[] numeros2 = split(ie);
                Integer[] calculo2 = multiplicar(numeros2, MULTIPLICADOR_2);
                soma = somar(calculo2);
                digito = 11-modulo11(soma);
                if (digito == 10 || digito == 11) digito = 0;
                valido = numeros2[12]==digito;
            }
        }
        
        return valido;
    }
    
}
