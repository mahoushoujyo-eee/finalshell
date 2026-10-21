package com.Z;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

class s_2 implements TreeSelectionListener {
   final com.Z.T B;

   s_2(com.Z.T var1) {
      this.B = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      String var2 = com.Z.T.v();
      com.Z.T var10000 = this.B;
      if (var2 == null) {
         if (this.B.H.getSelectionCount() <= 0) {
            return;
         }

         var10000 = this.B;
      }

      var10000.M(this.B.H.N(), d_2.tree);
   }
}





