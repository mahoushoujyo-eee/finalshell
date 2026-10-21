package com.finalshell.core;

import com.finalshell.ui.model.CB3;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

public class Wm2_2 implements ImageObserver {
   public com.finalshell.ui.panel.Us2 R;
   public CB3 y;
   public static long[] a;
   public static Integer[] b;

   public Wm2_2(com.finalshell.ui.panel.Us2 var1, CB3 var2) {
      this.R = var1;
      this.y = var2;
   }

   @Override
   public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var7;
      int var10000;
      var7 = CB3.C$arrString();
      var10000 = (this.y.d()) ? 1 : 0;
      label27:
      if (var7 != null) {
         if (var10000 != 0) {
            var10000 = var2 & a(30803, 1327652151480148290L);
            if (var7 == null) {
               break label27;
            }

            if (var10000 != 0) {
               Rectangle var8 = this.R.getPathBounds(this.y.i());
               if (var8 != null) {
                  this.R.repaint(var8);
               }
            }
         }

         var10000 = var2 & a(15666, 8141263130548577314L);
      }

      if (var7 != null) {
         var10000 = var10000 == 0 ? 1 : 0;
      }

      return var10000 != 0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6417;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 4413664565819561537L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\"º/?A&·3\u0004=G\u0087l2rÃ";
      int var5 = "\"º/?A&·3\u0004=G\u0087l2rÃ".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }
}





