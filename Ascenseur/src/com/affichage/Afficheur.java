/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.affichage;

import com.traitement.Requete;
import java.util.Collection;

/**
 *
 * @author Bprog
 */
public interface Afficheur {
    
    abstract void afficher ();
    
    public void mettreAJour (int numEtage, boolean enMouvement, boolean ouvert, boolean bloque, Collection<Requete> requetes);
    
}
