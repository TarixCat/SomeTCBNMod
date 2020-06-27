package me.devtarix.sometcbnmod.Init;

import net.minecraft.item.Food;

public class FoodList {
    public static Food f20 = (new Food.Builder()).hunger(20).saturation(20.2f).build();
    public static Food crysapple = (new Food.Builder()).hunger(8).saturation(10f).build();
    public static Food theStew = (new Food.Builder()).hunger(10).saturation(12f).build();
    public static Food ricrbar = (new Food.Builder()).hunger(6).saturation(12.8f).fastToEat().build();
    public static Food qazApple = (new Food.Builder()).hunger(14).saturation(17.2f).build();
    public static Food cat_cream = (new Food.Builder()).hunger(10).saturation(20f).build();
    public static Food carrot_juice = (new Food.Builder().hunger(8).saturation(15f).build());
}
