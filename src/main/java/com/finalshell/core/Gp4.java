package com.finalshell.core;

public class Gp4 extends Gj4 {
   public final Yp4 K;

   public Gp4(Yp4 var1) {
      this.K = var1;
   }

   @Override
   public float q(float var1) {
      var1 += Yp4.f(this.K) * (float)Math.sin((double)(var1 * 2.0F) * Math.PI);
      return 1.0F - (float)Math.exp((double)(-var1 * Yp4.o(this.K)));
   }
}





