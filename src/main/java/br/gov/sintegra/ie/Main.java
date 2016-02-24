package br.gov.sintegra.ie;

/**
 *
 * @author kaoe
 */
public class Main {

    public static void main(String[] args) {
        
        InscricaoEstadual ie = InscricaoEstadualFactory.getInstance("MG");
        boolean valido = ie.validar("7016128500006");
        System.out.println("Válido: "+valido);
        
    }
    
}
