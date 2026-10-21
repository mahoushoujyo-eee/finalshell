package com;

public class wY_3 implements Po_2 {
   private int w;
   private int M;
   private static final long a;

   public wY_3() {
      this((int)a, -1);
   }

   public wY_3(int var1, int var2) {
      this.w = var1;
      this.M = var2;
   }

   public void l(int var1) {
      this.w = var1;
   }

   public int h() {
      return this.w;
   }

   public void V(int var1) {
      this.M = var1;
   }

   public int a() {
      return this.M;
   }

   @Override
   public int D(float var1) {
      return NM.n(NM.X(var1, 0.0F, 1.0F), this.w, this.M);
   }

   static {
      long var0 = 3868612872042850842L;
      long var10002 = 1015303455102609946L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





