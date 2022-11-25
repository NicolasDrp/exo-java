package com.nelson.gestion;

import java.util.*;

public class Main {

    private static List<Client> clients = new ArrayList<>();
    private static List<Room> rooms = new ArrayList<>();

    // Les categories dans les diffrents nom de variable ou commentaire represente le nombre d'etoile de la chambre

    /**
     * Point d'entrée du programme
     * @param args Argument de lancement
     */
    public static void main(String[] args) {

        // Initialise les différentes chambre en cache ( en liste ) .
        init_local_db();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Renseigner votre prenom : ");
        String name = scanner.next();

        System.out.println("Renseigner votre nom : ");
        String lastName = scanner.next();

        // Instanciation de l'utilisateur
        Client client = new Client(name, lastName);


        System.out.println("Pour combien de personne voulez vous reserver ?");
        int capacity = scanner.nextInt();

        // Verification de l'entré clavier de l'utilisateur, permet de vérifier si le nombre de personne pour une chambre est dispo
        while(capacity == 0 || capacity > 6){
            System.out.println("Proposer une valeur superieur a 0 et superieur a 6.");
            capacity = scanner.nextInt();
        }


        System.out.println(capacity);


        System.out.println("Voici les options pour le nombre de personne que vous voulez reserver...");

        // Ecrit la description de chaque chambre dans la console
        getDescOfRoom(capacity);

        System.out.println("Choisissez la chambre que vous desirer avec son identifiant : ");

        int room_id = scanner.nextInt();

        // Verifie que l'identifiant de la chambre entrée par l'utilisateur est valide.
        while(client.getRoom() == null){


            for(Room room : rooms){
                // Pas de verification si la chambre ne correspond pas à la capacité demandé
                if(room.getCapacity() == capacity ){
                    // Si une des chambres est du même id que l'utilisateur a entré, ajoute a l'utilisateur sa chambre
                    if(room.getId() == room_id){
                        client.setRoom(room);
                        System.out.println("Vous avaz selectionne la chambre identifie " + room.getId());
                        break;
                    }
                }
            }
            // verifie que la chambre a été instancié, si non, redemander un identifiant valide.
            if(client.getRoom() == null){
                System.out.println("Veuiller entrer un identifiants valide");
                room_id = scanner.nextInt();
            }
        }

        client.setId(clients.size());
        clients.add(client);

    }

    public static void getDescOfRoom(int capacity){
        for (Room room : rooms){
            if(room.getPrice() != 0){
                if(room.getCapacity() == capacity){
                    System.out.println("Identifiant de la chambre : " + room.getId());
                    System.out.println("Nombre d'etoiles " + room.getCategory());
                    System.out.println("Prix de la chambre " + room.getPrice());

                    System.out.println("Options de la chambre : ");

                    for(Options options : room.getOptions()){
                        System.out.println("\t" + options.getDescription());
                    }

                    System.out.println("\n");
                }
            }
        }
    }

    public static void init_local_db(){
        int[] price_per_people_1 = {100, 120, 130, 150};
        int[] price_per_people_2 = {130, 160, 170, 190};
        int[] price_per_people_3 = {170, 200, 210, 230, 270, 350};
        int[] price_per_people_4 = {200, 230, 240, 260, 300, 400};

        int[][] prices = {price_per_people_1, price_per_people_2, price_per_people_3, price_per_people_4};

        for(int i = 0; i < prices.length; i++){

            for(int j = 0; j < prices[i].length; j++){

                Room room = new Room(i + j,j + 1, i + 1, prices[i][j]);
                rooms.add(room);
            }
        }


        // Liste d'options
        for(Options option : Options.values()){
            // Liste de chambre
            for(Room room : rooms){

                // Liste d'option pour la categories en question
                List<Integer> op = new ArrayList(Arrays.asList(option.getCategories()));

                if(op.contains(room.getCategory())){
                    room.addOptions(option);
                }

            }
        }
    }
}
