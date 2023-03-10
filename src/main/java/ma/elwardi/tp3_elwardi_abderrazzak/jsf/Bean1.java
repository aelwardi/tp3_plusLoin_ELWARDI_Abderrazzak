/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package ma.elwardi.tp3_elwardi_abderrazzak.jsf;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@Named(value = "bean1")
@RequestScoped
public class Bean1 {

    private int nombre;
    
    public String actionString(String base, String numEx, String query){
        return base+numEx+query;
    }
    public String afficher() {
        return "affichage__4?numEx=" + nombre + "&amp;faces-redirect=true";
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }
}
