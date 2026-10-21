package com;

public abstract class gl_4 extends gT_3 {
   protected int b;
   protected x4_2 F;
   protected int W;
   protected Po_2 a;
   private static final long d;

   public gl_4() {
      this.b = (int)d;
      this.F = new re_4();
      this.W = 1;
   }

   public void Q(int var1) {
      this.W = var1;
   }

   public int l() {
      return this.W;
   }

   public void H(Po_2 var1) {
      this.a = var1;
   }

   public Po_2 v() {
      return this.a;
   }

   public void R(int var1) {
      this.b = var1;
   }

   public int G() {
      return this.b;
   }

   public void t(x4_2 var1) {
      this.F = var1;
   }

   public x4_2 i() {
      return this.F;
   }

   static {
      long var0 = 2046934518452718646L;
      long var10002 = 210008003185478710L ^ var0;
      byte var10001 = -1;
      d = var10002;
   }
}





