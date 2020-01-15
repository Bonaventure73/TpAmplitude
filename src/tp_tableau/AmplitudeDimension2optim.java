/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_tableau;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class AmplitudeDimension2optim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONSTANTE
        final int nl = 5;
        final int nc = 2;
        
        //VARIABLES
        Scanner reader = new Scanner(System.in);
        int i, j, min, max, ampli;
        
        //déclaration du tableau
        int[][] tab;
        
        //création du tableau
        tab = new int[nl][nc];

        //lecture du tableau
        for(i = 0; i < nl; i++){
            for(j = 0; j < nc; j++){
                System.out.print("Saisir une valeur : ");
                tab [i][j] = reader.nextInt();
            } 
        }
        //recherche du min et du max
        min = tab[0][0];
        max = tab[0][0];
        
        for(i = 0; i < nl; i++){
            for(j = 0; j < nc; j++){
                if (tab[i][j] < min)
                    min = tab[i][j];

                if (tab[i][j] > max)
                    max = tab[i][j];
            }
        }
        
        // Calcul et affichage de l’amplitude
        ampli = max - min;
        System.out.println("La valeur d’amplitude est : " + ampli);
    }
}
