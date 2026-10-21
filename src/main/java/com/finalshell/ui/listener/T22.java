package com.finalshell.ui.listener;

import com.finalshell.core.K5_2;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

public class T22 implements TreeSelectionListener {
   final K5_2 A;

   T22(K5_2 var1) {
      this.A = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      JTree var4;
      label24: {
         String var10000 = com.finalshell.ui.panel.S.d();
         this.A.F();
         String var2 = var10000;
         int var3 = this.A.U;
         if (var2 != null) {
            if (!this.A.U) {
               return;
            }

            var4 = K5_2.V(this.A);
            if (var2 == null) {
               break label24;
            }

            var3 = var4.getSelectionCount();
         }

         if (var3 <= 0) {
            return;
         }

         var4 = K5_2.x(this.A);
      }

      var4.expandPath(K5_2.h(this.A).getSelectionPath());
   }
}





