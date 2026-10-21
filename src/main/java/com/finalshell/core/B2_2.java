package com.finalshell.core;

public class B2_2 extends Bs2_2 {
   final DC3 f;

   B2_2(DC3 var1, DC3 var2, int var3, int var4, YP var5) {
      super(var2, var3, var4, var5);
      this.f = var1;
   }

   @Override
   protected void t() {
      synchronized (this.f) {
         DC3.G(this.f).remove(this);
      }
   }
}





