package com;

import java.io.IOException;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import org.newsclub.net.unix.AFUNIXServerSocketChannel;
import org.newsclub.net.unix.AFUNIXSocketAddress;
import org.newsclub.net.unix.AFUNIXSocketChannel;

public class nF_3 implements Rc_2 {
   private static final String a;

   public nF_3() throws _Y {
      boolean var10000 = com.dm_4.J();
      super();
      boolean var1 = var10000;

      try {
         AFUNIXSocketChannel var2 = AFUNIXSocketChannel.open();

         label24: {
            try {
               var5 = var2;
               if (var1) {
                  break label24;
               }

               if (var2 == null) {
                  return;
               }
            } catch (IOException var3) {
               throw a(var3);
            }

            var5 = var2;
         }

         var5.close();
      } catch (NoClassDefFoundError | IOException var4) {
         throw new _Y(a, var4);
      }
   }

   @Override
   public SocketChannel o(Path var1) throws IOException {
      AFUNIXSocketAddress var2 = AFUNIXSocketAddress.of(var1);
      AFUNIXSocketChannel var3 = AFUNIXSocketChannel.open();
      var3.configureBlocking(true);
      var3.connect(var2);
      return var3;
   }

   @Override
   public ServerSocketChannel J(Path var1) throws IOException {
      AFUNIXSocketAddress var2 = AFUNIXSocketAddress.of(var1);
      AFUNIXServerSocketChannel var3 = AFUNIXServerSocketChannel.open();
      var3.configureBlocking(true);
      var3.bind(var2);
      return var3;
   }

   private static IOException a(IOException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "EHq.6l)LVz3ns/MO~57?3A\\i&'s'MQz".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 37;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 37;
         var10006 = var0;
      } else {
         var6 = 37;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 37;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 10;
               break;
            case 1:
               var23 = 24;
               break;
            case 2:
               var23 = 58;
               break;
            case 3:
               var23 = 98;
               break;
            case 4:
               var23 = 107;
               break;
            case 5:
               var23 = 58;
               break;
            default:
               var23 = 99;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
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





