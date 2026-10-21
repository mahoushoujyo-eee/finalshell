package com;

import java.util.List;
import javax.swing.tree.TreePath;

class SK extends ST {
   final TreePath Z;
   final us_2 a;

   SK(us_2 var1, TreePath var2) {
      this.a = var1;
      this.Z = var2;
   }

   @Override
   public void y(com.cB_3 var1, List var2) {
      String[] var3 = com.cB_3.C();
      if (var1 == this.a.b(this.Z)) {
         for (com.cB_3 var5 : var2) {
            this.a.z(var5.i());
            if (var3 == null) {
               return;
            }

            if (var3 == null) {
               break;
            }
         }

         this.a.C(this);
      }
   }

   @Override
   public void X(com.cB_3 var1, Throwable var2) {
      if (var1 == this.a.b(this.Z)) {
         this.a.C(this);
      }
   }
}





