package me.devtarix.sometcbnmod.Init;

import me.devtarix.sometcbnmod.SomeTCBNMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class    ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, SomeTCBNMod.MODID);

    //Normal Blocks Here
    public static final RegistryObject<Block> BETHRA_ORE = BLOCKS.register("bethra_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(7,3).harvestLevel(2).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> NOTUS_ORE = BLOCKS.register("notus_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(25,7).harvestLevel(3).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> QAZARITE_ORE = BLOCKS.register("qazarite_ore", ()-> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(30).harvestLevel(8).harvestTool(ToolType.PICKAXE)));
}
