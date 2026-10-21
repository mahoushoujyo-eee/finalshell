package com.L;

import java.awt.Insets;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.PopupMenuUI;

class j_2 implements ListSelectionListener {
   final com.L.c B;

   j_2(com.L.c var1) {
      this.B = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      com.ky_4[] var2;
      PopupMenuUI var7;
      label38: {
         var2 = m.X();
         boolean var10000 = this.B.isShowing();
         if (var2 == null) {
            if (!var10000) {
               return;
            }

            var7 = this.B.getUI();
            if (var2 != null) {
               break label38;
            }

            var10000 = var7 instanceof com.FJ;
         }

         if (!var10000) {
            return;
         }

         var7 = this.B.getUI();
      }

      com.FJ var3 = (com.FJ)var7;
      if (var3.M() == com.C.M.dropdown) {
         Insets var6;
         label23: {
            int var4 = this.B.getLocationOnScreen().y;
            int var5 = com.L.c.L(this.B).getLocationOnScreen().y;
            var6 = this.B.getInsets();
            if (var2 == null) {
               if (var4 <= var5) {
                  break label23;
               }

               this.B.repaint(0, 0, this.B.getWidth(), var6.top);
            }

            if (var2 == null) {
               return;
            }
         }

         this.B.repaint(0, this.B.getHeight() - var6.bottom, this.B.getWidth(), var6.bottom);
      }
   }
}





