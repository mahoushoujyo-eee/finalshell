package com;

public class v extends com.R {
   public v() {
      this(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public v(float[] var1) {
      this.T = var1[0];
      this.o = var1[1];
      this.I = var1[2];
      this.z = var1[2];
   }

   public v(float var1, float var2, float var3, float var4) {
      this.T = var1;
      this.o = var2;
      this.I = var3;
      this.z = var4;
   }

   public v(com.v var1) {
      this.T = var1.T;
      this.o = var1.o;
      this.I = var1.I;
      this.z = var1.z;
   }

   public v(com.R var1) {
      this.T = var1.T;
      this.o = var1.o;
      this.I = var1.I;
      this.z = var1.z;
   }

   public float n(com.v var1) {
      return var1.T * this.T + var1.o * this.o + var1.I * this.I + var1.z * this.z;
   }

   public float Q() {
      return (float)Math.sqrt((double)(this.T * this.T + this.o * this.o + this.I * this.I + this.z * this.z));
   }

   public void P() {
      float var1 = 1.0F / (this.T * this.T + this.o * this.o + this.I * this.I + this.z * this.z);
      this.T *= var1;
      this.o *= var1;
      this.I *= var1;
      this.z *= var1;
   }
}





