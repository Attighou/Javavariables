package fr.wildcodeschool.variables;

import java.io.IOException;
import java.lang.*;

public class IndianaJones {
    public static void main(String... args) throws IOException{

        String sTitle_Movie="Indiana Jones and the Last Crusade";
        boolean bSaw_Movie=false;
        int iYearOut_Movie=1989;
        float fNote_Movie=8.3f;

        String sTexteAfficher;

        sTexteAfficher="Film :"  + sTitle_Movie;

        if (bSaw_Movie) {
            sTexteAfficher=sTexteAfficher + ", j'ai vu ce film";
        } else {
            sTexteAfficher=sTexteAfficher + ", je n'ai pas vu ce film";

        }
        sTexteAfficher=sTexteAfficher + ", il est sorti en " + iYearOut_Movie ;

        sTexteAfficher=sTexteAfficher + ", avec une note de : " + fNote_Movie + " sur 10";


        System.out.println(sTexteAfficher);


    }
}

