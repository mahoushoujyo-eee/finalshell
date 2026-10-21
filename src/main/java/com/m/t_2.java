package com.m;

import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

class t_2 implements TreeSelectionListener {
   final com.m.K A;

   t_2(com.m.K var1) {
      this.A = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      JTree var4;
      label24: {
         String var10000 = com.m.s.d();
         this.A.F();
         String var2 = var10000;
         int var3 = this.A.U;
         if (var2 != null) {
            if (!this.A.U) {
               return;
            }

            var4 = com.m.K.V(this.A);
            if (var2 == null) {
               break label24;
            }

            var3 = var4.getSelectionCount();
         }

         if (var3 <= 0) {
            return;
         }

         var4 = com.m.K.x(this.A);
      }

      var4.expandPath(com.m.K.h(this.A).getSelectionPath());
   }
}





