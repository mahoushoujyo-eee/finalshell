package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V_2 implements ActionListener {
   public final com.finalshell.core.D E;

   public V_2(com.finalshell.core.D var1) {
      this.E = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.finalshell.core.D var3;
      label26: {
         int[] var2 = com.finalshell.ui.dialog.Y2.M$arrint();
         boolean var10000 = this.E.u$boolean();
         if (var2 != null) {
            if (!var10000) {
               return;
            }

            var3 = this.E;
            if (var2 == null) {
               break label26;
            }

            var10000 = this.E.j$boolean();
         }

         if (var10000) {
            this.E.J();
            if (var2 != null) {
               return;
            }
         }

         var3 = this.E;
      }

      var3.p();
   }
}





