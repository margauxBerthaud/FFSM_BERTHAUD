package FFSSM;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Plongeur extends Personne {
	
    protected GroupeSanguin g;
    public int niveau;
    public ArrayList<Licence> l=new ArrayList<>();
    

    public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, Calendar naissance, int niveau, GroupeSanguin g, Licence licence) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.niveau=niveau;
        this.g=g;
        l.add(licence);
    }
    
    public void ajouteLicence(Licence e){
        l.add(e);
    }
    public int getNiveau(){
        return niveau;
    }
    public void setNiveau(int i){
        this.niveau=i;
    }
    public GroupeSanguin getGroupeSanguin(){
        return g;
    }
    public void setGroupeSanguin(GroupeSanguin i){
        this.g=i;
    }
    public Licence licenceEnCours(){
       int i = (l.size())-1;
       return l.get(i);
    }
    
}
