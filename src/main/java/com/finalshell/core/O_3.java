package com.finalshell.core;

import java.awt.Color;

public class O_3 extends R_2 {
   public O_3() {
      this(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public O_3(float[] var1) {
      this.T = var1[0];
      this.o = var1[1];
      this.I = var1[2];
      this.z = var1[3];
   }

   public O_3(float var1, float var2, float var3, float var4) {
      this.T = var1;
      this.o = var2;
      this.I = var3;
      this.z = var4;
   }

   public O_3(O_3 var1) {
      this.T = var1.T;
      this.o = var1.o;
      this.I = var1.I;
      this.z = var1.z;
   }

   public O_3(R_2 var1) {
      this.T = var1.T;
      this.o = var1.o;
      this.I = var1.I;
      this.z = var1.z;
   }

   public O_3(Color var1) {
      this.x(var1);
   }

   public void x(Color var1) {
      this.B(var1.getRGBComponents(null));
   }

   public Color d() {
      return new Color(this.T, this.o, this.I, this.z);
   }
}





