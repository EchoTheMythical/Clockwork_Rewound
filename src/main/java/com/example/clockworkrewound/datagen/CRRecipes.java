package com.example.clockworkrewound.datagen;

import com.example.clockworkrewound.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class CRRecipes extends RecipeProvider {
    public CRRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer){

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_BRASS.get()),
                        Registration.BRASS_INGOT.get(), 0.0f, 100)
                .unlockedBy("has_chunk", has(Registration.RAW_BRASS.get()))
                .save(consumer);

        //ShapelessRecipeBuilder builder = ShapelessRecipeBuilder.shapeless(Registration.RAW_BRASS.get())
                //.requires(Ingredient.of(Registration.BRASS_INGOT.get()))
               // .unlockedBy("has_iron", has(Items.RAW_IRON))
                //.save (consumer);



    }
}
