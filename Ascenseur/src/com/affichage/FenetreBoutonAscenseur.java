/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.affichage;

import com.traitement.Requete;
import com.traitement.ascenseur.AscenseurObservable;
import java.util.Collection;
import javax.swing.JPanel;

/**
 *
 * @author Gaëtan
 */
public class FenetreBoutonAscenseur extends JPanel implements AfficheurObservateur{

    
    public FenetreBoutonAscenseur(AscenseurObservable ascenseur){
        ascenseur.ajouterObserveur (this);
    }
    
    @Override
    public void afficher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mettreAJour(int numEtage, boolean enMouvement, boolean ouvert, boolean bloque, Collection<Requete> requetes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
