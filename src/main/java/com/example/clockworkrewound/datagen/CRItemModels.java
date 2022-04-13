package com.example.clockworkrewound.datagen;

import com.example.clockworkrewound.clockworkrewound;
import com.example.clockworkrewound.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class CRItemModels extends ItemModelProvider {

    public CRItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, clockworkrewound.MODID, existingFileHelper);
    }

    @Override
    protected  void registerModels() {
        withExistingParent(Registration.GEARBLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/gearblock"));

        singleTexture(Registration.RAW_BRASS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/raw_brass"));
        singleTexture(Registration.BRASS_INGOT.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/brass_ingot"));
    }
}
