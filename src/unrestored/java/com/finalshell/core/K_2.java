package com.finalshell.core;

public class K_2 extends HM {
   public K_2() {
      super(new Kv2(new UZ(), 6.0F));
   }

   public K_2(SC var1) {
      super(var1);
   }

   @Override
   public float h(float var1, float var2) {
      return (float)Math.pow(0.5 * (Math.sin(8.0 * (double)this.T.h(var1, var2)) + 1.0), 0.77);
   }
}





