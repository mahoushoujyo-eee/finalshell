package com.finalshell.ui.listener;

import com.finalshell.core.K4_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class J3 extends MouseAdapter {
   public final JComponent w;
   public final C4 M;

   public J3(C4 var1, JComponent var2) {
      this.M = var1;
      this.w = var2;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      boolean var10000 = K4_2.Z$boolean();
      C4.m(this.M, true);
      boolean var2 = var10000;
      var10000 = this.M.w();
      if (var2) {
         if (var10000) {
            C4.T$WC(this.M).u$WC();
            if (var2) {
               return;
            }
         }

         C4.z(this.M, 5);
      }

      this.w.repaint();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      boolean var10000 = K4_2.V();
      C4.m(this.M, false);
      boolean var2 = var10000;
      var10000 = this.M.w();
      if (!var2) {
         if (var10000) {
            C4.T$WC(this.M).u$WC();
            if (!var2) {
               return;
            }
         }

         C4.z(this.M, 0);
      }

      this.w.repaint();
   }
}





