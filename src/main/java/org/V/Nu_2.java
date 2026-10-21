package org.v;

import org.I;

public final class Nu_2 extends NV {
   public final boolean s;
   public final String o;
   public final NR l;

   public Nu_2(I var1, String var2, NR var3) {
      super(var1);
      this.s = true;
      this.o = var2;
      this.l = var3;
   }

   public Nu_2(I var1, NR var2, String var3) {
      super(var1);
      this.s = false;
      this.o = var3;
      this.l = var2;
   }

   @Override
   public String toString() {
      return this.s ? this.o + this.l : this.l + this.o;
   }

   @org.F.c
   @Override
   public Object i(_w_2 var1) throws Throwable {
      return var1.E(this);
   }
}





