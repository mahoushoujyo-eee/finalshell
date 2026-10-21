package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class H7 extends MouseAdapter {
   final com.Oj_2 P;

   H7(com.Oj_2 var1) {
      this.P = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      boolean var2 = com.Oj_2.V();
      H7 var10000 = this;
      if (!var2) {
         if (!this.P.i) {
            return;
         }

         var10000 = this;
      }

      var10000.k(var1);
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      H7 var3;
      label24: {
         boolean var2 = com.Oj_2.g();
         boolean var10000 = this.P.i;
         if (var2) {
            if (this.P.i) {
               return;
            }

            var3 = this;
            if (!var2) {
               break label24;
            }

            var10000 = com.FN.N(this.P).contains(var1.getPoint());
         }

         if (!var10000) {
            return;
         }

         var3 = this;
      }

      var3.k(var1);
   }

   private void k(MouseEvent var1) {
      boolean var2 = com.Oj_2.V();
      boolean var10000 = this.P.isEnabled();
      if (!var2) {
         if (!var10000) {
            return;
         }

         var10000 = SwingUtilities.isLeftMouseButton(var1);
      }

      if (var10000) {
         this.P.A();
      }
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.P.f(true);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.P.f(false);
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      this.P.f(false);
   }
}





