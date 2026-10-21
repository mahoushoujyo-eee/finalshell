package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.OG;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class UB2 extends MouseAdapter {
   final OG Y;

   UB2(OG var1) {
      this.Y = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Ky4[] var2 = OG.P();
      boolean var10000 = OG.f(this.Y);
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

         OG.s(this.Y, true);
         this.Y.requestFocusInWindow();
      }

      this.Y.I$void();
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      Ky4[] var2 = OG.P();
      boolean var10000 = OG.r(this.Y);
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

         OG.s(this.Y, false);
      }

      this.Y.repaint();
   }
}





