package net.pistonmaster.headrestorer.mixin;

import net.minecraft.client.gui.GuiPlayerTabOverlay;

@Mixin(GuiPlayerTabOverlay.class)
public class PlayerTabOverlayMixin {
    @ModifyVariable(method = "render(Lcom/mojang/blaze3d/vertex/PoseStack;ILnet/minecraft/world/scores/Scoreboard;Lnet/minecraft/world/scores/Objective;)V", at = @At("STORE"), ordinal = 0)
    private boolean injected(boolean x) {
        return true;
    }
}
