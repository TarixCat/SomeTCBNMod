package me.devtarix.sometcbnmod.Init;

import me.devtarix.sometcbnmod.Util.ModItemTiers;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModGroup {
    public static class MainModItemGroup extends ItemGroup {
        public static final ItemGroup instance = new MainModItemGroup(ItemGroup.GROUPS.length, "sometcbnmodmain");

        private MainModItemGroup(int index, String label) {
            super(index, label);
        }

        @SuppressWarnings("NullableProblems")
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.NOTUS_ORE.get().asItem());
        }
    }

    public static class LModItemGroup extends ItemGroup {
        public static final ItemGroup instance = new LModItemGroup(ItemGroup.GROUPS.length, "sometcbnmodl");

        private LModItemGroup(int index, String label) {
            super(index, label);
        }

        @SuppressWarnings("NullableProblems")
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.CRYSTAL_APPLE.get().asItem());
        }
    }

    public static class TempModItemGroup extends ItemGroup {
        public static final ItemGroup instance = new TempModItemGroup(ItemGroup.GROUPS.length, "sometcbnmodtemp");

        private TempModItemGroup(int index, String label) {
            super(index, label);
        }

        @SuppressWarnings("NullableProblems")
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.THESTEW.get().asItem());
        }
    }
}
