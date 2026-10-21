package com.finalshell.core;

import com.finalshell.reflect.Ref;
import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class Tm4 implements AWTEventListener {
   public final Fx4 j;
   public static long[] a;
   public static Integer[] b;

   public Tm4(Fx4 var1) {
      this.j = var1;
   }

   @Override
   public void eventDispatched(AWTEvent var1) {
      String[] var2;
      AWTEvent var9;
      label36: {
         var2 = com.finalshell.ui.panel.F8.y();
         boolean var10000 = var1.getSource() instanceof Component;
         if (var2 == null) {
            if (!var10000) {
               return;
            }

            var9 = var1;
            if (var2 != null) {
               break label36;
            }

            var10000 = var1 instanceof MouseEvent;
         }

         if (!var10000) {
            return;
         }

         var9 = var1;
      }

      MouseEvent var3 = (MouseEvent)var9;
      int var10 = var3.getID();
      int var10001 = a(14185, 8798113625267821162L);
      if (var2 == null) {
         if (var10 == var10001) {
            Component var4 = (Component)var1.getSource();
            Object var5 = 473562533385156683L;
            Ref.g(473562533385156683L, var5);
            Window var10002 = SwingUtilities.windowForComponent(var4);
            long var8 = 384633431140789068L;
            Window var7 = var10002;
            Ref.s(384633431140789068L, var7, var8);
            if (var2 == null) {
               return;
            }
         }

         var10 = var3.getID();
         var10001 = a(31359, 7378345624567486333L);
      }

      if (var10 == var10001) {
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27906;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8139645710591987934L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u001b\u0096\u0001¬79\u0006VRu/\u0018¦ÂËL";
      int var5 = "\u001b\u0096\u0001¬79\u0006VRu/\u0018¦ÂËL".length();
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





