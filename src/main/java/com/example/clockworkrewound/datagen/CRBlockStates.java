package com.example.clockworkrewound.datagen;

import com.example.clockworkrewound.clockworkrewound;
import com.example.clockworkrewound.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CRBlockStates extends BlockStateProvider {
    public CRBlockStates(DataGenerator generator, ExistingFileHelper helper) {super(generator, clockworkrewound.MODID, helper);}

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.GEARBLOCK.get());
    }
}
