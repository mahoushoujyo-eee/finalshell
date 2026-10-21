package com.finalshell.ui.listener;

import com.finalshell.ui.panel.LocalDrive;
import com.finalshell.ui.panel.Z7;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class G8 extends KeyAdapter {
   public final LocalDrive S;
   public static long[] a;
   public static Integer[] b;

   public G8(LocalDrive var1) {
      this.S = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
      label17: {
         int var10000 = Z7.m();
         char var3 = var1.getKeyChar();
         int var2 = var10000;
         char var4 = var3;
         int var10001 = a(8267, 418025865002658834L);
         if (var2 != 0) {
            if (var3 < var10001) {
               break label17;
            }

            var4 = var3;
            var10001 = a(31543, 4329221139751040879L);
         }

         if (var4 <= var10001) {
            return;
         }
      }

      var1.consume();
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3160;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3680737047138682782L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u00adhÊ'²ª°È@\u001a\u0088Eø:ë¼";
      int var5 = "\u00adhÊ'²ª°È@\u001a\u0088Eø:ë¼".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
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





