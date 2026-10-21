import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class zF extends MessageToByteEncoder {
   protected void J(ChannelHandlerContext var1, xU var2, ByteBuf var3) throws Exception {
      int[] var10000 = xU.t();
      var3.writeInt(var2.S());
      int[] var4 = var10000;

      try {
         var3.writeInt(var2.j());
         var3.writeBytes(var2.C());
         if (var4 == null) {
            com.ky_4.K(new String[3]);
         }
      } catch (Exception var5) {
         throw a(var5);
      }
   }

   @Override
   protected void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) throws Exception {
      this.J(var1, (xU)var2, var3);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}





