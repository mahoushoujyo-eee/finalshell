package com.finalshell.core;

public class R32_2 extends RQ {
   public final NV_2 S;

   public R32_2(com.finalshell.ui.model.I var1, NV_2 var2) {
      super(var1);
      this.S = var2;
   }

   @Override
   public void e(Rx2_2 var1) {
      this.S.d(var1);
   }

   @C_9
   @Override
   public Object R(FY_2 var1) throws Throwable {
      return var1.S(this);
   }

   @Override
   public String toString() {
      return this.S.toString();
   }
}





