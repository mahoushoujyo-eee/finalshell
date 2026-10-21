package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JComboBox;

public class T3_2 extends T4 {
   public final M3 h;

   public T3_2(M3 var1) {
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
      Ky4[] var10000 = M3.X();
      JComboBox var3 = (JComboBox)var1;
      int var4 = var3.getWidth();
      int var5 = var3.getHeight();
      Ky4[] var2 = var10000;
      Object var9 = M3.v$JButton(this.h);
      if (var2 == null) {
         label25:
         if (var9 != null) {
            Insets var6;
            int var7;
            int var8;
            label30: {
               var6 = M3.O$Insets(this.h);
               var7 = var5 - (var6.top + var6.bottom);
               var8 = M3.N(this.h).getPreferredSize().width;
               if (var2 == null) {
                  if (!var3.getComponentOrientation().isLeftToRight()) {
                     break label30;
                  }

                  M3.I$JButton(this.h).setBounds(var4 - (var6.right + var8), var6.top, var8, var7);
               }

               if (var2 == null) {
                  break label25;
               }
            }

            M3.D(this.h).setBounds(var6.left, var6.top, var8, var7);
         }

         var9 = M3.i(this.h);
      }

      if (var2 == null) {
         if (var9 == null) {
            return;
         }

         var9 = M3.W(this.h);
      }

      var9.setBounds(this.h.rectangleForCurrentValue());
   }
}





