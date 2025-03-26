package de.raphael.item;

import de.raphael.HeirsOfTheNight;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item VAMALIA_RUBY = registerItem("vamalia_ruby", new Item(new Item.Settings().maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item TOVA_RUBY = registerItem("tova_ruby", new Item(new Item.Settings().maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item PYRAS_RUBY = registerItem("pyras_ruby", new Item(new Item.Settings().maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item CAMINADA_RUBY = registerItem("caminada_ruby", new Item(new Item.Settings().maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item BELOV_RUBY = registerItem("belov_ruby", new Item(new Item.Settings().maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item DRACAS_RUBY = registerItem("dracas_ruby", new Item(new Item.Settings().maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item UPIRY_RUBY = registerItem("upiry_ruby", new Item(new Item.Settings().maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item LYCANA_RUBY = registerItem("lycana_ruby", new Item(new Item.Settings().maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item VIKLA_RUBY = registerItem("vikla_ruby", new Item(new Item.Settings().maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item ARRUFAT_RUBY = registerItem("arrufat_ruby", new Item(new Item.Settings().maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item VYRAD_RUBY = registerItem("vyrad_ruby", new Item(new Item.Settings().maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item GRIMUR_RUBY = registerItem("grimur_ruby", new Item(new Item.Settings().maxCount(1).fireproof().rarity(Rarity.EPIC)));
    public static final Item NOSFERAS_RUBY = registerItem("nosferas_ruby", new Item(new Item.Settings().maxCount(1).fireproof().rarity(Rarity.EPIC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HeirsOfTheNight.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HeirsOfTheNight.LOGGER.info("Registering Items for " + HeirsOfTheNight.MOD_ID);
    }
}
