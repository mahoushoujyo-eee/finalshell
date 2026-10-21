package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class ZF_2 extends MessageToByteEncoder {
   public void J(ChannelHandlerContext var1, XU var2, ByteBuf var3) throws Exception {
      int[] var10000 = XU.t();
      var3.writeInt(var2.S());
      int[] var4 = var10000;

      try {
         var3.writeInt(var2.j());
         var3.writeBytes(var2.C());
         if (var4 == null) {
            Ky4.K(new String[3]);
         }
      } catch (Exception var5) {
         throw a(var5);
      }
   }

   @Override
   public void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) throws Exception {
      this.J(var1, (XU)var2, var3);
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





