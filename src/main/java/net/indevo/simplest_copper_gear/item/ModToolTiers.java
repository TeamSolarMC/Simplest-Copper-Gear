package net.indevo.simplest_copper_gear.item;


import net.indevo.simplest_copper_gear.SimplestCopperGear;
import net.indevo.simplest_copper_gear.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(1, 190, 5.0F, 1.5F, 10,
                    ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(SimplestCopperGear.MOD_ID, "copper"), List.of(Tiers.STONE), List.of());

}
