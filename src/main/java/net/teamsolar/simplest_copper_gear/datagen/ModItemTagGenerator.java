package net.teamsolar.simplest_copper_gear.datagen;

import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.teamsolar.simplest_copper_gear.SimplestCopperGear;
import net.teamsolar.simplest_copper_gear.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, SimplestCopperGear.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COPPER_HELMET.get(),
                        ModItems.COPPER_CHESTPLATE.get(),
                        ModItems.COPPER_LEGGINGS.get(),
                        ModItems.COPPER_BOOTS.get());
        this.tag(ItemTags.SWORDS)
                .add(ModItems.COPPER_SWORD.get());
        this.tag(ItemTags.PICKAXES)
                .add(ModItems.COPPER_PICKAXE.get());
        this.tag(ItemTags.SHOVELS)
                .add(ModItems.COPPER_SHOVEL.get());
        this.tag(ItemTags.AXES)
                .add(ModItems.COPPER_AXE.get());
        this.tag(ItemTags.HOES)
                .add(ModItems.COPPER_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COPPER_HELMET.get())
                .add(ModItems.COPPER_CHESTPLATE.get())
                .add(ModItems.COPPER_LEGGINGS.get())
                .add(ModItems.COPPER_BOOTS.get());
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
