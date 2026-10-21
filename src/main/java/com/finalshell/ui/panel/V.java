package com.finalshell.ui.panel;

import com.finalshell.core.D;
import com.finalshell.ui.dialog.Y2;
import java.awt.Dimension;

public class V extends O {
   final D u;

   public V(D var1) {
      this.u = var1;
   }

   @Override
   public String getText() {
      int[] var10000 = Y2.M$arrint();
      String var2 = this.u.i$String();
      int[] var1 = var10000;
      String var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            return this.u.s;
         }

         var3 = var2;
      }

      if (var1 == null) {
         return var3;
      } else {
         return !var3.equals("") ? var2 : this.u.s;
      }
   }

   @Override
   public Dimension getPreferredSize() {
      Dimension var1 = super.getPreferredSize();
      var1.width = Math.min(var1.width, this.u.z);
      return var1;
   }

   public Dimension k() {
      return super.getPreferredSize();
   }
}





