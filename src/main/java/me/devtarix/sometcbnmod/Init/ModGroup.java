package me.devtarix.sometcbnmod.Init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModGroup {
    public static class ModItemGroup extends ItemGroup {
        public static final ItemGroup instance = new ModItemGroup(ItemGroup.GROUPS.length, "sometcbnmod");

        private ModItemGroup(int index, String label) {
            super(index, label);
        }

        @SuppressWarnings("NullableProblems")
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.NOTUS_ORE.get().asItem());
        }
    }
}
