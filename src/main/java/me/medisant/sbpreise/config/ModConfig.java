package me.medisant.sbpreise.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

@Config(name = "sbpreise")
public class ModConfig implements ConfigData {

    @ConfigEntry.Gui.Excluded
    public static ModConfig INSTANCE;

    public String api_url = "https://sbpreise.de/api/all.php";
    public double widthDivisor = 67d;
    public double heigthDivisor = 67d;
    public int absoluteWidth = 38;
    public int absoluteHeigth = 21;
    public boolean useAbsoluteGuiSize = false;

    public static void init() {
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
        INSTANCE = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }

}
