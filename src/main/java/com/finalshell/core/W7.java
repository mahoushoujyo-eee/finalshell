package com.finalshell.core;

import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.AWTEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;

public class W7 implements AWTEventListener {
   public static long[] a;
   public static Integer[] b;

   W7() {
   }

   @Override
   public void eventDispatched(AWTEvent var1) {
      int var10000 = (Dm4.F$boolean()) ? 1 : 0;
      var1.getSource();
      MouseEvent var3 = (MouseEvent)var1;
      boolean var2 = (((((boolean)var10000) != 0) != 0) != 0) != 0;
      var10000 = (var1.getSource() instanceof JButton) ? 1 : 0;
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

            var11 = var1;
            if (!var2) {
               break label78;
            }

            var10000 = var1.getID();
            var10001 = a(13682, 2697043498985754675L);
         }

         if (var10000 != var10001) {
            return;
         }

         var11 = var1.getSource();
      }

      JButton var4 = (JButton)var11;
      String var5 = var4.getText();
      Registry.packArgs(var5);
      long var6 = 139122500711711222L;
      Object var12 = Ref.h2(139122500711711222L, var6);

      try {
         var13 = (String)var12;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var5 = var13;
      var10001 = (var5.startsWith(" ")) ? 1 : 0;
      if (var2) {
         if (var10001 == 0) {
            return;
         }

         var10001 = (var5.endsWith(" ")) ? 1 : 0;
      }

      if (var2) {
         if (var10001 == 0) {
            return;
         }

         var10001 = var5.length();
      }

      int var10002 = a(15473, 2236612198155524401L);
      if (var2) {
         if (var10001 == var10002) {
            ConnectHost.ia = System.currentTimeMillis();
            if (var2) {
               return;
            }
         }

         var10001 = var5.length();
         var10002 = 4;
      }

      if (var10001 == var10002) {
         ConnectHost.J = System.currentTimeMillis();
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9536;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
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
}





