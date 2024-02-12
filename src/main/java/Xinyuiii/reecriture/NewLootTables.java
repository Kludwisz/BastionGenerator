package Xinyuiii.BastionGenerator.reecriture;

import com.seedfinding.mcfeature.loot.LootPool;
import com.seedfinding.mcfeature.loot.LootTable;
import com.seedfinding.mcfeature.loot.entry.EmptyEntry;
import com.seedfinding.mcfeature.loot.entry.ItemEntry;
import com.seedfinding.mcfeature.loot.function.ApplyDamageFunction;
import com.seedfinding.mcfeature.loot.function.EnchantRandomlyFunction;
import com.seedfinding.mcfeature.loot.function.SetCountFunction;
import com.seedfinding.mcfeature.loot.item.Items;
import com.seedfinding.mcfeature.loot.roll.ConstantRoll;
import com.seedfinding.mcfeature.loot.roll.UniformRoll;

public class NewLootTables {
    // For version 1.16.0,1.16.1
    public static final LootTable BASTION_BRIDGE_CHEST_1_16_0 = new LootTable(
            new LootPool(new ConstantRoll(1),
                    new ItemEntry(Items.LODESTONE)),
            new LootPool(new UniformRoll(1.0F, 2.0F),
                    new ItemEntry(Items.CROSSBOW).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.CROSSBOW).apply(version)),
                    new ItemEntry(Items.SPECTRAL_ARROW).apply(version -> SetCountFunction.uniform(2.0F, 12.0F)),
                    new ItemEntry(Items.GILDED_BLACKSTONE).apply(version -> SetCountFunction.uniform(5.0F, 8.0F)),
                    new ItemEntry(Items.CRYING_OBSIDIAN).apply(version -> SetCountFunction.uniform(3.0F, 8.0F)),
                    new ItemEntry(Items.GOLD_BLOCK),
                    new ItemEntry(Items.GOLD_INGOT).apply(version -> SetCountFunction.uniform(2.0F, 8.0F)),
                    new ItemEntry(Items.IRON_INGOT).apply(version -> SetCountFunction.uniform(2.0F, 8.0F)),
                    new ItemEntry(Items.GOLDEN_SWORD),
                    new ItemEntry(Items.GOLDEN_CHESTPLATE).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_CHESTPLATE).apply(version)),
                    new ItemEntry(Items.GOLDEN_HELMET).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_HELMET).apply(version)),
                    new ItemEntry(Items.GOLDEN_LEGGINGS).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_LEGGINGS).apply(version)),
                    new ItemEntry(Items.GOLDEN_BOOTS).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_BOOTS).apply(version))),
            new LootPool(new UniformRoll(2.0F, 4.0F),
                    new ItemEntry(Items.STRING).apply(version -> SetCountFunction.uniform(1.0F, 6.0F)),
                    new ItemEntry(Items.LEATHER).apply(version -> SetCountFunction.uniform(1.0F, 3.0F)),
                    new ItemEntry(Items.ARROW).apply(version -> SetCountFunction.uniform(5.0F, 17.0F)),
                    new ItemEntry(Items.IRON_NUGGET).apply(version -> SetCountFunction.uniform(2.0F, 6.0F)),
                    new ItemEntry(Items.GOLD_NUGGET).apply(version -> SetCountFunction.uniform(2.0F, 6.0F)))
    );

    public static final LootTable BASTION_HOGLIN_STABLE_CHEST_1_16_0 = new LootTable(
            new LootPool(new ConstantRoll(1),
                    new ItemEntry(Items.DIAMOND_SHOVEL, 5).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_SHOVEL).apply(version)),
                    new ItemEntry(Items.NETHERITE_SCRAP, 2),
                    new ItemEntry(Items.ANCIENT_DEBRIS, 3),
                    new ItemEntry(Items.SADDLE, 10),
                    new ItemEntry(Items.GOLD_BLOCK, 25).apply(version -> SetCountFunction.uniform(2.0F, 4.0F)),
                    new ItemEntry(Items.GOLDEN_HOE, 15).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_HOE).apply(version)),
                    new EmptyEntry(45)),
            new LootPool(new UniformRoll(3.0F, 4.0F),
                    new ItemEntry(Items.GLOWSTONE).apply(version -> SetCountFunction.uniform(1.0F, 5.0F)),
                    new ItemEntry(Items.GILDED_BLACKSTONE).apply(version -> SetCountFunction.uniform(1.0F, 5.0F)),
                    new ItemEntry(Items.SOUL_SAND).apply(version -> SetCountFunction.uniform(2.0F, 7.0F)),
                    new ItemEntry(Items.CRIMSON_NYLIUM).apply(version -> SetCountFunction.uniform(2.0F, 7.0F)),
                    new ItemEntry(Items.GOLD_NUGGET).apply(version -> SetCountFunction.uniform(2.0F, 8.0F)),
                    new ItemEntry(Items.LEATHER).apply(version -> SetCountFunction.uniform(1.0F, 3.0F)),
                    new ItemEntry(Items.ARROW).apply(version -> SetCountFunction.uniform(5.0F, 17.0F)),
                    new ItemEntry(Items.STRING).apply(version -> SetCountFunction.uniform(3.0F, 8.0F)),
                    new ItemEntry(Items.PORKCHOP).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
                    new ItemEntry(Items.COOKED_PORKCHOP).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
                    new ItemEntry(Items.CRIMSON_FUNGUS).apply(version -> SetCountFunction.uniform(2.0F, 7.0F)),
                    new ItemEntry(Items.CRIMSON_ROOTS).apply(version -> SetCountFunction.uniform(2.0F, 7.0F)))
    );

    public static final LootTable BASTION_OTHER_CHEST_1_16_0 = new LootTable(
            new LootPool(new ConstantRoll(1),
                    new ItemEntry(Items.CROSSBOW, 12).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.CROSSBOW).apply(version)),
                    new ItemEntry(Items.ANCIENT_DEBRIS, 2),
                    new ItemEntry(Items.NETHERITE_SCRAP, 2),
                    new ItemEntry(Items.SPECTRAL_ARROW, 16).apply(version -> SetCountFunction.uniform(2.0F, 15.0F)),
                    new ItemEntry(Items.PIGLIN_BANNER_PATTERN, 5),
                    new ItemEntry(Items.MUSIC_DISC_PIGSTEP, 3),
                    new ItemEntry(Items.ENCHANTED_BOOK, 10).apply(version -> new NewEnchantRandomlyFunction()),
                    new EmptyEntry(50)),
            new LootPool(new ConstantRoll(2),
                    new ItemEntry(Items.GOLDEN_BOOTS).apply(version -> new NewEnchantRandomlyFunction()),
                    new ItemEntry(Items.GOLD_BLOCK),
                    new ItemEntry(Items.CROSSBOW),
                    new ItemEntry(Items.GOLD_INGOT).apply(version -> SetCountFunction.uniform(1.0F, 6.0F)),
                    new ItemEntry(Items.IRON_INGOT).apply(version -> SetCountFunction.uniform(1.0F, 6.0F)),
                    new ItemEntry(Items.GOLDEN_SWORD),
                    new ItemEntry(Items.GOLDEN_CHESTPLATE),
                    new ItemEntry(Items.GOLDEN_HELMET),
                    new ItemEntry(Items.GOLDEN_LEGGINGS),
                    new ItemEntry(Items.GOLDEN_BOOTS),
                    new EmptyEntry(2)),
            new LootPool(new UniformRoll(3.0F, 5.0F),
                    new ItemEntry(Items.CRYING_OBSIDIAN).apply(version -> SetCountFunction.uniform(1.0F, 5.0F)),
                    new ItemEntry(Items.GILDED_BLACKSTONE).apply(version -> SetCountFunction.uniform(1.0F, 5.0F)),
                    new ItemEntry(Items.CHAIN).apply(version -> SetCountFunction.uniform(2.0F, 10.0F)),
                    new ItemEntry(Items.MAGMA_CREAM).apply(version -> SetCountFunction.uniform(2.0F, 6.0F)),
                    new ItemEntry(Items.BONE_BLOCK).apply(version -> SetCountFunction.uniform(3.0F, 6.0F)),
                    new ItemEntry(Items.IRON_NUGGET).apply(version -> SetCountFunction.uniform(2.0F, 8.0F)),
                    new ItemEntry(Items.OBSIDIAN).apply(version -> SetCountFunction.uniform(4.0F, 6.0F)),
                    new ItemEntry(Items.GOLD_NUGGET).apply(version -> SetCountFunction.uniform(2.0F, 8.0F)),
                    new ItemEntry(Items.STRING).apply(version -> SetCountFunction.uniform(4.0F, 6.0F)),
                    new ItemEntry(Items.ARROW, 2).apply(version -> SetCountFunction.uniform(5.0F, 17.0F)))
    );

    public static final LootTable BASTION_TREASURE_CHEST_1_16_0 = new LootTable(
            new LootPool(new UniformRoll(1.0F, 2.0F),
                    new ItemEntry(Items.NETHERITE_INGOT, 10),
                    new ItemEntry(Items.ANCIENT_DEBRIS, 14),
                    new ItemEntry(Items.NETHERITE_SCRAP, 10),
                    new ItemEntry(Items.ANCIENT_DEBRIS).apply(version -> SetCountFunction.constant(2)),
                    new ItemEntry(Items.DIAMOND_SWORD, 10).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_SWORD).apply(version)),
                    new ItemEntry(Items.DIAMOND_CHESTPLATE, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_CHESTPLATE).apply(version)),
                    new ItemEntry(Items.DIAMOND_HELMET, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_HELMET).apply(version)),
                    new ItemEntry(Items.DIAMOND_LEGGINGS, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_LEGGINGS).apply(version)),
                    new ItemEntry(Items.DIAMOND_BOOTS, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_BOOTS).apply(version)),
                    new ItemEntry(Items.DIAMOND_SWORD, 6).apply(version -> new ApplyDamageFunction()),
                    new ItemEntry(Items.DIAMOND_CHESTPLATE, 5).apply(version -> new ApplyDamageFunction()),
                    new ItemEntry(Items.DIAMOND_HELMET, 5).apply(version -> new ApplyDamageFunction()),
                    new ItemEntry(Items.DIAMOND_BOOTS, 5).apply(version -> new ApplyDamageFunction()),
                    new ItemEntry(Items.DIAMOND_LEGGINGS, 5).apply(version -> new ApplyDamageFunction()),
                    new ItemEntry(Items.DIAMOND, 5).apply(version -> SetCountFunction.uniform(1.0F, 3.0F))),
            new LootPool(new UniformRoll(2.0F, 4.0F),
                    new ItemEntry(Items.SPECTRAL_ARROW).apply(version -> SetCountFunction.uniform(5.0F, 21.0F)),
                    new ItemEntry(Items.GOLD_BLOCK).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
                    new ItemEntry(Items.GOLD_INGOT).apply(version -> SetCountFunction.uniform(3.0F, 9.0F)),
                    new ItemEntry(Items.IRON_INGOT).apply(version -> SetCountFunction.uniform(3.0F, 9.0F)),
                    new ItemEntry(Items.CRYING_OBSIDIAN).apply(version -> SetCountFunction.uniform(1.0F, 5.0F)),
                    new ItemEntry(Items.QUARTZ).apply(version -> SetCountFunction.uniform(8.0F, 23.0F)),
                    new ItemEntry(Items.GILDED_BLACKSTONE).apply(version -> SetCountFunction.uniform(1.0F, 5.0F)),
                    new ItemEntry(Items.MAGMA_CREAM).apply(version -> SetCountFunction.uniform(2.0F, 8.0F)),
                    new ItemEntry(Items.IRON_NUGGET).apply(version -> SetCountFunction.uniform(8.0F, 16.0F)))
    );
    // For version 1.16.2 to 1.19.4
    public static final LootTable BASTION_BRIDGE_CHEST_1_16_2 = new LootTable(
            new LootPool(new ConstantRoll(1),
                    new ItemEntry(Items.LODESTONE)),
            new LootPool(new UniformRoll(1.0F, 2.0F),
                    new ItemEntry(Items.CROSSBOW).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.CROSSBOW).apply(version)),
                    new ItemEntry(Items.SPECTRAL_ARROW).apply(version -> SetCountFunction.uniform(10.0F, 28.0F)),
                    new ItemEntry(Items.GILDED_BLACKSTONE).apply(version -> SetCountFunction.uniform(8.0F, 12.0F)),
                    new ItemEntry(Items.CRYING_OBSIDIAN).apply(version -> SetCountFunction.uniform(3.0F, 8.0F)),
                    new ItemEntry(Items.GOLD_BLOCK),
                    new ItemEntry(Items.GOLD_INGOT).apply(version -> SetCountFunction.uniform(4.0F, 9.0F)),
                    new ItemEntry(Items.IRON_INGOT).apply(version -> SetCountFunction.uniform(4.0F, 9.0F)),
                    new ItemEntry(Items.GOLDEN_SWORD),
                    new ItemEntry(Items.GOLDEN_CHESTPLATE).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_CHESTPLATE).apply(version)),
                    new ItemEntry(Items.GOLDEN_HELMET).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_HELMET).apply(version)),
                    new ItemEntry(Items.GOLDEN_LEGGINGS).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_LEGGINGS).apply(version)),
                    new ItemEntry(Items.GOLDEN_BOOTS).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_BOOTS).apply(version)),
                    new ItemEntry(Items.GOLDEN_AXE).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_AXE).apply(version))),
            new LootPool(new UniformRoll(2.0F, 4.0F),
                    new ItemEntry(Items.STRING).apply(version -> SetCountFunction.uniform(1.0F, 6.0F)),
                    new ItemEntry(Items.LEATHER).apply(version -> SetCountFunction.uniform(1.0F, 3.0F)),
                    new ItemEntry(Items.ARROW).apply(version -> SetCountFunction.uniform(5.0F, 17.0F)),
                    new ItemEntry(Items.IRON_NUGGET).apply(version -> SetCountFunction.uniform(2.0F, 6.0F)),
                    new ItemEntry(Items.GOLD_NUGGET).apply(version -> SetCountFunction.uniform(2.0F, 6.0F)))
    );

    public static final LootTable BASTION_HOGLIN_STABLE_CHEST_1_16_2 = new LootTable(
            new LootPool(new ConstantRoll(1),
                    new ItemEntry(Items.DIAMOND_SHOVEL, 15).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_SHOVEL).apply(version)),
                    new ItemEntry(Items.DIAMOND_PICKAXE, 12).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_PICKAXE).apply(version)),
                    new ItemEntry(Items.NETHERITE_SCRAP, 8),
                    new ItemEntry(Items.ANCIENT_DEBRIS, 12),
                    new ItemEntry(Items.ANCIENT_DEBRIS, 5).apply(version -> SetCountFunction.constant(2)),
                    new ItemEntry(Items.SADDLE, 12),
                    new ItemEntry(Items.GOLD_BLOCK, 16).apply(version -> SetCountFunction.uniform(2.0F, 4.0F)),
                    new ItemEntry(Items.GOLDEN_CARROT, 10).apply(version -> SetCountFunction.uniform(8.0F, 17.0F)),
                    new ItemEntry(Items.GOLDEN_APPLE, 10)),
            new LootPool(new UniformRoll(3.0F, 4.0F),
                    new ItemEntry(Items.GOLDEN_AXE).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_AXE).apply(version)),
                    new ItemEntry(Items.CRYING_OBSIDIAN).apply(version -> SetCountFunction.uniform(1.0F, 5.0F)),
                    new ItemEntry(Items.GLOWSTONE).apply(version -> SetCountFunction.uniform(3.0F, 6.0F)),
                    new ItemEntry(Items.GILDED_BLACKSTONE).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
                    new ItemEntry(Items.SOUL_SAND).apply(version -> SetCountFunction.uniform(2.0F, 7.0F)),
                    new ItemEntry(Items.CRIMSON_NYLIUM).apply(version -> SetCountFunction.uniform(2.0F, 7.0F)),
                    new ItemEntry(Items.GOLD_NUGGET).apply(version -> SetCountFunction.uniform(2.0F, 8.0F)),
                    new ItemEntry(Items.LEATHER).apply(version -> SetCountFunction.uniform(1.0F, 3.0F)),
                    new ItemEntry(Items.ARROW).apply(version -> SetCountFunction.uniform(5.0F, 17.0F)),
                    new ItemEntry(Items.STRING).apply(version -> SetCountFunction.uniform(3.0F, 8.0F)),
                    new ItemEntry(Items.PORKCHOP).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
                    new ItemEntry(Items.COOKED_PORKCHOP).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
                    new ItemEntry(Items.CRIMSON_FUNGUS).apply(version -> SetCountFunction.uniform(2.0F, 7.0F)),
                    new ItemEntry(Items.CRIMSON_ROOTS).apply(version -> SetCountFunction.uniform(2.0F, 7.0F)))
    );

    public static final LootTable BASTION_OTHER_CHEST_1_16_2 = new LootTable(
            new LootPool(new ConstantRoll(1),
                    new ItemEntry(Items.DIAMOND_PICKAXE, 6).apply(version -> new EnchantRandomlyFunction(Items.DIAMOND_PICKAXE).apply(version)),
                    new ItemEntry(Items.DIAMOND_SHOVEL, 6),
                    new ItemEntry(Items.CROSSBOW, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.CROSSBOW).apply(version)),
                    new ItemEntry(Items.ANCIENT_DEBRIS, 12),
                    new ItemEntry(Items.NETHERITE_SCRAP, 4),
                    new ItemEntry(Items.SPECTRAL_ARROW, 10).apply(version -> SetCountFunction.uniform(10.0F, 22.0F)),
                    new ItemEntry(Items.PIGLIN_BANNER_PATTERN, 9),
                    new ItemEntry(Items.MUSIC_DISC_PIGSTEP, 5),
                    new ItemEntry(Items.GOLDEN_CARROT, 12).apply(version -> SetCountFunction.uniform(6.0F, 17.0F)),
                    new ItemEntry(Items.GOLDEN_APPLE, 9),
                    new ItemEntry(Items.ENCHANTED_BOOK, 10).apply(version -> new NewEnchantRandomlyFunction())),
            new LootPool(new ConstantRoll(2),
                    new ItemEntry(Items.IRON_SWORD, 2).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.IRON_SWORD).apply(version)),
                    new ItemEntry(Items.IRON_BLOCK, 2),
                    new ItemEntry(Items.GOLDEN_BOOTS).apply(version -> new NewEnchantRandomlyFunction()),
                    new ItemEntry(Items.GOLDEN_AXE).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_AXE).apply(version)),
                    new ItemEntry(Items.GOLD_BLOCK, 2),
                    new ItemEntry(Items.CROSSBOW),
                    new ItemEntry(Items.GOLD_INGOT, 2).apply(version -> SetCountFunction.uniform(1.0F, 6.0F)),
                    new ItemEntry(Items.IRON_INGOT, 2).apply(version -> SetCountFunction.uniform(1.0F, 6.0F)),
                    new ItemEntry(Items.GOLDEN_SWORD),
                    new ItemEntry(Items.GOLDEN_CHESTPLATE),
                    new ItemEntry(Items.GOLDEN_HELMET),
                    new ItemEntry(Items.GOLDEN_LEGGINGS),
                    new ItemEntry(Items.GOLDEN_BOOTS),
                    new ItemEntry(Items.CRYING_OBSIDIAN, 2).apply(version -> SetCountFunction.uniform(1.0F, 5.0F))),
            new LootPool(new UniformRoll(3.0F, 4.0F),
                    new ItemEntry(Items.GILDED_BLACKSTONE, 2).apply(version -> SetCountFunction.uniform(1.0F, 5.0F)),
                    new ItemEntry(Items.CHAIN).apply(version -> SetCountFunction.uniform(2.0F, 10.0F)),
                    new ItemEntry(Items.MAGMA_CREAM, 2).apply(version -> SetCountFunction.uniform(2.0F, 6.0F)),
                    new ItemEntry(Items.BONE_BLOCK).apply(version -> SetCountFunction.uniform(3.0F, 6.0F)),
                    new ItemEntry(Items.IRON_NUGGET).apply(version -> SetCountFunction.uniform(2.0F, 8.0F)),
                    new ItemEntry(Items.OBSIDIAN).apply(version -> SetCountFunction.uniform(4.0F, 6.0F)),
                    new ItemEntry(Items.GOLD_NUGGET).apply(version -> SetCountFunction.uniform(2.0F, 8.0F)),
                    new ItemEntry(Items.STRING).apply(version -> SetCountFunction.uniform(4.0F, 6.0F)),
                    new ItemEntry(Items.ARROW, 2).apply(version -> SetCountFunction.uniform(5.0F, 17.0F)),
                    new ItemEntry(Items.COOKED_PORKCHOP))
    );

    public static final LootTable BASTION_TREASURE_CHEST_1_16_2 = new LootTable(
            new LootPool(new ConstantRoll(3),
                    new ItemEntry(Items.NETHERITE_INGOT, 15),
                    new ItemEntry(Items.ANCIENT_DEBRIS, 10),
                    new ItemEntry(Items.NETHERITE_SCRAP, 8),
                    new ItemEntry(Items.ANCIENT_DEBRIS, 4).apply(version -> SetCountFunction.constant(2)),
                    new ItemEntry(Items.DIAMOND_SWORD, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_SWORD).apply(version)),
                    new ItemEntry(Items.DIAMOND_CHESTPLATE, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_CHESTPLATE).apply(version)),
                    new ItemEntry(Items.DIAMOND_HELMET, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_HELMET).apply(version)),
                    new ItemEntry(Items.DIAMOND_LEGGINGS, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_LEGGINGS).apply(version)),
                    new ItemEntry(Items.DIAMOND_BOOTS, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_BOOTS).apply(version)),
                    new ItemEntry(Items.DIAMOND_SWORD, 6),
                    new ItemEntry(Items.DIAMOND_CHESTPLATE, 5),
                    new ItemEntry(Items.DIAMOND_HELMET, 5),
                    new ItemEntry(Items.DIAMOND_BOOTS, 5),
                    new ItemEntry(Items.DIAMOND_LEGGINGS, 5),
                    new ItemEntry(Items.DIAMOND, 5).apply(version -> SetCountFunction.uniform(2.0F, 6.0F)),
                    new ItemEntry(Items.ENCHANTED_GOLDEN_APPLE, 2)),
            new LootPool(new UniformRoll(3.0F, 4.0F),
                    new ItemEntry(Items.SPECTRAL_ARROW).apply(version -> SetCountFunction.uniform(12.0F, 25.0F)),
                    new ItemEntry(Items.GOLD_BLOCK).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
                    new ItemEntry(Items.IRON_BLOCK).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
                    new ItemEntry(Items.GOLD_INGOT).apply(version -> SetCountFunction.uniform(3.0F, 9.0F)),
                    new ItemEntry(Items.IRON_INGOT).apply(version -> SetCountFunction.uniform(3.0F, 9.0F)),
                    new ItemEntry(Items.CRYING_OBSIDIAN).apply(version -> SetCountFunction.uniform(3.0F, 5.0F)),
                    new ItemEntry(Items.QUARTZ).apply(version -> SetCountFunction.uniform(8.0F, 23.0F)),
                    new ItemEntry(Items.GILDED_BLACKSTONE).apply(version -> SetCountFunction.uniform(5.0F, 15.0F)),
                    new ItemEntry(Items.MAGMA_CREAM).apply(version -> SetCountFunction.uniform(3.0F, 8.0F)))
    );
    // For version 1.20.0+
    public static final LootTable BASTION_BRIDGE_CHEST_1_20_0 = new LootTable(
            new LootPool(new ConstantRoll(1),
                    new ItemEntry(Items.LODESTONE)),
            new LootPool(new UniformRoll(1.0F, 2.0F),
                    new ItemEntry(Items.CROSSBOW).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.CROSSBOW).apply(version)),
                    new ItemEntry(Items.SPECTRAL_ARROW).apply(version -> SetCountFunction.uniform(10.0F, 28.0F)),
                    new ItemEntry(Items.GILDED_BLACKSTONE).apply(version -> SetCountFunction.uniform(8.0F, 12.0F)),
                    new ItemEntry(Items.CRYING_OBSIDIAN).apply(version -> SetCountFunction.uniform(3.0F, 8.0F)),
                    new ItemEntry(Items.GOLD_BLOCK),
                    new ItemEntry(Items.GOLD_INGOT).apply(version -> SetCountFunction.uniform(4.0F, 9.0F)),
                    new ItemEntry(Items.IRON_INGOT).apply(version -> SetCountFunction.uniform(4.0F, 9.0F)),
                    new ItemEntry(Items.GOLDEN_SWORD),
                    new ItemEntry(Items.GOLDEN_CHESTPLATE).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_CHESTPLATE).apply(version)),
                    new ItemEntry(Items.GOLDEN_HELMET).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_HELMET).apply(version)),
                    new ItemEntry(Items.GOLDEN_LEGGINGS).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_LEGGINGS).apply(version)),
                    new ItemEntry(Items.GOLDEN_BOOTS).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_BOOTS).apply(version)),
                    new ItemEntry(Items.GOLDEN_AXE).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_AXE).apply(version))),
            new LootPool(new UniformRoll(2.0F, 4.0F),
                    new ItemEntry(Items.STRING).apply(version -> SetCountFunction.uniform(1.0F, 6.0F)),
                    new ItemEntry(Items.LEATHER).apply(version -> SetCountFunction.uniform(1.0F, 3.0F)),
                    new ItemEntry(Items.ARROW).apply(version -> SetCountFunction.uniform(5.0F, 17.0F)),
                    new ItemEntry(Items.IRON_NUGGET).apply(version -> SetCountFunction.uniform(2.0F, 6.0F)),
                    new ItemEntry(Items.GOLD_NUGGET).apply(version -> SetCountFunction.uniform(2.0F, 6.0F))),
            new LootPool(new ConstantRoll(1),
                    new EmptyEntry(11),
                    new ItemEntry(NewItems.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE)),
            new LootPool(new ConstantRoll(1),
                    new EmptyEntry(9),
                    new ItemEntry(NewItems.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
    );

    public static final LootTable BASTION_HOGLIN_STABLE_CHEST_1_20_0 = new LootTable(
            new LootPool(new ConstantRoll(1),
                    new ItemEntry(Items.DIAMOND_SHOVEL, 15).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_SHOVEL).apply(version)),
                    new ItemEntry(Items.DIAMOND_PICKAXE, 12).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_PICKAXE).apply(version)),
                    new ItemEntry(Items.NETHERITE_SCRAP, 8),
                    new ItemEntry(Items.ANCIENT_DEBRIS, 12),
                    new ItemEntry(Items.ANCIENT_DEBRIS, 5).apply(version -> SetCountFunction.constant(2)),
                    new ItemEntry(Items.SADDLE, 12),
                    new ItemEntry(Items.GOLD_BLOCK, 16).apply(version -> SetCountFunction.uniform(2.0F, 4.0F)),
                    new ItemEntry(Items.GOLDEN_CARROT, 10).apply(version -> SetCountFunction.uniform(8.0F, 17.0F)),
                    new ItemEntry(Items.GOLDEN_APPLE, 10)),
            new LootPool(new UniformRoll(3.0F, 4.0F),
                    new ItemEntry(Items.GOLDEN_AXE).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_AXE).apply(version)),
                    new ItemEntry(Items.CRYING_OBSIDIAN).apply(version -> SetCountFunction.uniform(1.0F, 5.0F)),
                    new ItemEntry(Items.GLOWSTONE).apply(version -> SetCountFunction.uniform(3.0F, 6.0F)),
                    new ItemEntry(Items.GILDED_BLACKSTONE).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
                    new ItemEntry(Items.SOUL_SAND).apply(version -> SetCountFunction.uniform(2.0F, 7.0F)),
                    new ItemEntry(Items.CRIMSON_NYLIUM).apply(version -> SetCountFunction.uniform(2.0F, 7.0F)),
                    new ItemEntry(Items.GOLD_NUGGET).apply(version -> SetCountFunction.uniform(2.0F, 8.0F)),
                    new ItemEntry(Items.LEATHER).apply(version -> SetCountFunction.uniform(1.0F, 3.0F)),
                    new ItemEntry(Items.ARROW).apply(version -> SetCountFunction.uniform(5.0F, 17.0F)),
                    new ItemEntry(Items.STRING).apply(version -> SetCountFunction.uniform(3.0F, 8.0F)),
                    new ItemEntry(Items.PORKCHOP).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
                    new ItemEntry(Items.COOKED_PORKCHOP).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
                    new ItemEntry(Items.CRIMSON_FUNGUS).apply(version -> SetCountFunction.uniform(2.0F, 7.0F)),
                    new ItemEntry(Items.CRIMSON_ROOTS).apply(version -> SetCountFunction.uniform(2.0F, 7.0F))),
            new LootPool(new ConstantRoll(1),
                    new EmptyEntry(11),
                    new ItemEntry(NewItems.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE)),
            new LootPool(new ConstantRoll(1),
                    new EmptyEntry(9),
                    new ItemEntry(NewItems.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
    );

    public static final LootTable BASTION_OTHER_CHEST_1_20_0 = new LootTable(
            new LootPool(new ConstantRoll(1),
                    new ItemEntry(Items.DIAMOND_PICKAXE, 6).apply(version -> new EnchantRandomlyFunction(Items.DIAMOND_PICKAXE).apply(version)),
                    new ItemEntry(Items.DIAMOND_SHOVEL, 6),
                    new ItemEntry(Items.CROSSBOW, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.CROSSBOW).apply(version)),
                    new ItemEntry(Items.ANCIENT_DEBRIS, 12),
                    new ItemEntry(Items.NETHERITE_SCRAP, 4),
                    new ItemEntry(Items.SPECTRAL_ARROW, 10).apply(version -> SetCountFunction.uniform(10.0F, 22.0F)),
                    new ItemEntry(Items.PIGLIN_BANNER_PATTERN, 9),
                    new ItemEntry(Items.MUSIC_DISC_PIGSTEP, 5),
                    new ItemEntry(Items.GOLDEN_CARROT, 12).apply(version -> SetCountFunction.uniform(6.0F, 17.0F)),
                    new ItemEntry(Items.GOLDEN_APPLE, 9),
                    new ItemEntry(Items.ENCHANTED_BOOK, 10).apply(version -> new NewEnchantRandomlyFunction())),
            new LootPool(new ConstantRoll(2),
                    new ItemEntry(Items.IRON_SWORD, 2).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.IRON_SWORD).apply(version)),
                    new ItemEntry(Items.IRON_BLOCK, 2),
                    new ItemEntry(Items.GOLDEN_BOOTS).apply(version -> new NewEnchantRandomlyFunction()),
                    new ItemEntry(Items.GOLDEN_AXE).apply(version -> new EnchantRandomlyFunction(Items.GOLDEN_AXE).apply(version)),
                    new ItemEntry(Items.GOLD_BLOCK, 2),
                    new ItemEntry(Items.CROSSBOW),
                    new ItemEntry(Items.GOLD_INGOT, 2).apply(version -> SetCountFunction.uniform(1.0F, 6.0F)),
                    new ItemEntry(Items.IRON_INGOT, 2).apply(version -> SetCountFunction.uniform(1.0F, 6.0F)),
                    new ItemEntry(Items.GOLDEN_SWORD),
                    new ItemEntry(Items.GOLDEN_CHESTPLATE),
                    new ItemEntry(Items.GOLDEN_HELMET),
                    new ItemEntry(Items.GOLDEN_LEGGINGS),
                    new ItemEntry(Items.GOLDEN_BOOTS),
                    new ItemEntry(Items.CRYING_OBSIDIAN, 2).apply(version -> SetCountFunction.uniform(1.0F, 5.0F))),
            new LootPool(new UniformRoll(3.0F, 4.0F),
                    new ItemEntry(Items.GILDED_BLACKSTONE, 2).apply(version -> SetCountFunction.uniform(1.0F, 5.0F)),
                    new ItemEntry(Items.CHAIN).apply(version -> SetCountFunction.uniform(2.0F, 10.0F)),
                    new ItemEntry(Items.MAGMA_CREAM, 2).apply(version -> SetCountFunction.uniform(2.0F, 6.0F)),
                    new ItemEntry(Items.BONE_BLOCK).apply(version -> SetCountFunction.uniform(3.0F, 6.0F)),
                    new ItemEntry(Items.IRON_NUGGET).apply(version -> SetCountFunction.uniform(2.0F, 8.0F)),
                    new ItemEntry(Items.OBSIDIAN).apply(version -> SetCountFunction.uniform(4.0F, 6.0F)),
                    new ItemEntry(Items.GOLD_NUGGET).apply(version -> SetCountFunction.uniform(2.0F, 8.0F))),
            new LootPool(new ConstantRoll(1),
                    new EmptyEntry(11),
                    new ItemEntry(NewItems.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE)),
            new LootPool(new ConstantRoll(1),
                    new EmptyEntry(9),
                    new ItemEntry(NewItems.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
    );

    public static final LootTable BASTION_TREASURE_CHEST_1_20_0 = new LootTable(
            new LootPool(new ConstantRoll(3),
                    new ItemEntry(Items.NETHERITE_INGOT, 15),
                    new ItemEntry(Items.ANCIENT_DEBRIS, 10),
                    new ItemEntry(Items.NETHERITE_SCRAP, 8),
                    new ItemEntry(Items.ANCIENT_DEBRIS, 4).apply(version -> SetCountFunction.constant(2)),
                    new ItemEntry(Items.DIAMOND_SWORD, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_SWORD).apply(version)),
                    new ItemEntry(Items.DIAMOND_CHESTPLATE, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_CHESTPLATE).apply(version)),
                    new ItemEntry(Items.DIAMOND_HELMET, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_HELMET).apply(version)),
                    new ItemEntry(Items.DIAMOND_LEGGINGS, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_LEGGINGS).apply(version)),
                    new ItemEntry(Items.DIAMOND_BOOTS, 6).apply(version -> new ApplyDamageFunction(), version -> new EnchantRandomlyFunction(Items.DIAMOND_BOOTS).apply(version)),
                    new ItemEntry(Items.DIAMOND_SWORD, 6),
                    new ItemEntry(Items.DIAMOND_CHESTPLATE, 5),
                    new ItemEntry(Items.DIAMOND_HELMET, 5),
                    new ItemEntry(Items.DIAMOND_BOOTS, 5),
                    new ItemEntry(Items.DIAMOND_LEGGINGS, 5),
                    new ItemEntry(Items.DIAMOND, 5).apply(version -> SetCountFunction.uniform(2.0F, 6.0F)),
                    new ItemEntry(Items.ENCHANTED_GOLDEN_APPLE, 2)),
            new LootPool(new UniformRoll(3.0F, 4.0F),
                    new ItemEntry(Items.SPECTRAL_ARROW).apply(version -> SetCountFunction.uniform(12.0F, 25.0F)),
                    new ItemEntry(Items.GOLD_BLOCK).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
                    new ItemEntry(Items.IRON_BLOCK).apply(version -> SetCountFunction.uniform(2.0F, 5.0F)),
                    new ItemEntry(Items.GOLD_INGOT).apply(version -> SetCountFunction.uniform(3.0F, 9.0F)),
                    new ItemEntry(Items.IRON_INGOT).apply(version -> SetCountFunction.uniform(3.0F, 9.0F)),
                    new ItemEntry(Items.CRYING_OBSIDIAN).apply(version -> SetCountFunction.uniform(3.0F, 5.0F)),
                    new ItemEntry(Items.QUARTZ).apply(version -> SetCountFunction.uniform(8.0F, 23.0F)),
                    new ItemEntry(Items.GILDED_BLACKSTONE).apply(version -> SetCountFunction.uniform(5.0F, 15.0F)),
                    new ItemEntry(Items.MAGMA_CREAM).apply(version -> SetCountFunction.uniform(3.0F, 8.0F))),
            new LootPool(new ConstantRoll(1),
                    new EmptyEntry(11),
                    new ItemEntry(NewItems.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE)),
            new LootPool(new ConstantRoll(1),
                    new ItemEntry(NewItems.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
    );
}
