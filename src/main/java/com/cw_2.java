package com;

import java.util.List;

class Cw_2 implements Runnable {
   final com.zn_2 Z;
   final List A;
   final com.cB_3 r;
   final int G;
   final us_2 H;
   final com.Yz_2 i;

   Cw_2(com.Yz_2 var1, com.zn_2 var2, List var3, com.cB_3 var4, int var5, us_2 var6) {
      this.i = var1;
      this.Z = var2;
      this.A = var3;
      this.r = var4;
      this.G = var5;
      this.H = var6;
   }

   @Override
   public void run() {
      this.Z.u(this.A, this.r, this.G);
      this.H.R(this.A);
      com.o2_2.P(this.H, new iF_3(this));
   }
}





