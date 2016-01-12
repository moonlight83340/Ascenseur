/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.affichage;

import com.traitement.Requete;
import com.traitement.ascenseur.AscenseurStandard;
import java.util.Collection;

/**
 *
 * @author Bprog
 */
public abstract class Afficheur {
    
    protected AscenseurStandard sujet;
    
    abstract void afficher ();
    
    public void mettreAJour (int numEtage, boolean enMouvement, boolean ouvert, boolean bloque, Collection<Requete> requetes) {
        
    }
    
}
