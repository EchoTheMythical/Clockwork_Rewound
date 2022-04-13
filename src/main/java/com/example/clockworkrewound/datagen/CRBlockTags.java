package com.example.clockworkrewound.datagen;

import com.example.clockworkrewound.clockworkrewound;
import com.example.clockworkrewound.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CRBlockTags extends BlockTagsProvider {
    public CRBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, clockworkrewound.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.GEARBLOCK.get());
    }

    @Override
    public String getName() {
        return "clockworkrewound Tags";
    }
}
