/**
 * @(#) Moniteur.java
 */
package FFSSM;

import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Moniteur extends Plongeur {

    public int numeroDiplome;
    public List<Embauche> e= new LinkedList<>();

    public Moniteur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance, int niveau, GroupeSanguin g, Licence licence, int numeroDiplome) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance, niveau, g, licence);
        this.numeroDiplome=numeroDiplome;
    }
   

   

    public Club employeur() {
         // TODO: Implémenter cette méthode
        int res= -1;
        for(int i=0;i<e.size();i++ ){
            if(!e.get(i).estTerminee()){
                res=i;
            }
        }
        if(res<0){
            return null;
        }
        else{
       
            return (e.get(res).getEmployeur());
        
        
    }}
    
    public void nouvelleEmbauche(Club employeur, Calendar debutNouvelle) {   
         // TODO: Implémenter cette méthode
        e.add(new Embauche(debutNouvelle, this, employeur));	    
    }

    public List<Embauche> emplois() {
         // TODO: Implémenter cette méthode
        return e;
    }

}
