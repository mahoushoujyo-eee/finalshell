package com.finalshell.ui.model;

import com.finalshell.core.Oi4;
import com.finalshell.util.Xy4;

public final class A_2 extends B2 {
   public final Xy4 s;

   public A_2(Xy4 var1) {
      super(var1);
      this.s = var1;
   }

   @Override
   public Object next() {
      return this.L().getKey();
   }

   public A_2(Xy4 var1, Oi4 var2) {
      this(var1);
   }
}





