package com.finalshell.ui.panel;

import com.finalshell.core.Kl2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

public class LI extends JLabel {
   boolean z;
   Kl2 J;
   public static long[] a;
   public static Integer[] b;

   public LI() {
      Registry.lookupField(489863265832754423L).setBoolean(this, false);
   }

   @Override
   public void paint(Graphics var1) {
      boolean var10000 = FilePanel.p$boolean();
      Graphics2D var3 = (Graphics2D)var1;
      boolean var2 = var10000;
      if (!var2) {
         Object var12 = 227134258213482384L;
         label42:
         if ((Kl2)Ref.g(227134258213482384L, var12) != null && !var2 && Registry.lookupField(489863265832754423L).getBoolean(this)) {
            Color var4 = new Color(
               a(14128, 5120093020140478051L), a(22044, 7117432141894647630L), a(3014, 3587927999217345174L), a(25358, 3707060545719781983L)
            );
            var3.setColor(var4);
            Object var14 = 227134258213482384L;
            Ref.g(227134258213482384L, var14);
            Object[] var10003 = Registry.emptyArgs();
            long var17 = 431375544983974376L;
            Object[] var16 = var10003;
            var10003 = Ref.h(431375544983974376L, var16, var17);

            try {
               var25 = (Long)var10003;
            } catch (InvocationTargetException var23) {
               throw var23.getTargetException();
            }

            float var26 = (float)var25;
            Object var18 = 227134258213482384L;
            Object var10005 = Ref.g(227134258213482384L, var18);
            Object[] var10006 = Registry.emptyArgs();
            long var21 = 399113218510016089L;
            Object[] var20 = var10006;
            var10006 = Ref.h(399113218510016089L, var20, var21);

            try {
               var28 = (Long)var10006;
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }

            float var5 = var10005 / (float)var28;
            byte var6 = 2;
            byte var7 = 2;
            byte var8 = 0;
            byte var9 = 2;
            int var10 = (int)(((float)this.getWidth() - (float)var9) * var5) + var8;
            if (!var2) {
               if (var5 > 0.0F) {
                  var3.fillRect(this.getWidth() - var10 - var7, var6, var10, this.getHeight() - 2 * var6);
                  if (!var2) {
                     break label42;
                  }
               }

               var3.setColor(var4);
            }

            var3.fillRect(this.getWidth() - var10 - var7, var6, var10, this.getHeight() - 2 * var6);
         }
      }

      super.paint(var1);
   }

   public boolean X() {
      return Registry.lookupField(489863265832754423L).getBoolean(this);
   }

   public void R(boolean var1) {
      Registry.lookupField(489863265832754423L).setBoolean(this, var1);
   }

   public Kl2 Y() {
      Object var1 = 227134258213482384L;
      return (Kl2)Ref.g(227134258213482384L, var1);
   }

   public void e(Kl2 var1) {
      long var3 = 227134258213482384L;
      Ref.s(227134258213482384L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10579;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 9081866470908194073L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "/ôi\u001frms \u009ag\u0016cÂ\u0090\u0092ý";
      int var5 = "/ôi\u001frms \u009ag\u0016cÂ\u0090\u0092ý".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "³&²Vì}'\u0016QMÉ«q\u0004O\u0019";
                  var5 = "³&²Vì}'\u0016QMÉ«q\u0004O\u0019".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





