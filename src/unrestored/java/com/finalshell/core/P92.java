package com.finalshell.core;

public class P92 {
   public int i;
   public int l;
   public int q;
   public int W;
   public int z;
   public int G;
   public float V;
   public float f;

   public P92(int var1, int var2, int var3, int var4) {
      this.i = var1;
      this.l = var2;
      this.q = var3;
      this.W = var4;
   }

   public void o() {
      this.z = this.q - this.i;
      this.G = this.W - this.l;
      this.f = (float)(this.z * this.z + this.G * this.G);
      this.V = (float)Math.sqrt((double)this.f);
   }
}





