package com.dyonovan.tcnodetracker.bindings;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.ClientRegistry;

public class KeyBindings {

    public static KeyBinding aspectMenu;

    public static void init() {
        aspectMenu = new KeyBinding("key.aspectMenu", Keyboard.KEY_I, "key.cat.tcnodetracker");

        ClientRegistry.registerKeyBinding(aspectMenu);
    }
}
