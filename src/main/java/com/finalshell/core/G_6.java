package com.finalshell.core;

public class G_6 implements I2_4 {
   final String r;
   final String y;
   final M_8 c;

   G_6(M_8 var1, String var2, String var3) {
      this.c = var1;
      this.r = var2;
      this.y = var3;
   }

   @Override
   public String toString() {
      return M_8.Q(this.c).B(this.r) + this.y;
   }
}





