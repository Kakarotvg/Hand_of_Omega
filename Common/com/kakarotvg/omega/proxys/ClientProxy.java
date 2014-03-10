package com.kakarotvg.omega.proxys;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
    
    @Override
    public void registerRenderInformation() {
    }
    
    @Override
    public void registerRenderThings() {
    }
    
    @Override
    public int addArmor(String armor) {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
    
}
