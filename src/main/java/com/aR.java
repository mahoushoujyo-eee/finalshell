package com;

import java.awt.event.KeyEvent;
import java.util.function.Predicate;
import org.jetbrains.annotations.Nullable;

class aR extends com.aD {
   final pA_3 b;

   aR(pA_3 var1, com.zT var2, Predicate var3) {
      super(var2, var3);
      this.b = var1;
   }

   @Override
   public boolean X(@Nullable KeyEvent var1) {
      return var1 != null || pA_3.e(this.b) != null;
   }
}





