package net.teamsolar.simplest_copper_gear.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.teamsolar.simplest_copper_gear.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" C ")
                .define('A', Items.COPPER_INGOT)
                .define('C', Items.STICK)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE.get())
                .pattern("AAA")
                .pattern(" C ")
                .pattern(" C ")
                .define('A', Items.COPPER_INGOT)
                .define('C', Items.STICK)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL.get())
                .pattern(" A ")
                .pattern(" C ")
                .pattern(" C ")
                .define('A', Items.COPPER_INGOT)
                .define('C', Items.STICK)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_AXE.get())
                .pattern("AA ")
                .pattern("AC ")
                .pattern(" C ")
                .define('A', Items.COPPER_INGOT)
                .define('C', Items.STICK)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_HOE.get())
                .pattern("AA")
                .pattern(" C")
                .pattern(" C")
                .define('A', Items.COPPER_INGOT)
                .define('C', Items.STICK)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .define('A', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_BOOTS.get())
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .define('A', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build()))
                .save(output);
    }
}
