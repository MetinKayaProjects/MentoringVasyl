package vasyl_fundamentalreviewsession_0514;

import java.lang.reflect.Array;
import java.util.Arrays;
public class SuperHero {
    public String[] superheroes = { "Spiderman", "Iron man", "Hulk", "Wonder Woman", "Thor", "Batman", "Hellboy", "Superman",
            "Flash", "Captain America", "Ant-Man", "Aquaman" };
    public static void main(String[] args) {
        String[] arr1 = { "word" };
        String[] arr2 = new String[2];
        String[] arr3 = new String[] { "apple", "kiwi" };
        arr2[0] = "word";
        arr2[0] = "new word";
        arr2[1] = "one more new word";
        // array is not resizeable
        // System.out.println(Arrays.toString(arr2));
        String[] superheroes = { "Spiderman", "Iron man", "Hulk", "Wonder Woman", "Thor", "Batman", "Hellboy", "Superman",
                "Flash", "Captain America", "Ant-Man", "Aquaman" };
        // how many superheroes we have with space in the name
        // let's print all of them, and their count
        int count = 0;
        String heroesWithSpcace = "";
        for (String s : superheroes) {
            if (s.contains(" ")) {
                System.out.println(s);
                heroesWithSpcace = heroesWithSpcace + s + ", ";
                count++;
            }
        }
        System.out.println("Count of superheroes with space: " + count);
        System.out.println(heroesWithSpcace.substring(0, heroesWithSpcace.length() - 2));
        String[] newHeroes = heroesWithSpcace.split(", ");
        System.out.println(Arrays.toString(newHeroes));
        String[] newHeroes2 = new String[count];
        for (int i = 0, j = 0; i < superheroes.length; i++) {
            if (superheroes[i].contains(" ")) {
                newHeroes2[j] = superheroes[i];
                j++;
            }
            System.out.println("int i: " + i + " int j: " + j);
        }
        System.out.println(Arrays.toString(newHeroes));
        // BREAK TILL 2:43
    }
}