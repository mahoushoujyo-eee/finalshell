package com.finalshell.core;

import com.finalshell.crypto.PingMessageR;

public class W_2_2 {
   int B;
   int s;
   int x;
   int G;
   int n;
   int l;
   boolean M = false;
   int X;

   W_2_2() {
   }

   float i() {
      String[] var1;
      int var2;
      label23: {
         String[] var10000 = PingMessageR.N();
         var2 = this.h() - this.C();
         var1 = var10000;
         int var4 = var2;
         if (var1 != null) {
            if (var2 >= 0) {
               break label23;
            }

            var4 = 0;
         }

         var2 = var4;
      }

      float var3 = 0.0F;
      int var5 = this.h();
      if (var1 != null) {
         if (var5 <= 0) {
            return var3;
         }

         var5 = var2;
      }

      return (float)var5 / (float)this.h();
   }

   float m() {
      String[] var10000 = PingMessageR.N();
      float var2 = 0.0F;
      String[] var1 = var10000;
      int var3 = this.f();
      if (var1 != null) {
         if (var3 <= 0) {
            return var2;
         }

         var3 = this.L();
      }

      return (float)var3 / (float)this.f();
   }

   void h(int var1) {
      this.X += var1;
   }

   void m(int var1) {
      this.x++;
      this.B += var1;
   }

   void z(int var1) {
      this.s += var1;
   }

   public int h() {
      return this.B;
   }

   public int e() {
      return this.x;
   }

   public int C() {
      return this.G;
   }

   public void K(int var1) {
      if (var1 > this.G) {
         this.G = var1;
      }
   }

   public int j() {
      return this.n;
   }

   public void t(int var1) {
      this.n = var1;
   }

   public int G() {
      return this.l;
   }

   public void W(int var1) {
      this.l = var1;
      this.M = true;
   }

   public boolean n() {
      return this.M;
   }

   public int L() {
      return this.X;
   }

   public void R(int var1) {
      this.X = var1;
   }

   public int f() {
      return this.s;
   }

   public void q(int var1) {
      this.s = var1;
   }
}





