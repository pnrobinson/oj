package org.monarchinitiative.oj;

import org.monarchinitiative.phenol.io.OntologyLoader;
import org.monarchinitiative.phenol.ontology.data.Ontology;

import java.io.File;

public class OJ {


    public static void main(String [] args){
        System.out.println("Read the writing on the wall....");
        String fakepath = "fake";
        Ontology ontology = OntologyLoader.loadOntology(new File(fakepath));
    }

}
