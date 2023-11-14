package fr.shoqapik.biggerelevators.mixins;

import com.supermartijn642.movingelevators.MovingElevatorsConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(MovingElevatorsConfig.class)
public class MovingElevatorsConfigMixin {

    @ModifyArg(method = "<clinit>", at = @At(value = "INVOKE", target = "Lcom/supermartijn642/configlib/api/IConfigBuilder;define(Ljava/lang/String;III)Ljava/util/function/Supplier;"), index = 3)
    private static int injected(int x) {
        return 75;
    }
}
