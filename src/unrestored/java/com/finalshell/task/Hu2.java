package com.finalshell.task;

import com.finalshell.core.FN;
import com.finalshell.core.Wf4;
import com.finalshell.ui.panel.Hd2;
import java.awt.Component;
import java.awt.Container;

public class Hu2 implements Runnable {
   public final com.finalshell.core.BX N;
   public final Wf4 D;

   public Hu2(Wf4 var1, com.finalshell.core.BX var2) {
      this.D = var1;
      this.N = var2;
   }

   @Override
   public void run() {
      String[] var10000 = com.finalshell.core.BX.B$arrString();
      Hd2 var2 = this.N.D();
      String[] var1 = var10000;
      var10000 = (String[])(var2);
      if (var1 == null) {
         if (FN.l((Component)var2)) {
            return;
         }

         var10000 = (String[])(var2.getSelectedComponent());
      }

      label32: {
         Object var3 = var10000;
         if (var1 == null) {
            if (!var3.isFocusable()) {
               boolean var5 = var3 instanceof Container;
               if (var1 != null) {
                  return;
               }

               if (!var5) {
                  break label32;
               }

               boolean var6 = FN.v((Container)var3);
               if (var1 != null) {
                  return;
               }

               if (!var6) {
                  break label32;
               }
            }

            var2.transferFocus();
         }

         if (var1 == null) {
            return;
         }
      }

      var2.requestFocusInWindow();
   }
}





