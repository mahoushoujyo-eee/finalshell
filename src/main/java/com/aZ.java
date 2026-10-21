package com;

import org.jetbrains.annotations.NotNull;

public class aZ implements ug_2 {
   @NotNull
   private final com.QT j;
   @NotNull
   private final im_4 b;
   @NotNull
   private final rx_4 p;
   @NotNull
   private uS d = uS.Unknown;
   private boolean v = false;

   public aZ(@NotNull com.QT var1, @NotNull im_4 var2, @NotNull rx_4 var3) {
      this.j = var1;
      this.b = var2;
      this.p = var3;
   }

   @Override
   public void N(char var1, int var2) {
      this.v = true;
      com.dC_3 var3 = this.d();
      com.YP var4 = this.p.W().H();
      var3.V(var2, new j_2(var1, 1), var4);
      this.f(var3);
   }

   @Override
   public void O(int var1, int var2) {
      this.v = true;
      com.dC_3 var3 = this.d();
      var3.R(var1, var2, com.YP.r);
      this.f(var3);
   }

   @Override
   public void B() {
      this.b.z();
   }

   @Override
   public void e(int var1) {
   }

   @Override
   public void N() {
      boolean var1 = j_2.P();
      com.aZ var10000 = this;
      if (!var1) {
         if (this.v) {
            this.b.D();
         }

         var10000 = this;
      }

      var10000.v = false;
   }

   @Override
   public void U() {
      this.b.w();
   }

   @Override
   public void D() {
      this.b.h();
   }

   @Override
   public boolean x() {
      return this.b.T();
   }

   @Override
   public boolean E() {
      return this.p.W().d();
   }

   @Override
   public long j() {
      return this.p.W().h();
   }

   @NotNull
   @Override
   public uS e() {
      return this.d;
   }

   public void O(uS var1) {
      this.d = var1;
   }

   @NotNull
   @Override
   public Xo_2 S() {
      com.dC_3 var1 = this.b.D(this.j.A() - 1);
      return new Xo_2(new StringBuffer(var1.V()), this.j.z() - 1);
   }

   @Override
   public int f() {
      return this.j.R();
   }

   @NotNull
   private com.dC_3 d() {
      boolean var10000 = j_2.g();
      com.dC_3 var2 = this.b.D(this.j.A() - 1);
      boolean var1 = var10000;
      com.dC_3 var3 = var2.N;
      if (var1) {
         if (var2.N != null) {
            var2 = var2.N;
         }

         var3 = var2.X();
      }

      return var3;
   }

   private void f(@NotNull com.dC_3 var1) {
      com.dC_3 var2 = this.b.D(this.j.A() - 1);
      var2.N = var1;
   }
}





