package com.example.clockworkrewound.datagen;

import com.example.clockworkrewound.clockworkrewound;
import com.example.clockworkrewound.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.common.data.LanguageProvider;

public class CRLanguageProvider extends LanguageProvider {
    public CRLanguageProvider(DataGenerator gen, String locale) {
        super(gen, clockworkrewound.MODID, locale);
    }

    @Override
    protected void addTranslations(){
        add("itemGroup." + "clockworkrewound", "Clockwork Phase: Rewound");
        add(Registration.GEARBLOCK_ITEM.get(), "Gear Block");

        add(Registration.RAW_BRASS.get(), "Raw Brass");
        add(Registration.BRASS_INGOT.get(), "Brass Ingot");
    }
}
