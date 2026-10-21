import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;

class aO extends ChannelInitializer {
   private static final String a;

   protected void H(SocketChannel var1) throws Exception {
      var1.pipeline().addLast(a, new ReadTimeoutHandler(5));
      var1.pipeline().addLast(new zF());
      var1.pipeline().addLast(new Lz_2());
      var1.pipeline().addLast(new BA());
   }

   @Override
   protected void initChannel(Channel var1) throws Exception {
      this.H((SocketChannel)var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "#93v~?\u001643'fb7\u0015507`".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 20;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 20;
         var10006 = var0;
      } else {
         var6 = 20;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 20;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 69;
            case 1 -> 72;
            case 2 -> 70;
            case 3 -> 6;
            case 4 -> 62;
            case 5 -> 66;
            default -> 111;
         });
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





