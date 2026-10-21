package com;

class gp_4 extends gj_4 {
   final com.yp_4 K;

   gp_4(com.yp_4 var1) {
      this.K = var1;
   }

   @Override
   protected float q(float var1) {
      var1 += com.yp_4.f(this.K) * (float)Math.sin((double)(var1 * 2.0F) * Math.PI);
      return 1.0F - (float)Math.exp((double)(-var1 * com.yp_4.o(this.K)));
   }
}





