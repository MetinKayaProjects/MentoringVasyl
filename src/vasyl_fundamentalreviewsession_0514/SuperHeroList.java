package vasyl_fundamentalreviewsession_0514;

import java.util.ArrayList;
import java.util.Arrays;
public class SuperHeroList {
    public static void main(String[] args) {
        //we created an object of SuperHero class.
        //Why?
        //because we want to get instance variables superheroes, 
        //that stores array of strings with superheroes names.
        SuperHero object = new SuperHero();
        
        ArrayList<String> superheroes = new ArrayList<String>();
        superheroes.addAll(Arrays.asList(object.superheroes));
        
        
        System.out.println(superheroes.toString());
        //[Spiderman, Iron man, Hulk, Wonder Woman, Thor, Batman, Hellboy, Superman, Flash, Captain America, Ant-Man, Aquaman]
        
        
        
        
    }
}
