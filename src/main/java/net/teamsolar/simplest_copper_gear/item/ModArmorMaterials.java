package net.teamsolar.simplest_copper_gear.item;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.teamsolar.simplest_copper_gear.SimplestCopperGear;

import java.util.EnumMap;
import java.util.List;

public class ModArmorMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, SimplestCopperGear.MODID);
    public static final Holder<ArmorMaterial> COPPER =
            ARMOR_MATERIALS.register("copper", () -> new ArmorMaterial(
            // Determines the defense value of this armor material, depending on what armor piece it is.
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 1);
                map.put(ArmorItem.Type.BODY, 4);
            }),
            // Determines the enchantability of the tier. This represents how good the enchantments on this armor will be.
            12,
            // Determines the sound played when equipping this armor.
            // This is wrapped with a Holder.
            SoundEvents.ARMOR_EQUIP_IRON,
            // Determines the repair item for this armor.
            () -> Ingredient.of(Tags.Items.INGOTS_COPPER),
            // Determines the texture locations of the armor to apply when rendering
            // This can also be specified by overriding 'IItemExtension#getArmorTexture' on your item if the armor texture needs to be more dynamic
            List.of(
                // Creates a new armor texture that will be located at:
                // - 'assets/mod_id/textures/models/armor/copper_layer_1.png' for the outer texture
                // - 'assets/mod_id/textures/models/armor/copper_layer_2.png' for the inner texture (only legs)
                new ArmorMaterial.Layer(
                    ResourceLocation.fromNamespaceAndPath(SimplestCopperGear.MODID, "copper")
                )
            ),
            // Toughness value
            0,
            // Knockback resistance
            0
        )
    );

    public static void register(IEventBus eventBus) {
        ARMOR_MATERIALS.register(eventBus);
    }
}
