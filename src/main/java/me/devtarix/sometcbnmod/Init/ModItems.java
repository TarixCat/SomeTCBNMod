package me.devtarix.sometcbnmod.Init;

import me.devtarix.sometcbnmod.Init.FoodList;
import me.devtarix.sometcbnmod.SomeTCBNMod;
import me.devtarix.sometcbnmod.Util.ModArmourTiers;
import me.devtarix.sometcbnmod.Util.ModItemTiers;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SomeTCBNMod.MODID);

    //Items Go Here
    public static final RegistryObject<Item> TCBN_LOGO = ITEMS.register("tcbn_logo", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance).maxStackSize(1)));
    public static final RegistryObject<Item> OOF = ITEMS.register("oof", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> POGCHAMP = ITEMS.register("pogchamp", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> TINY_IRON_DUST = ITEMS.register("tiny_iron_dust", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance).maxStackSize(63)));
    public static final RegistryObject<Item> BETHRA_INGOT = ITEMS.register("bethra_ingot", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> NOTUS_INGOT = ITEMS.register("notus_ingot", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> NOTUS_DUST = ITEMS.register("notus_dust", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> BETHRA_DUST = ITEMS.register("bethra_dust", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> TARIXCAT = ITEMS.register("tarixcat", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> DEVTARIX = ITEMS.register("devtarix", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> ENHANCED_NOTUS_INGOT = ITEMS.register("enhanced_notus_ingot", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> QAZARITE_DUST = ITEMS.register("qazarite_dust", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> QAZARITE_INGOT = ITEMS.register("qazarite_ingot", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> QAZARITE_CRYSTAL = ITEMS.register("qazarite_crystal", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> CRYSTAL_CATALYST = ITEMS.register("crystal_catalyst", () -> new Item(new Item.Properties().group(ModGroup.ModItemGroup.instance)));

    //ToolItems Go Here
    public static final RegistryObject<PickaxeItem> EARTH_BREAKER = ITEMS.register("earth_breaker", () -> new PickaxeItem(ModItemTiers.TIERNINE, 10, 2.0f, new Item.Properties().group(ModGroup.ModItemGroup.instance).maxStackSize(1)));

    //ArmourItems Go Here
    public static final RegistryObject<ArmorItem> TEST_BOOTS = ITEMS.register("test_boots", () -> new ArmorItem(ModArmourTiers.TEST, EquipmentSlotType.FEET, new Item.Properties().group(ModGroup.ModItemGroup.instance)));

    //FoodItem's Go Here
    public static final RegistryObject<Item> APPLEBEES = ITEMS.register("applebees", () -> new Item(new Item.Properties().food(FoodList.f20).group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> THESTEW = ITEMS.register("thestew", () -> new Item(new Item.Properties().food(FoodList.theStew).group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> CRYSTAL_APPLE = ITEMS.register("crystal_apple", () -> new Item(new Item.Properties().food(FoodList.crysapple).group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> RICECRISPYBAR = ITEMS.register("ricecrispybar", () -> new Item(new Item.Properties().food(FoodList.ricrbar).group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> QAZARITE_APPLE = ITEMS.register("qazarite_apple", () -> new Item(new Item.Properties().food(FoodList.qazApple).group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> CAT_CREAM = ITEMS.register("cat_cream", () -> new Item(new Item.Properties().food(FoodList.cat_cream).group(ModGroup.ModItemGroup.instance)));

    //BlockItem's Go Here
    public static final RegistryObject<Item> BETHRA_ORE = ITEMS.register("bethra_ore", () -> new BlockItem(ModBlocks.BETHRA_ORE.get(), new Item.Properties().group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> NOTUS_ORE = ITEMS.register("notus_ore", () -> new BlockItem(ModBlocks.NOTUS_ORE.get(), new Item.Properties().group(ModGroup.ModItemGroup.instance)));
    public static final RegistryObject<Item> QAZARITE_ORE = ITEMS.register("qazarite_ore", () -> new BlockItem(ModBlocks.QAZARITE_ORE.get(), new Item.Properties().group(ModGroup.ModItemGroup.instance)));
}
