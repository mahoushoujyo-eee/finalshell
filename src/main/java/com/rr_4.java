package com;

public class rr_4 implements SC {
   private float U = 10.0F;

   public void B(float var1) {
      this.U = var1;
   }

   public float a() {
      return this.U;
   }

   @Override
   public float h(float var1, float var2) {
      float var3 = uZ.x(var1 + 0.5F, var2) * this.U;
      float var4 = uZ.x(var1, var2 + 0.5F) * this.U;
      return uZ.x(var1 + var3, var2 + var4);
   }
}





