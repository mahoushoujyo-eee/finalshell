package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

class li_4 extends MouseAdapter {
   final JComponent S;
   final _n_2 T;
   private static final long a;

   li_4(_n_2 var1, JComponent var2) {
      this.T = var1;
      this.S = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      _n_2.r(this.T).repaint();
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      _n_2.q(this.T).repaint();
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      _n_2.K(this.T).repaint();
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      int var10000 = _n_2.G();
      this.T.y = true;
      int var2 = var10000;
      _n_2 var3 = this.T;
      if (var2 == 0) {
         label20: {
            if (this.T.h()) {
               var4 = this;
               if (var2 != 0) {
                  break label20;
               }

               if (this.S.isEnabled()) {
                  this.T.v.u();
                  if (var2 == 0) {
                     return;
                  }
               }
            }

            this.T.B = (int)a;
            var4 = this;
         }

         var3 = var4.T;
      }

      _n_2.s(var3).repaint();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      int var10000 = _n_2.W();
      this.T.y = false;
      int var2 = var10000;
      _n_2 var3 = this.T;
      if (var2 != 0) {
         label20: {
            if (this.T.h()) {
               var4 = this;
               if (var2 == 0) {
                  break label20;
               }

               if (this.S.isEnabled()) {
                  this.T.v.u();
                  if (var2 != 0) {
                     return;
                  }
               }
            }

            this.T.B = 0;
            var4 = this;
         }

         var3 = var4.T;
      }

      _n_2.X(var3).repaint();
   }

   static {
      long var0 = 488343422258881099L;
      long var10002 = 7349351560752898638L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





