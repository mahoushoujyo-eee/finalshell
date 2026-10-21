package com.finalshell.core;

import java.awt.BasicStroke;

public class LO extends LA {
   public float[] x = LQ3.D;
   public float X = LQ3.M;

   public LO() {
      this.p();
   }

   public LO(float[] var1) {
      this.k(var1);
   }

   public LO(float[] var1, float var2) {
      this.k(var1);
      this.e(var2);
   }

   public float[] n() {
      return this.x;
   }

   public void k(float[] var1) {
      this.x = var1;
      this.p();
      this.l();
   }

   public float S() {
      return this.X;
   }

   public void e(float var1) {
      this.X = var1;
      this.p();
      this.l();
   }

   @Override
   public void p() {
      this.h = new BasicStroke((float)this.a(), 1, 1, 0.0F, this.n(), this.S());
   }
}





