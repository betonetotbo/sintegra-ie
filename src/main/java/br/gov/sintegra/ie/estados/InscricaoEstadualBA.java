package br.gov.sintegra.ie.estados;

import br.gov.sintegra.ie.InscricaoEstadualBase;

/**
 *
 * @author kaoe
 */
public class InscricaoEstadualBA extends InscricaoEstadualBase {
    
    private static final Integer[] MULTIPLICADOR_8_1 = {7,6,5,4,3,2};
    private static final Integer[] MULTIPLICADOR_8_2 = {8,7,6,5,4,3};
    private static final Integer[] MULTIPLICADOR_9_1 = {8,7,6,5,4,3,2};
    private static final Integer[] MULTIPLICADOR_9_2 = {9,8,7,6,5,4,3};

    @Override
    public boolean validar(String numero) {
        boolean valido = false;
        
        String ie = limpar(numero, "[^0-9]");
        
        if (ie.length()==8) {
            int inicial = toInt(ie.substring(0, 1));
            if (in(inicial, 0,1,2,3,4,5,8)) {
                Integer[] numeros = split(ie);
                Integer[] calculo1 = multiplicar(numeros, MULTIPLICADOR_8_1);
                int soma = somar(calculo1);
                int digito = 10-modulo10(soma);
                if (digito == 10) digito = 0;
                if (numeros[7]==digito) {
                    Integer[] calculo2 = multiplicar(numeros, MULTIPLICADOR_8_2);
                    soma = somar(calculo2)+(2*digito);
                    digito = 10-modulo10(soma);
                    if (digito == 10) digito = 0;
                    valido = numeros[6]==digito;
                }
            } else if (in(inicial, 6,7,9)) {
                Integer[] numeros = split(ie);
                Integer[] calculo1 = multiplicar(numeros, MULTIPLICADOR_8_1);
                int soma = somar(calculo1);
                int digito = 11-modulo11(soma);
                if (digito == 10 || digito == 11) digito = 0;
                if (numeros[7]==digito) {
                    Integer[] calculo2 = multiplicar(numeros, MULTIPLICADOR_8_2);
                    soma = somar(calculo2)+(2*digito);
                    digito = 11-modulo11(soma);
                    if (digito == 10 || digito == 11) digito = 0;
                    valido = numeros[6]==digito;
                }
            }
        } else if (ie.length()==9) {
            int inicial = toInt(ie.substring(0, 1));
            if (in(inicial, 0,1,2,3,4,5,8)) {
                Integer[] numeros = split(ie);
                Integer[] calculo1 = multiplicar(numeros, MULTIPLICADOR_9_1);
                int soma = somar(calculo1);
                int digito = 10-modulo10(soma);
                if (digito == 10) digito = 0;
                if (numeros[8]==digito) {
                    Integer[] calculo2 = multiplicar(numeros, MULTIPLICADOR_9_2);
                    soma = somar(calculo2)+(2*digito);
                    digito = 10-modulo10(soma);
                    if (digito == 10) digito = 0;
                    valido = numeros[7]==digito;
                }
            } else if (in(inicial, 6,7,9)) {
                Integer[] numeros = split(ie);
                Integer[] calculo1 = multiplicar(numeros, MULTIPLICADOR_9_1);
                int soma = somar(calculo1);
                int digito = 11-modulo11(soma);
                if (digito == 10 || digito == 11) digito = 0;
                if (numeros[8]==digito) {
                    Integer[] calculo2 = multiplicar(numeros, MULTIPLICADOR_9_2);
                    soma = somar(calculo2)+(2*digito);
                    digito = 11-modulo11(soma);
                    if (digito == 10 || digito == 11) digito = 0;
                    valido = numeros[7]==digito;
                }
            }
        }
        
        return valido;
    }
    
}
