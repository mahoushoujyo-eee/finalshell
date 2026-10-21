package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Bq_2;
import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class O72 extends KeyAdapter {
   public final Bq_2 Q;
   public static long[] a;
   public static Integer[] b;

   public O72(Bq_2 var1) {
      this.Q = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      int var2 = ConnectionProperty.M$int();
      int var10000 = var1.getKeyCode();
      int var10001 = a(14391, 4221269265887544896L);
      if (var2 != 0) {
         if (var10000 == var10001) {
            return;
         }

         var10000 = var1.getKeyCode();
         var10001 = a(6700, 2471065625034810457L);
      }

      if (var2 != 0) {
         if (var10000 == var10001) {
            return;
         }

         var10000 = var1.getKeyCode();
         var10001 = a(23228, 6095305098823279816L);
      }

      if (var10000 == var10001) {
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32373;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1623428373345895834L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "lÆö³ëraåÂ%\u008a<{o¡z÷\nv¨!\u0012ÃÐ";
      int var5 = "lÆö³ëraåÂ%\u008a<{o¡z÷\nv¨!\u0012ÃÐ".length();
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
      b = new Integer[3];
   }
}





