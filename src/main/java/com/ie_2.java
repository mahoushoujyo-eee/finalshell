package com;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ComponentAdapter;
import javax.swing.JComponent;
import javax.swing.JRootPane;

public class Ie_2 extends IB {
   private ComponentAdapter M;

   public Ie_2(com.aS var1) {
      super(var1);
   }

   protected void K(JRootPane var1) {
      Window var2 = com.FV.L(var1);
      this.M = new com.ys_4(this);
      var2.addComponentListener(this.M);
   }

   protected void M(JRootPane var1) {
      Window var2 = com.FV.L(var1);
      var2.removeComponentListener(this.M);
      this.M = null;
   }

   protected void A(JRootPane var1) {
      Window var3 = com.FV.L(var1);
      String[] var10000 = IH.M();
      Rectangle var4 = (Rectangle)this.o();
      String[] var2 = var10000;
      Rectangle var7 = var4;
      if (var2 != null) {
         if (var4 == null) {
            return;
         }

         var7 = var4;
      }

      if (var2 != null) {
         if (com.ax_2.Z(var7, new Object[]{var3.getBounds()})) {
            return;
         }

         var7 = var4;
      }

      label40: {
         label39: {
            Dimension var5 = var7.getSize();
            int var8 = var5.width;
            if (var2 != null) {
               if (var5.width <= 0) {
                  break label39;
               }

               var8 = var5.height;
            }

            if (var8 > 0) {
               var3.setSize(var5);
               if (var2 != null) {
                  break label40;
               }
            }
         }

         var3.pack();
      }

      label30: {
         Point var6 = var4.getLocation();
         int var9 = var6.x;
         if (var2 != null) {
            if (var6.x <= 0) {
               break label30;
            }

            var9 = var6.y;
         }

         if (var9 > 0) {
            var3.setLocation(var6);
            if (var2 != null) {
               return;
            }
         }
      }

      var3.setLocationRelativeTo(null);
   }

   protected void W(JRootPane var1) {
      Window var2 = com.FV.L(var1);
      this.J(var2.getBounds());
   }

   @Override
   protected void T(JComponent var1) {
      this.W((JRootPane)var1);
   }

   @Override
   protected void s(JComponent var1) {
      this.A((JRootPane)var1);
   }

   @Override
   protected void r(JComponent var1) {
      this.M((JRootPane)var1);
   }

   @Override
   protected void F(JComponent var1) {
      this.K((JRootPane)var1);
   }
}





