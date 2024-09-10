package org.example.keathymeleafopgave.service;

import org.example.keathymeleafopgave.model.Cocktail;
import org.example.keathymeleafopgave.repo.CocktailRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocktailService {
    private CocktailRepo cocktailRepo = new CocktailRepo();

    public List<Cocktail> getAllCocktails(){
        return cocktailRepo.getAllCocktails();
    }

    public List<Cocktail> getCocktailByIngredient (String ingredient){
        return cocktailRepo.getCocktailByIngredient(ingredient);
    }
}
