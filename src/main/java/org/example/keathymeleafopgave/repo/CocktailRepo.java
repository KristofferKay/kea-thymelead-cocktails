package org.example.keathymeleafopgave.repo;

import org.example.keathymeleafopgave.model.Cocktail;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CocktailRepo {
    private final List<Cocktail> cocktailList = new ArrayList<>();

    public CocktailRepo() {
        populate();
    }

    public void populate() {
        cocktailList.add(new Cocktail("Mojito", "White Rum, Mint Leaves, Lime Juice, Sugar, Soda Water"));
        cocktailList.add(new Cocktail("Margarita", "Tequila, Triple Sec, Lime Juice, Salt, Mig"));
        cocktailList.add(new Cocktail("Old Fashioned", "Bourbon, Sugar, Angostura Bitters, Orange Peel, Ice"));
        cocktailList.add(new Cocktail("Pina Colada", "White Rum, Coconut Cream, Pineapple Juice, Ice, Pineapple Slice"));
    }

    public List<Cocktail> getAllCocktails(){
        return cocktailList;
    }

    public List<Cocktail> getCocktailByIngredient(String ingredient){
        List<Cocktail> temp = new ArrayList<>();
        for (Cocktail c : cocktailList) {
            if (c.getIngredients().toLowerCase().contains(ingredient.toLowerCase())) {
                temp.add(c);
            }
        }
        return temp;
    }
}
