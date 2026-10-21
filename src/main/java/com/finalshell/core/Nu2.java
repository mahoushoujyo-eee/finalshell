package com.finalshell.core;

public final class Nu2 extends NV_2 {
   public final boolean s;
   public final String o;
   public final NR_2 l;

   public Nu2(com.finalshell.ui.model.I var1, String var2, NR_2 var3) {
      super(var1);
      this.s = true;
      this.o = var2;
      this.l = var3;
   }

   public Nu2(com.finalshell.ui.model.I var1, NR_2 var2, String var3) {
      super(var1);
      this.s = false;
      this.o = var3;
      this.l = var2;
   }

   @Override
   public String toString() {
      return this.s ? this.o + this.l : this.l + this.o;
   }

   @C_9
   @Override
   public Object i(C_w_2 var1) throws Throwable {
      return var1.E(this);
   }
}





