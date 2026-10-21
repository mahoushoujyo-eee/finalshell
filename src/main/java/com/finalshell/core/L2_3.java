package com.finalshell.core;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class L2_3 extends Lz2_2 {
   protected Color b;
   public static long a;

   public L2_3(Color var1) {
      this.b = var1;
   }

   public Color R() {
      return this.b;
   }

   public void g(Color var1) {
      this.b = var1;
      this.l();
   }

   @Override
   public Boolean d$Boolean(JComponent var1) {
      int[] var2 = Lz2_2.M();
      Color var10000 = this.b;
      if (var2 == null) {
         if (this.b == null) {
            return false;
         }

         var10000 = this.b;
      }

      int var3 = var10000.getAlpha();
      if (var2 != null) {
         return Boolean.valueOf((boolean)var3);
      } else {
         return var3 == (int)a ? true : false;
      }
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      int[] var4 = Lz2_2.M();
      if (this.b != null) {
         Rectangle var5 = var3.getVisibleRect().intersection(var2);
         int var10000 = var5.width;
         if (var4 == null) {
            if (var5.width <= 0) {
               return;
            }

            var10000 = var5.height;
         }

         if (var10000 > 0) {
            var1.setColor(this.b);
            var1.fillRect(var5.x, var5.y, var5.width, var5.height);
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5386012071843819472L;
      long var10002 = 8161070572994260783L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





