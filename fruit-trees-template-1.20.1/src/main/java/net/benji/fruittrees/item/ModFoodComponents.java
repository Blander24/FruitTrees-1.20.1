package net.benji.fruittrees.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent MANGO = new FoodComponent.Builder().hunger(1).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1.0f).build();
    public static final FoodComponent COOKED_MANGO = new FoodComponent.Builder().hunger(4).saturationModifier(2.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 300, 1), 1.0f).build();
}
