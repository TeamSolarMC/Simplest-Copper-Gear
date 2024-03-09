package net.indevo.simplest_copper_gear.datagen;

import net.indevo.simplest_copper_gear.SimplestCopperGear;
import net.indevo.simplest_copper_gear.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SimplestCopperGear.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(ModItems.COPPER_SWORD);
        handheldItem(ModItems.COPPER_PICKAXE);
        handheldItem(ModItems.COPPER_SHOVEL);
        handheldItem(ModItems.COPPER_AXE);
        handheldItem(ModItems.COPPER_HOE);

//        simpleItem(ModItems.COPPER_HELMET);
//        simpleItem(ModItems.COPPER_CHESTPLATE);
//        simpleItem(ModItems.COPPER_LEGGINGS);
//        simpleItem(ModItems.COPPER_BOOTS);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SimplestCopperGear.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(SimplestCopperGear.MOD_ID, "item/" + item.getId().getPath()));
    }
}
