
import java.util.*;

public class Exercises3 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


     /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new list of unique items
      *
      *   You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));
        Set<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        System.out.println(list);   // Your code here

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        toSet(list);//<-- uncomment
        toSet(set);  // <-- uncomment

        System.out.println(toSet(list));
        System.out.println(toSet(set));
    }

    private static Set<String> toSet(Collection <String> collection){
        Set<String> setConversion = new HashSet<>(collection);
        return setConversion;
    }// Write your method for exercise 2 here


    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();


        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.
        int counter = 0;
        for (int i = 0; i < words.size(); i++){
             wordCount.put("", counter+1);
             counter ++; // Your code here
        }
        System.out.println(wordCount.values());
    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer:  una LinkedList andrebbe bene, dato che potrebbero esserci due studenti uguali che non sarebbero accettati in un set
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: ArrayList, in modo da poter inserire due studenti con gli stessi attributi nel caso ce ne fossero, avendo
     *    ovviamente creato un oggetto di tipo Studente
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: TreeSet, dato che il ritorno naturale dei valori numerici è in ordine crescente, dove utilizzando
     *    *       l'implementazione del Comparator possiamo determinare il ritorno di age in ordine crescente
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer: Direi un HashMap in modo da poter avere prodotti e prezzi in modalità chiave-valore, ma se volessimo i prezzi in ordine crescente
     *                sarebbe adatta una TreeMap.
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer: un Linked-HashSet andrebbe bene per l'inserimento in ordine di arrivo, ma potremmo usare anche una LinkedList nel caso dovessimo effettuare
     *                  modifiche frequenti (licenziamenti o aggiunta di personale)
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer: HashMap, in modo da inserire città e popolazione in modalità chiave-valore.
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer: Utilizzerei una TreeMap in modo da avere una chiave (il titolo del libro) e quindi il suo ritorno in ordine alfabetico,
     *    ed i suoi valori quindi l'autore e la data di pubblicazione storati in un'altra interfaccia di tipo Set
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer: HashMap, dove incastoniamo il corso e il nome del professore in modalità chiave-valore.
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer: TreeMap in modo da avere la data di uscita come chiave in ordine crescente , ed i valori associati quindi
     *               il voto e il nome del film storati in un'altra interfaccia
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer: direi una HashMap dove la chiave sia il volo disponibile (quindi magari l'ID) e il valore sia un'altra interfaccia di
     *    tipo Set o Map per la destinazione e  l'orario di partenza
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer: un TreeSet di un oggetto di tipo Article, dove utilizzando l'implementazione del Comparator
     *          possiamo determinare l'ordine della data di pubblicazione in ordine crescente.
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer: TreeMap, in modo da dare come chiave il nome della canzone e come valore un'altra collection che contenga
     *    il nome dell'artista e dell'album
     */

}
