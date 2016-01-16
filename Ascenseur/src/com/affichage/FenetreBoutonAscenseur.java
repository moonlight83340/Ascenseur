/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.affichage;

import com.traitement.Requete;
import com.traitement.ascenseur.AscenseurObservable;
import java.awt.BorderLayout;
import java.util.Collection;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Gaëtan
 */
public class FenetreBoutonAscenseur extends JPanel implements AfficheurObservateur{

    
    public FenetreBoutonAscenseur(AscenseurObservable ascenseur){
        super();
        
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
    
    public ButtonGroup creerBoutton(){
        setLayout(new BorderLayout());
        
        ButtonGroup groupeBoutton = new ButtonGroup();
        
        JRadioButton requeteInterne = new JRadioButton("Requete Interne");
        requeteInterne.setActionCommand("requete interne");
        groupeBoutton.add(requeteInterne);
        
        JRadioButton requeteExterne = new JRadioButton("Requete Externe");
        requeteExterne.setActionCommand("requete interne");
        groupeBoutton.add(requeteExterne);
        
        return groupeBoutton;
    }
    
}
