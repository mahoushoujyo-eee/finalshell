package com;

import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.FocusEvent;

class uH implements AWTEventListener {
   private static final long[] a;
   private static final Integer[] b;

   @Override
   public void eventDispatched(AWTEvent var1) {
      int[] var2 = com.c4_2.g();
      int var10000 = var1 instanceof FocusEvent;
      if (var2 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = com.ON.B.size();
      }

      if (var10000 > 0) {
         FocusEvent var3;
         label44: {
            var3 = (FocusEvent)var1;
            var10000 = var3.getID();
            int var10001 = a(16094, 8113623337527375130L);
            if (var2 == null) {
               label32: {
                  if (var10000 == var10001) {
                     var5 = var3;
                     if (var2 != null) {
                        break label32;
                     }

                     if (var3.getOppositeComponent() == null) {
                        com.ON.u(var3.getComponent(), null);
                        if (var2 == null) {
                           return;
                        }
                     }
                  }

                  var5 = var3;
               }

               if (var2 != null) {
                  break label44;
               }

               var10000 = var5.getID();
               var10001 = a(10468, 9054562868667048737L);
            }

            if (var10000 != var10001) {
               return;
            }

            var5 = var3;
         }

         com.ON.u(var5.getOppositeComponent(), var3.getComponent());
      }
   }

   static {
      long var0 = 2231055992467143847L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "bj½ãË¡ÊPÒ¼wÿvUÜj";
      int var5 = "bj½ãË¡ÊPÒ¼wÿvUÜj".length();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19396;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





