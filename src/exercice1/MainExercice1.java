package exercice1;

import datamocklib.Person;
import datamocklib.TxtHelper;

import java.util.ArrayList;
import java.util.List;

public class MainExercice1 {

    // Format du fichier : firstName,lastName,birthDate,gender,cityOfResidence,cityOfBirth
    // Pas de header
    public static List<Person> parse(List<String> data) {
        // A COMPLETER
        List<Person> personnes = new ArrayList<>();
        for (String s : data)
        {
            String[] tokens = s.split(",");

            Person p = new Person(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);

            personnes.add(p);  
        }
    return personnes;
    }

    public static void main(String[] args) {
        // EXO 1
        /*
         * - Récuperez la liste des personnes sous la forme -> firstName,lastName,birthDate,gender,cityOfResidence,cityOfBirth
         *   grâce à la fonction TxtHelper.getDataFromTxt("persons.txt")
         * - Parser la liste des Personnes grâce à la fonction parse())
         * - Calculer le nombre de personnes nées dans chaque ville avec les données obtenues.
         * Les données contiennent une trentaine de villes, Bonne chance !
        */

        List<String> datafetched = TxtHelper.getDataFromTxt("persons.txt");

        List<Person> personnes = MainExercice1.parse(datafetched);

        System.out.println(personnes.get(0).toString());

        Map<String, Integer> nbOfBirthPerCity = new Hashmap<String, Integer>();

        for (Person p : personnes)
        {
            p.getCityOfBirth();
            // récupérer les villes, chercher si la ville est dans le dico, ajouter la ville si non, mettre +1 à la ville si oui
        }

    }
}
