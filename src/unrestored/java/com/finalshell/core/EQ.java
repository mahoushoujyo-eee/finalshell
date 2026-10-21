package com.finalshell.core;

import com.finalshell.ui.panel.K42;
import com.finalshell.ui.panel.Kz4;
import java.util.List;

public class EQ extends EY {
   public final K42 t;

   public EQ(K42 var1) {
      this.t = var1;
   }

   @Override
   public boolean A() {
      return K42.e(this.t);
   }

   @Override
   public boolean d(List var1) {
      String var10000 = Kz4.M();
      this.t.l(var1);
      String var2 = var10000;
      int var3 = this.t.Z().size();
      if (var2 != null) {
         var3 = var3 > 0 ? 1 : 0;
      }

      return var3 != 0;
   }
}





