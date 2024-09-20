package net.winston.malpracticemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.winston.malpracticemod.Malpracticemod;
import net.winston.malpracticemod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Malpracticemod.MOD_ID);

    //This thingy is what adds my own tab in the creative menu. Want to add more items? Just Ctrl D the last output accept line and change the ID
    public static final RegistryObject<CreativeModeTab> MALPRACTICE_TAB = CREATIVE_MODE_TABS.register("malpractice_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.Raw_Opiods.get()))
                    .title(Component.translatable("creativetab.malpractice_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.Raw_Opiods.get());
                        output.accept(Moditems.Refined_Opiods.get());

                        output.accept(ModBlocks.Opiod_Block.get());
                        output.accept(ModBlocks.Refined_Opiod_Block.get());

                    })

                    .build());

    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
