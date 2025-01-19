package net.teamsolar.simplest_copper_gear.item;

import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.Tags;
import net.teamsolar.simplest_copper_gear.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class ModToolTiers {
    /*public static final Tier COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(1, 190, 5.0F, 1.5F, 10,
                    ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(SimplestCopperGear.MODID, "copper"), List.of(Tiers.STONE), List.of(Tiers.IRON));
     */
    public static final Tier COPPER = new SimpleTier(
            ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL,
            // Durability
            190,
            // Mining speed
            5.0F,
            // Attack damage bonus
            1.5F,
            // Enchantability (see also ModArmorMaterials)
            10,
            () -> Ingredient.of(Tags.Items.INGOTS_COPPER)
    );
}