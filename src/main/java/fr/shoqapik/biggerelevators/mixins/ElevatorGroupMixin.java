package fr.shoqapik.biggerelevators.mixins;

import com.supermartijn642.movingelevators.elevator.ElevatorGroup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ElevatorGroup.class)
public abstract class ElevatorGroupMixin {

    @Shadow private int cageDepthOffset;

    @Shadow public abstract boolean isMoving();

    /**
     * @author
     * @reason
     */
    @Overwrite(remap = false)
    public boolean canIncreaseCageDepthOffset() {
        return !this.isMoving() && this.cageDepthOffset < 75;
    }

}
