package com;

class B2 extends com.Bs_2 {
   final com.dC_3 f;

   B2(com.dC_3 var1, com.dC_3 var2, int var3, int var4, com.YP var5) {
      super(var2, var3, var4, var5);
      this.f = var1;
   }

   @Override
   protected void t() {
      synchronized (this.f) {
         com.dC_3.G(this.f).remove(this);
      }
   }
}





