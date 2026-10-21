package com.finalshell.core;

public class BE3 {
   public int M = 0;
   public UR I;
   public String w;

   public BE3(UR var1, int var2) {
      this.M = var2;
      this.I = var1;
      this.w = var1.v + "-" + var2;
   }

   @Override
   public boolean equals(Object var1) {
      BE3 var2 = (BE3)var1;
      return var2.w.equals(this.w);
   }

   @Override
   public int hashCode() {
      return this.w.hashCode();
   }
}





