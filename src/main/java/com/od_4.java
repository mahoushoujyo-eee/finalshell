package com;

public class od_4 extends com.oy_4 {
   public od_4() {
      this(0.0F, 0.0F, 0.0F);
   }

   public od_4(float[] var1) {
      this.e = var1[0];
      this.I = var1[1];
      this.k = var1[2];
   }

   public od_4(float var1, float var2, float var3) {
      this.e = var1;
      this.I = var2;
      this.k = var3;
   }

   public od_4(com.od_4 var1) {
      this.e = var1.e;
      this.I = var1.I;
      this.k = var1.k;
   }

   public od_4(com.oy_4 var1) {
      this.e = var1.e;
      this.I = var1.I;
      this.k = var1.k;
   }

   public float z(com.od_4 var1) {
      return (float)Math.acos((double)(this.Y(var1) / (this.M() * var1.M())));
   }

   public float Y(com.od_4 var1) {
      return var1.e * this.e + var1.I * this.I + var1.k * this.k;
   }

   public void G(com.od_4 var1, com.od_4 var2) {
      this.e = var1.I * var2.k - var1.k * var2.I;
      this.I = var1.k * var2.e - var1.e * var2.k;
      this.k = var1.e * var2.I - var1.I * var2.e;
   }

   public float M() {
      return (float)Math.sqrt((double)(this.e * this.e + this.I * this.I + this.k * this.k));
   }

   public void E() {
      float var1 = 1.0F / (float)Math.sqrt((double)(this.e * this.e + this.I * this.I + this.k * this.k));
      this.e *= var1;
      this.I *= var1;
      this.k *= var1;
   }
}





