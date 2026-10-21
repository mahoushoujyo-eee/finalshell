package com.finalshell.core;

import com.finalshell.ui.model.CB3;
import java.util.List;
import javax.swing.tree.TreePath;

public class SK extends ST {
   final TreePath Z;
   final com.finalshell.ui.panel.Us2 a;

   SK(com.finalshell.ui.panel.Us2 var1, TreePath var2) {
      this.a = var1;
      this.Z = var2;
   }

   @Override
   public void y(CB3 var1, List var2) {
      String[] var3 = CB3.C$arrString();
      if (var1 == this.a.b(this.Z)) {
         for (CB3 var5 : var2) {
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
   public void X(CB3 var1, Throwable var2) {
      if (var1 == this.a.b(this.Z)) {
         this.a.C(this);
      }
   }
}





