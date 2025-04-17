package net.treyhutson.tutorialmod.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.message.MessageHandler;
import net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;



@Mixin(ClientPlayNetworkHandler.class)
public class OnChatMixin {

    @Inject(method = "onChatMessage", at = @At("TAIL"))
    public void messageListener(ChatMessageS2CPacket packet, CallbackInfo ci) throws InterruptedException {
        if(packet.body().content().toLowerCase().contains("Windows") || packet.body().content().toLowerCase().contains("OS".toLowerCase())){ // if anyone mentions OS'es...
            flexOS(); // flex your superior operating system.
        }
    }

    public void flexOS(){
        MinecraftClient.getInstance().player.sendMessage(Text.literal("Hi"), false); // if they run arc
    }



}

