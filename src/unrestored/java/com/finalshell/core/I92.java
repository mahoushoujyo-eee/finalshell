package com.finalshell.core;

import com.finalshell.ui.panel.Oj2;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Component.BaselineResizeBehavior;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class I92 extends I12 {
   public boolean P = false;

   public static ComponentUI createUI(JComponent var0) {
      return new I92();
   }

   public boolean g() {
      return this.P;
   }

   public void h(boolean var1) {
      this.P = var1;
   }

   @Override
   public int getBaseline(JComponent var1, int var2, int var3) {
      super.getBaseline(var1, var2, var3);
      return -1;
   }

   @Override
   public BaselineResizeBehavior getBaselineResizeBehavior(JComponent var1) {
      super.getBaselineResizeBehavior(var1);
      return BaselineResizeBehavior.OTHER;
   }

   @Override
   public void paint(Graphics var1, JComponent var2) {
      Graphics2D var4;
      label24: {
         label23: {
            boolean var3;
            label22: {
               boolean var10000 = Oj2.g();
               var4 = (Graphics2D)var1.create();
               var3 = var10000;
               var10000 = var2.getComponentOrientation().isLeftToRight();
               if (var3) {
                  if (var10000) {
                     if (!this.P) {
                        break label23;
                     }
                     break label22;
                  }

                  var10000 = this.P;
               }

               if (var10000) {
                  break label23;
               }
            }

            var4.rotate(Math.PI / 2, (double)(var2.getSize().width / 2), (double)(var2.getSize().width / 2));
            if (var3) {
               break label24;
            }
         }

         var4.rotate(-Math.PI / 2, (double)(var2.getSize().height / 2), (double)(var2.getSize().height / 2));
      }

      super.paint(var4, var2);
   }
}





