package com.cout970.magneticraft.api.registries.machines.sifter;

import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by cout970 on 24/08/2016.
 */
public interface ISifterRecipeManager {

    /**
     * Retrieves the first recipe that matches the given input
     *
     * @param input the input to check the recipes
     * @return the recipes that matches the input or null if none matches the input
     */
    ISifterRecipe findRecipe(ItemStack input);

    /**
     * The list with all registered recipes
     */
    List<ISifterRecipe> getRecipes();

    /**
     * Register a recipe if is not already registered
     *
     * @param recipe The recipe to register
     * @return if the registration has ended successfully
     */
    boolean registerRecipe(ISifterRecipe recipe);

    /**
     * Creates a default recipe
     *
     * @param input     the input stack
     * @param primary   the output stack that is always returned by the recipe
     * @param secondary a pair containing the secondary output and the probability of generating it
     * @param tertiary  a pair containing the tertiary output and the probability of generating it
     * @param duration  Number of ticks for one crafting operation
     * @param oreDict   if ore dictionary should be used to check the inputs
     * @return the new recipe
     */
    ISifterRecipe createRecipe(ItemStack input, ItemStack primary, ItemStack secondary, float secondaryChance, ItemStack tertiary, float tertiaryChance, float duration, boolean oreDict);
}
