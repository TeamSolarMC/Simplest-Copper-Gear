package net.teamsolar.simplest_copper_gear.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.teamsolar.simplest_copper_gear.SimplestCopperGear;
import net.teamsolar.simplest_copper_gear.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper ){
        super(output, lookupProvider, SimplestCopperGear.MODID, existingFileHelper);
    }

    // ?
    /*private static TagKey<Block> create(String p_203847_) {
        return TagKey.create(Registries.BLOCK, new ResourceLocation(p_203847_));
    }*/

    @Override
    protected void addTags(HolderLookup.Provider provider){
        // make copper tools only able to mine blocks that stone tools can also mine
        this.tag(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL).addTag(BlockTags.INCORRECT_FOR_STONE_TOOL);
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}