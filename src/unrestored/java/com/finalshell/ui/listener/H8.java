package com.finalshell.ui.listener;

import com.finalshell.ui.panel.CI;
import com.finalshell.ui.panel.KE3;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.AbstractButton;

public class H8 extends MouseAdapter {
   public final CI C;
   public final com.finalshell.ui.panel.Kd4 c;

   public H8(com.finalshell.ui.panel.Kd4 var1, CI var2) {
      this.c = var1;
      this.C = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String var2 = KE3.v();
      Object var10000 = this.C;
      if (var2 == null) {
         if (this.C.getSelectedIndex() == -1) {
            return;
         }

         this.c.u((File)this.C.getSelectedValue());
         var10000 = this.c.q();
      }

      label33: {
         Object var3 = var10000;
         ((javax.swing.JComponent)var3).requestFocus();
         var3.requestFocusInWindow();
         boolean var4 = com.finalshell.ui.panel.Kd4.M(this.c);
         if (var2 == null) {
            if (!var4) {
               return;
            }

            var10000 = var3;
            if (var2 != null) {
               break label33;
            }

            var4 = var3 instanceof AbstractButton;
         }

         if (!var4) {
            return;
         }

         var10000 = var3;
      }

      ((AbstractButton)var10000).doClick();
   }
}





