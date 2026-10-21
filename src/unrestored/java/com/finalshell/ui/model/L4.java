package com.finalshell.ui.model;

import com.finalshell.core.Kf2;
import com.finalshell.core.N_3;
import com.finalshell.core.W82;
import java.util.List;

public final class L4 extends LN {
   public L4(String var1, int var2) {
      super(var1, var2, null);
   }

   @Override
   public String W(W82 var1, int var2) {
      List var3 = ((Kf2)var1.s()).q();
      return var2 == var3.size() ? var1.b().x().O() : ((N_3)var3.get(var2)).U;
   }
}





