package lain.mods.cos.impl;

import lain.mods.cos.impl.client.InventoryManagerClient;
import lain.mods.cos.impl.inventory.ContainerCosArmor;
import lain.mods.cos.init.neoforge.NeoForgeCosmeticArmorReworked;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.fml.loading.FMLEnvironment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModObjects {模组对象

    public static final Logger logger = LogManager.getLogger(NeoForgeCosmeticArmorReworked.class);//日志文件
    public static final InventoryManager invMan = FMLEnvironment.dist.isClient() ? new InventoryManagerClient() : new InventoryManager();
    //Inv管理器选择

    public static MenuType<ContainerCosArmor> getTypeContainerCosArmor() {
        return NeoForgeCosmeticArmorReworked.typeContainerCosArmor.get();
        /*
         public static final DeferredHolder<MenuType<?>, MenuType<ContainerCosArmor>> typeContainerCosArmor 
            = MENU.register("inventorycosarmor", () -> new MenuType<>(ModObjects.invMan::createContainerClient, FeatureFlags.VANILLA_SET));
        */
    }

}
