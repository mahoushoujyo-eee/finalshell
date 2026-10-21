package com.finalshell.ui.listener;

import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.KeyStroke;

public class I implements KeyListener {
   boolean t;
   int Z;
   final SetBackgroundImagePanel W;
   public static long[] a;
   public static Integer[] b;

   public I(SetBackgroundImagePanel var1) {
      this.W = var1;
      this.t = false;
      this.Z = a(29189, 8162893525179881102L);
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      int var2;
      int var6;
      var6 = ConnectionProperty.y();
      int var3 = var1.getKeyCode();
      var2 = var6;
      KeyStroke var4 = KeyStroke.getKeyStrokeForEvent(var1);
      var6 = var3;
      label25:
      if (var2 == 0) {
         if (var3 != a(26846, 5300456774903974999L)) {
            var6 = var4.getModifiers() & a(24728, 3534710944705954832L);
            if (var2 != 0) {
               break label25;
            }

            if (var6 != 0) {
               this.t = true;
            }
         }

         this.W.ce = System.currentTimeMillis();
         this.W.cQ = true;
         this.W.cw = var1.getKeyCode();
         var6 = this.W.Z(var1);
      }

      int var5 = var6;
      if (var2 == 0) {
         if (var5 == 0) {
            return;
         }

         SetBackgroundImagePanel.Z(this.W, var1);
      }
   }

   @Override
   public void keyTyped(KeyEvent var1) {
      SetBackgroundImagePanel.Y(this.W, var1);
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      int var10000 = ConnectionProperty.M$int();
      KeyStroke var3 = KeyStroke.getKeyStrokeForEvent(var1);
      int var2 = var10000;
      boolean var4 = this.W.u$boolean();
      if (var2 != 0) {
         if (!var4) {
            return;
         }

         this.W.i(var1);
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9353;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1562565732610996436L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "æ\u0018\u00adZÉ\u000f4\u0092\u008bîÌÞ$\u009b¼DÆÜ%_Í×-½";
      int var5 = "æ\u0018\u00adZÉ\u000f4\u0092\u008bîÌÞ$\u009b¼DÆÜ%_Í×-½".length();
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





