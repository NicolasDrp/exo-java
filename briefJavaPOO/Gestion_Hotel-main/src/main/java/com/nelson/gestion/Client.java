package com.nelson.gestion;

public class Client {

    private int id;
    private String name;
    private String lastName;
    // Chambre reserver par l'utilisateur
    private Room room;


    /**
     *
     * @param name Prenom de l'utilisateur
     * @param lastName Nom de l'utilisateur
     */
    public Client(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        this.room = null;
    }

    public String getName(){
        return this.name;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Room getRoom(){
        return this.room;
    }

    public void setRoom(Room room){
        this.room = room;
    }
}
