package com.finalshell.core;

import java.util.Objects;

public class FJ_2 extends F9 implements FL_3 {
   FJ_2(B3_2 var1) {
      Objects.requireNonNull(var1);
      super(var1);
   }

   @Override
   public void K() {
      int var1 = this.E % 4;
      if (var1 != 0) {
         B3_2 var2 = this.J();
         var2.j(this);
         var2.c(4 - var1);
         var2.Y();
      }
   }
}





