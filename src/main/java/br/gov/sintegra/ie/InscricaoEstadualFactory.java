package br.gov.sintegra.ie;

import br.gov.sintegra.ie.estados.*;

/**
 *
 * @author kaoe
 */
public abstract class InscricaoEstadualFactory {
    
    public static InscricaoEstadual getInstance(String estado) {
        InscricaoEstadual ie = null;
        
        if ("AC".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualAC();
        } else if ("AL".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualAL();
        } else if ("AP".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualAP();
        } else if ("AM".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualAM();
        } else if ("BA".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualBA();
        } else if ("CE".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualCE();
        } else if ("DF".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualDF();
        } else if ("ES".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualES();
        } else if ("GO".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualGO();
        } else if ("MA".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualMA();
        } else if ("MT".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualMT();
        } else if ("MS".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualMS();
        } else if ("MG".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualMG();
        } else if ("PA".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualPA();
        } else if ("PB".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualPB();
        } else if ("PR".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualPR();
        } else if ("PE".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualPE();
        } else if ("PI".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualPI();
        } else if ("RJ".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualRJ();
        } else if ("RN".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualRN();
        } else if ("RS".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualRS();
        } else if ("RO".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualRO();
        } else if ("RR".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualRR();
        } else if ("SC".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualSC();
        } else if ("SP".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualSP();
        } else if ("SE".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualSE();
        } else if ("TO".equalsIgnoreCase(estado)) {
            ie = new InscricaoEstadualTO();
        }
        
        return ie;
    }
    
}
