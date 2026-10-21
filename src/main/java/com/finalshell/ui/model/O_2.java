package com.finalshell.ui.model;

import com.finalshell.core.Oi4;
import com.finalshell.util.Xy4;

public final class O_2 extends B2 {
   final Xy4 C;

   public O_2(Xy4 var1) {
      super(var1);
      this.C = var1;
   }

   @Override
   public Object next() {
      return this.L().u;
   }

   O_2(Xy4 var1, Oi4 var2) {
      this(var1);
   }
}





