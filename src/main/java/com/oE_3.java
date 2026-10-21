package com;

public class oE_3 extends com.oy_4 {
   public oE_3() {
      this(0.0F, 0.0F, 0.0F);
   }

   public oE_3(float[] var1) {
      this.e = var1[0];
      this.I = var1[1];
      this.k = var1[2];
   }

   public oE_3(float var1, float var2, float var3) {
      this.e = var1;
      this.I = var2;
      this.k = var3;
   }

   public oE_3(com.oE_3 var1) {
      this.e = var1.e;
      this.I = var1.I;
      this.k = var1.k;
   }

   public oE_3(com.oy_4 var1) {
      this.e = var1.e;
      this.I = var1.I;
      this.k = var1.k;
   }

   public float w(com.oE_3 var1) {
      return Math.abs(this.e - var1.e) + Math.abs(this.I - var1.I) + Math.abs(this.k - var1.k);
   }

   public float n(com.oE_3 var1) {
      float var2 = this.e - var1.e;
      float var3 = this.I - var1.I;
      float var4 = this.k - var1.k;
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public float I(com.oE_3 var1) {
      float var2 = this.e - var1.e;
      float var3 = this.I - var1.I;
      float var4 = this.k - var1.k;
      return (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
   }
}





