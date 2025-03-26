package de.raphael.item;

import de.raphael.HeirsOfTheNight;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup HEIRS_OF_THE_NIGHT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HeirsOfTheNight.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.VAMALIA_RUBY))
                    .displayName(Text.translatable("itemgroup.heirs-of-the-night.item-group-items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.VAMALIA_RUBY);
                        entries.add(ModItems.TOVA_RUBY);
                        entries.add(ModItems.PYRAS_RUBY);
                        entries.add(ModItems.CAMINADA_RUBY);
                        entries.add(ModItems.BELOV_RUBY);
                        entries.add(ModItems.DRACAS_RUBY);
                        entries.add(ModItems.UPIRY_RUBY);
                        entries.add(ModItems.LYCANA_RUBY);
                        entries.add(ModItems.VIKLA_RUBY);
                        entries.add(ModItems.ARRUFAT_RUBY);
                        entries.add(ModItems.VYRAD_RUBY);
                        entries.add(ModItems.GRIMUR_RUBY);
                        entries.add(ModItems.NOSFERAS_RUBY);
                    }).build());


    public static void registerItemGroups() {
        HeirsOfTheNight.LOGGER.info("Registering Item Groups for " + HeirsOfTheNight.MOD_ID);
    }
}
