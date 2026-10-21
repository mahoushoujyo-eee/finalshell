package com.finalshell.core;

public class Rr4 implements SC {
   public float U = 10.0F;

   public void B(float var1) {
      this.U = var1;
   }

   public float a() {
      return this.U;
   }

   @Override
   public float h(float var1, float var2) {
      float var3 = UZ.x(var1 + 0.5F, var2) * this.U;
      float var4 = UZ.x(var1, var2 + 0.5F) * this.U;
      return UZ.x(var1 + var3, var2 + var4);
   }
}





