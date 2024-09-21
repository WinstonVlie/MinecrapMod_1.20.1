package net.winston.malpracticemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.winston.malpracticemod.Malpracticemod;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, Malpracticemod.MOD_ID);
    // A Deferred Registry is basically a list of items. We add our items to our list, and hope Forge loads them
    // From here on below, I will add items. The rest was for libraries and imports and shit

    public static final RegistryObject<Item> Raw_Opiods = ITEMS.register("raw_opiods",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Refined_Opiods = ITEMS.register("refined_opiods",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Raw_Titanium = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));
    








    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

