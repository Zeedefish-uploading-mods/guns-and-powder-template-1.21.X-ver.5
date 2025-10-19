package zeed.gunsandpowder.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import zeed.gunsandpowder.GunsAndPowder;

public class ModItems {

    public static final Item REVOLVER = registerItem("revolver", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(GunsAndPowder.MOD_ID,name), item);
    }

    public static void registerModItems() {
        GunsAndPowder.LOGGER.info("Registering Mod Items for"+ GunsAndPowder.MOD_ID);
    }
}
