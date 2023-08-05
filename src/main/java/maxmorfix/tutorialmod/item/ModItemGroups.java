package maxmorfix.tutorialmod.item;

import maxmorfix.tutorialmod.TutorialMod;
import maxmorfix.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "vovalox"),
            FabricItemGroup.builder().displayName(Text
                    .translatable("itemgroup.mod"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.VOVALOX);

                        entries.add(Items.DIAMOND);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.TITOZHE_BLOCK);
                    }
            ).build());

    public static void registerGroups() {

        TutorialMod.LOGGER.info("Registering item groups for " + TutorialMod.MOD_ID);

    }

}
