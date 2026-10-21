package com.L;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JComboBox;

public class t extends com.T4 {
   final m h;

   protected t(m var1) {
      this.h = var1;
   }

   @Override
   public Dimension preferredLayoutSize(Container var1) {
      return var1.getPreferredSize();
   }

   @Override
   public Dimension minimumLayoutSize(Container var1) {
      return var1.getMinimumSize();
   }

   @Override
   public void layoutContainer(Container var1) {
      com.ky_4[] var10000 = m.X();
      JComboBox var3 = (JComboBox)var1;
      int var4 = var3.getWidth();
      int var5 = var3.getHeight();
      com.ky_4[] var2 = var10000;
      Object var9 = m.v(this.h);
      if (var2 == null) {
         label25:
         if (var9 != null) {
            Insets var6;
            int var7;
            int var8;
            label30: {
               var6 = m.O(this.h);
               var7 = var5 - (var6.top + var6.bottom);
               var8 = m.N(this.h).getPreferredSize().width;
               if (var2 == null) {
                  if (!var3.getComponentOrientation().isLeftToRight()) {
                     break label30;
                  }

                  m.I(this.h).setBounds(var4 - (var6.right + var8), var6.top, var8, var7);
               }

               if (var2 == null) {
                  break label25;
               }
            }

            m.D(this.h).setBounds(var6.left, var6.top, var8, var7);
         }

         var9 = m.i(this.h);
      }

      if (var2 == null) {
         if (var9 == null) {
            return;
         }

         var9 = m.W(this.h);
      }

      var9.setBounds(this.h.rectangleForCurrentValue());
   }
}





