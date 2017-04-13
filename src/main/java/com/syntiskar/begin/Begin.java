package com.syntiskar.begin;

import com.syntiskar.begin.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, version = References.VERSION,name = References.NAME,acceptedMinecraftVersions = References.ACCEPTED_VERSIONS)
public class Begin
{

    @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS,serverSide = References.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }

    @EventHandler
    public void PreInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public void PostInit(FMLPostInitializationEvent event){

    }
}
