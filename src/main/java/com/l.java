package com;

public class l extends com.R {
   public l() {
      this(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public l(float[] var1) {
      this.T = var1[0];
      this.o = var1[1];
      this.I = var1[2];
      this.z = var1[3];
   }

   public l(float var1, float var2, float var3, float var4) {
      this.T = var1;
      this.o = var2;
      this.I = var3;
      this.z = var4;
   }

   public l(l var1) {
      this.T = var1.T;
      this.o = var1.o;
      this.I = var1.I;
      this.z = var1.z;
   }

   public l(com.R var1) {
      this.T = var1.T;
      this.o = var1.o;
      this.I = var1.I;
      this.z = var1.z;
   }

   public float B(l var1) {
      return Math.abs(this.T - var1.T) + Math.abs(this.o - var1.o) + Math.abs(this.I - var1.I) + Math.abs(this.z - var1.z);
   }

   public float D(l var1) {
      float var2 = this.T - var1.T;
      float var3 = this.o - var1.o;
      float var4 = this.I - var1.I;
      float var5 = this.z - var1.z;
      return var2 * var2 + var3 * var3 + var4 * var4 + var5 * var5;
   }

   public float r(l var1) {
      float var2 = this.T - var1.T;
      float var3 = this.o - var1.o;
      float var4 = this.I - var1.I;
      float var5 = this.z - var1.z;
      return (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4 + var5 * var5));
   }
}





