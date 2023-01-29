package com.dyonovan.tcnodetracker.events;

import net.minecraft.client.Minecraft;

import com.dyonovan.tcnodetracker.bindings.KeyBindings;
import com.dyonovan.tcnodetracker.gui.GuiMain;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEvent {

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {

        if (KeyBindings.aspectMenu.isPressed()) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiMain());
        }
    }
}
