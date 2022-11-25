package com.nelson.gestion;

public enum Options {
    Lavabo("Lavabo", 1),
    WC("Toilettes",2, 4, 5, 6),
    SHOWER("Douche", 3, 4, 5, 6),
    TV("Television", 2, 3, 4, 5),
    WASHBASIN("Salle de bain", 5, 6),
    TWO_ROOM("Deux pieces",6);

    int[] cat;
    String desc;

    /**
     *
     * @param desc Description de l'option dans la chambre
     * @param cat Liste des categories dans laquelle l'option sera disponible
     */
    Options(String desc, int ...cat){
        this.cat = cat;
        this.desc = desc;
    }

    public int[] getCategories(){
        return this.cat;
    }

    public String getDescription(){
        return this.desc;
    }
}
