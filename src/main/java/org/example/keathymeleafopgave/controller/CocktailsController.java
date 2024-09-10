package org.example.keathymeleafopgave.controller;

import org.example.keathymeleafopgave.model.Cocktail;
import org.example.keathymeleafopgave.service.CocktailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class CocktailsController {

    private CocktailService cocktailService  = new CocktailService();

    @GetMapping("")
    public String getALlCocktails(Model model){
        List<Cocktail> cocktails = cocktailService.getAllCocktails();
        model.addAttribute("cocktails", cocktails);
        return "allCocktails";
    }

    @GetMapping("/search")
    public String searchByIngridient(@RequestParam("ingredient") String ingredient, Model model){
        List<Cocktail> cocktail = cocktailService.getCocktailByIngredient(ingredient);
        model.addAttribute("cocktail", cocktail);
        model.addAttribute("ingredient", ingredient);
        return "search";

    }
}
