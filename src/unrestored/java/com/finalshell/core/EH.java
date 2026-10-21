package com.finalshell.core;

import com.finalshell.ui.model.CB3;
import java.io.File;
import java.util.List;

public class EH extends EY {
   public final com.finalshell.ui.panel.U22 r;

   public EH(com.finalshell.ui.panel.U22 var1) {
      this.r = var1;
   }

   @Override
   public boolean A() {
      return this.r.i;
   }

   @Override
   public boolean d(List var1) {
      String[] var2 = CB3.C$arrString();
      int var10000 = var1.size();
      if (var2 != null) {
         if (var10000 > 0) {
            this.r.q((File)var1.get(0), true);
            return true;
         }

         var10000 = 0;
      }

      return var10000 != 0;
   }
}





