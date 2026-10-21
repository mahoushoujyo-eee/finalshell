package org.v;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URLConnection;

class Rt_2 implements org.V.N {
   final URLConnection d;
   final URI z;
   final String i;
   final E_3 e;
   private static final String a;

   Rt_2(E_3 var1, URLConnection var2, URI var3, String var4) {
      this.e = var1;
      this.d = var2;
      this.z = var3;
      this.i = var4;
   }

   @Override
   public InputStream o() throws IOException {
      try {
         return this.d.getInputStream();
      } catch (IOException var2) {
         throw new IOException(this.z + a + this.i, var2);
      }
   }

   @Override
   public String o$String() {
      return this.i;
   }

   @Override
   public long z() {
      return this.d.getLastModified();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0010M".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 92;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 92;
         var10006 = var0;
      } else {
         var6 = 92;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 92;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 96;
               break;
            case 1:
               var23 = 49;
               break;
            case 2:
               var23 = 50;
               break;
            case 3:
               var23 = 9;
               break;
            case 4:
               var23 = 57;
               break;
            case 5:
               var23 = 50;
               break;
            default:
               var23 = 121;
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





