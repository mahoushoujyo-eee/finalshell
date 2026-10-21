package com.finalshell.core;

import java.awt.Color;
import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class LM_2 extends Lz2_2 {
   public Insets W(NH3 var1) {
      return new Insets(0, 1, 0, 1);
   }

   public void t(Graphics2D var1, Rectangle var2, NH3 var3) {
      int[] var10000 = Rq4.G();
      var1.setPaint(Sm2.I);
      int[] var4 = var10000;
      Graphics2D var6 = var1;
      if (var4 != null) {
         var1.fillRect(var2.x, var2.y, var2.width, var2.height);
         if (!var3.U()) {
            return;
         }

         var6 = var1;
      }

      Composite var5 = RV.p(var6, 0.25F);
      var1.setPaint(Color.RED);
      var1.fillRect(var2.x, var2.y, var2.width, var2.height);
      RV.c(var1, var5);
   }

   @Override
   public Insets B(JComponent var1) {
      return this.W((NH3)var1);
   }

   @Override
   public void u(Graphics2D var1, Rectangle var2, JComponent var3) {
      this.t(var1, var2, (NH3)var3);
   }
}





