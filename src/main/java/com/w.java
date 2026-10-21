package com;

import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JButton;

class w implements AWTEventListener {
   private static final long[] a;
   private static final Integer[] b;

   @Override
   public void eventDispatched(AWTEvent var1) {
      int var10000 = com.dm_4.F();
      var1.getSource();
      MouseEvent var3 = (MouseEvent)var1;
      boolean var2 = (boolean)var10000;
      var10000 = var1.getSource() instanceof JButton;
      if (var2) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var3.getClickCount();
      }

      int var10001 = 1;
      if (var2) {
         if (var10000 != 1) {
            return;
         }

         var10000 = var3.getButton();
         var10001 = 1;
      }

      label78: {
         if (var2) {
            if (var10000 != var10001) {
               return;
            }

            var9 = var1;
            if (!var2) {
               break label78;
            }

            var10000 = var1.getID();
            var10001 = a(13682, 2697043498985754675L);
         }

         if (var10000 != var10001) {
            return;
         }

         var9 = var1.getSource();
      }

      JButton var4 = (JButton)var9;
      String var5 = var4.getText();
      Object[] var10 = com.c.a(var5);
      Method var11 = com.c.d(139122500711711222L);
      Object[] var17 = var10;
      Object var15 = null;

      try {
         var12 = (String)var11.invoke(var15, var17);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var5 = var12;
      var10000 = var5.startsWith(" ");
      if (var2) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var5.endsWith(" ");
      }

      if (var2) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var5.length();
      }

      var10001 = a(15473, 2236612198155524401L);
      if (var2) {
         if (var10000 == var10001) {
            com.DI.ia = System.currentTimeMillis();
            if (var2) {
               return;
            }
         }

         var10000 = var5.length();
         var10001 = 4;
      }

      if (var10000 == var10001) {
         com.DI.J = System.currentTimeMillis();
      }
   }

   static {
      long var0 = 7908920917448075006L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\f(\u000f´b{¿ÈÑ[ðí\u0005ô·9";
      int var5 = "\f(\u000f´b{¿ÈÑ[ðí\u0005ô·9".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9536;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





