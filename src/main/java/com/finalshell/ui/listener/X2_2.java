package com.finalshell.ui.listener;

import com.finalshell.core.RS3;
import java.util.Date;

public class X2_2 extends XA3 {
   final RS3 w;

   X2_2(RS3 var1) {
      super(var1);
      this.w = var1;
   }

   @Override
   public void y(Object var1) {
      ((com.finalshell.core.Lk4)RS3.U(this.w)).R((Date)var1);
   }

   @Override
   public Object G() {
      ((com.finalshell.core.Lk4)RS3.S(this.w)).V(false);
      return ((com.finalshell.core.Lk4)RS3.a(this.w)).E();
   }
}





