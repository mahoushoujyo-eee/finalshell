package com.finalshell.core;

public class NL {
   public int j = 0;
   public UR T;
   public String r;

   public NL(UR var1, int var2) {
      this.j = var2;
      this.T = var1;
      this.r = var1.v + "-" + var2;
   }

   @Override
   public boolean equals(Object var1) {
      NL var2 = (NL)var1;
      return var2.r.equals(this.r);
   }

   @Override
   public int hashCode() {
      return this.r.hashCode();
   }
}





