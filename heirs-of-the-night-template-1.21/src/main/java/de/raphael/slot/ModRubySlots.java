package de.raphael.slot;

import dev.emi.trinkets.api.TrinketSlot;

public class ModRubySlots {
    public static void register() {
        TrinketSlot.Builder slot = new TrinketSlot.Builder()
                .name("steel_trinket") // Slot ID
                .size(1) // Number of items in the slot
                .type("hand") // Example: Can be "hand", "chest", "head", etc.
                .build();

        TrinketSlot.registerSlot(slot);
    }
}
