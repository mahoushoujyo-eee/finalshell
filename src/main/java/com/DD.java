package com;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.SwingUtilities;

class DD extends MouseAdapter {
   final JList Q;
   final wO_3 X;

   DD(wO_3 var1, JList var2) {
      this.X = var1;
      this.Q = var2;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int var2 = wO_3.f();
      int var10000 = this.X.x();
      if (var2 == 0) {
         if (var10000 <= 0) {
            return;
         }

         var10000 = var1.getClickCount();
      }

      label45: {
         if (var2 == 0) {
            if (var10000 != this.X.x()) {
               return;
            }

            var6 = var1;
            if (var2 != 0) {
               break label45;
            }

            var10000 = SwingUtilities.isLeftMouseButton(var1);
         }

         if (var10000 == 0) {
            return;
         }

         var6 = var1;
      }

      Point var3 = var6.getPoint();
      int var4 = this.Q.getUI().locationToIndex(this.Q, var3);
      var10000 = var4;
      if (var2 == 0) {
         if (var4 < 0) {
            return;
         }

         var10000 = var4;
      }

      if (var10000 < this.Q.getModel().getSize()) {
         Rectangle var5 = this.Q.getCellBounds(var4, var4);
         if (var5.contains(var3)) {
            this.X.N(this.Q, var4);
         }
      }
   }
}





