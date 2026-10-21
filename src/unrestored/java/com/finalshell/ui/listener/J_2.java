package com.finalshell.ui.listener;

import com.finalshell.core.C_4;
import com.finalshell.ui.panel.Ky4;
import java.awt.Insets;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.PopupMenuUI;

public class J_2 implements ListSelectionListener {
   public final C_4 B;

   public J_2(C_4 var1) {
      this.B = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      Ky4[] var2;
      PopupMenuUI var7;
      label38: {
         var2 = com.finalshell.core.M3.X();
         boolean var10000 = this.B.isShowing();
         if (var2 == null) {
            if (!var10000) {
               return;
            }

            var7 = this.B.getUI();
            if (var2 != null) {
               break label38;
            }

            var10000 = var7 instanceof com.finalshell.core.FJ;
         }

         if (!var10000) {
            return;
         }

         var7 = this.B.getUI();
      }

      com.finalshell.core.FJ var3 = (com.finalshell.core.FJ)var7;
      if (var3.M() == com.finalshell.ui.model.M.dropdown) {
         Insets var6;
         label23: {
            int var4 = this.B.getLocationOnScreen().y;
            int var5 = C_4.L(this.B).getLocationOnScreen().y;
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





