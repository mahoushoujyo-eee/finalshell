package com.h;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

class J extends MouseAdapter {
   final JComponent w;
   final com.h.c M;

   J(com.h.c var1, JComponent var2) {
      this.M = var1;
      this.w = var2;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      boolean var10000 = com.h.K.Z();
      com.h.c.m(this.M, true);
      boolean var2 = var10000;
      var10000 = this.M.w();
      if (var2) {
         if (var10000) {
            com.h.c.T(this.M).u();
            if (var2) {
               return;
            }
         }

         com.h.c.z(this.M, 5);
      }

      this.w.repaint();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      boolean var10000 = com.h.K.V();
      com.h.c.m(this.M, false);
      boolean var2 = var10000;
      var10000 = this.M.w();
      if (!var2) {
         if (var10000) {
            com.h.c.T(this.M).u();
            if (!var2) {
               return;
            }
         }

         com.h.c.z(this.M, 0);
      }

      this.w.repaint();
   }
}





