package com.finalshell.ui.panel;

import com.finalshell.ui.dialog.D2;
import java.awt.Dimension;

public class BE extends By_2 {
   final D2 C;

   BE(D2 var1, int var2, int var3, int var4) {
      super(var2, var3, var4);
      this.C = var1;
   }

   @Override
   public Dimension getPreferredSize() {
      Dimension var1 = super.getPreferredSize();
      if (D2.b(this.C) > 0) {
         var1.width = D2.b(this.C);
      }

      return var1;
   }
}





