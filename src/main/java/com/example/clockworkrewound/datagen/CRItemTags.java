package com.example.clockworkrewound.datagen;

import com.example.clockworkrewound.clockworkrewound;
import com.example.clockworkrewound.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CRItemTags extends ItemTagsProvider {
    public CRItemTags(DataGenerator generator, CRBlockTags blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, clockworkrewound.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.INGOTS)
                .add(Registration.BRASS_INGOT.get());
    }

    @Override
    public String getName() { return  "clockworkrewound Tags"; };
}
