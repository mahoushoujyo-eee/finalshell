package com.finalshell.ui.model;

import com.finalshell.core.Oi4;
import com.finalshell.util.Xy4;
import java.util.Map.Entry;

public final class K extends B2 {
   public final Xy4 f;

   public K(Xy4 var1) {
      super(var1);
      this.f = var1;
   }

   public Entry S() {
      return this.L();
   }

   @Override
   public Object next() {
      return this.S();
   }

   public K(Xy4 var1, Oi4 var2) {
      this(var1);
   }
}





