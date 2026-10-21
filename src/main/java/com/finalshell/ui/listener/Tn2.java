package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.ui.panel.K32;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class Tn2 extends MouseAdapter {
   public final K32 W;

   public Tn2(K32 var1) {
      this.W = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int[] var2 = K32.L$arrint();
      boolean var10000 = this.O(var1);
      if (var2 != null) {
         if (!var10000) {
            return;
         }

         this.W.q$boolean();
      }

      this.W.o();
   }

   public boolean O(MouseEvent var1) {
      int[] var2 = K32.L$arrint();
      boolean var10000 = SwingUtilities.isLeftMouseButton(var1);
      if (var2 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = FN.N(this.W).contains(var1.getPoint());
      }

      return var2 == null ? var10000 : var10000;
   }
}





