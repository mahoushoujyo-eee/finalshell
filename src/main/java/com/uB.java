package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class uB extends MouseAdapter {
   final com.OG Y;

   uB(com.OG var1) {
      this.Y = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      com.ky_4[] var2 = com.OG.P();
      boolean var10000 = com.OG.f(this.Y);
      if (var2 != null) {
         if (!var10000) {
            return;
         }

         var10000 = this.Y.isEnabled();
      }

      if (var2 != null) {
         if (!var10000) {
            return;
         }

         var10000 = SwingUtilities.isLeftMouseButton(var1);
      }

      if (var2 != null) {
         if (!var10000) {
            return;
         }

         com.OG.s(this.Y, true);
         this.Y.requestFocusInWindow();
      }

      this.Y.I();
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      com.ky_4[] var2 = com.OG.P();
      boolean var10000 = com.OG.r(this.Y);
      if (var2 != null) {
         if (!var10000) {
            return;
         }

         var10000 = SwingUtilities.isLeftMouseButton(var1);
      }

      if (var2 != null) {
         if (!var10000) {
            return;
         }

         com.OG.s(this.Y, false);
      }

      this.Y.repaint();
   }
}





