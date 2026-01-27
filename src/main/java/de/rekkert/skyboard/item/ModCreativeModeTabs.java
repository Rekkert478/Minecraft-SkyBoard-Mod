package de.rekkert.skyboard.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import de.rekkert.skyboard.SkyBoard;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SkyBoard.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SKYBOARD_ITEMS_TAB = CREATIVE_MODE_TABS.register("skyboard_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CONTROLLER.get()))
            .title(Component.translatable("creativetab.skyboard.skyboard_items"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.CONTROLLER.get());
            })
            .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}