package net.winston.malpracticemod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.winston.malpracticemod.Malpracticemod;
import net.winston.malpracticemod.item.Moditems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Malpracticemod.MOD_ID);

    public static final RegistryObject<Block> Opiod_Block = registerBlock("opiod_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MELON))); // Sidenote here: I copied a melon block here but I can also create my oen with .of and not copy
    // I can still overwrite things, if I want a different sound I add .soud AFTER the MELON) or some shit like that
    public static final RegistryObject<Block> Refined_Opiod_Block = registerBlock("refined_opiod_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MELON)));

    public static final RegistryObject<Block> Titanium_Ore = registerBlock("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> Titanium_Block = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));


// Second line registers the block. Third line registers the blockitem, last line returns the block
    private static <T extends Block> RegistryObject<T> registerBlock (String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    // This lines below associate an item to a corresponding block
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
