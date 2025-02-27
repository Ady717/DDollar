package com.dickdollar.item;

import com.dickdollar.DickDollar;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Moditems {

        public static final Item DICK_DOLLAR1 = registerItem("dick_dollar1", new Item(new Item.Settings()));
        public static final Item DICK_DOLLAR50 = registerItem("dick_dollar50", new Item(new Item.Settings()));
        public static final Item DICK_DOLLAR100 = registerItem("dick_dollar100", new Item(new Item.Settings()));
        public static final Item DICK_DOLLAR500 = registerItem("dick_dollar500", new Item(new Item.Settings()));

        private static Item registerItem(String name, Item item) {
                return Registry.register(Registries.ITEM, Identifier.of(DickDollar.MOD_ID, name), item);
        }

        public static void registerModItems() {
                DickDollar.LOGGER.info("Registering Mod Items for " + DickDollar.MOD_ID);

                ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
                        entries.add(DICK_DOLLAR1);
                        entries.add(DICK_DOLLAR50);
                        entries.add(DICK_DOLLAR100);
                        entries.add(DICK_DOLLAR500);
                });
        }
}
