package net.indevo.simplest_copper_gear.item;

import net.indevo.simplest_copper_gear.SimplestCopperGear;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimplestCopperGear.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SIMPLEST_COPPER_GEAR_TAB = CREATIVE_MODE_TABS.register("simplest_copper_gear_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COPPER_PICKAXE.get()))  //TODO
                    .title(Component.translatable("creativetab.simplest_copper_gear_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.COPPER_SWORD.get());
                        pOutput.accept(ModItems.COPPER_PICKAXE.get());
                        pOutput.accept(ModItems.COPPER_SHOVEL.get());
                        pOutput.accept(ModItems.COPPER_AXE.get());
                        pOutput.accept(ModItems.COPPER_HOE.get());

                        pOutput.accept(ModItems.COPPER_HELMET.get());
                        pOutput.accept(ModItems.COPPER_CHESTPLATE.get());
                        pOutput.accept(ModItems.COPPER_LEGGINGS.get());
                        pOutput.accept(ModItems.COPPER_BOOTS.get());
                    }))
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
