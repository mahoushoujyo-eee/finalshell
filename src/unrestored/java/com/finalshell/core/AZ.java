package com.finalshell.core;

import com.finalshell.ui.model.US;
import org.jetbrains.annotations.NotNull;

public class AZ extends Ug2{
   @NotNull
   public final QT j;
   @NotNull
   public final Im4 b;
   @NotNull
   public final Rx4 p;
   @NotNull
   public US d = US.Unknown;
   public boolean v = false;

   public AZ(@NotNull QT var1, @NotNull Im4 var2, @NotNull Rx4 var3) {
      this.j = var1;
      this.b = var2;
      this.p = var3;
   }

   @Override
   public void N(char var1, int var2) {
      this.v = true;
      DC3 var3 = this.d();
      YP var4 = this.p.W().H();
      var3.V(var2, new com.finalshell.ui.model.J2(var1, 1), var4);
      this.f(var3);
   }

   @Override
   public void O(int var1, int var2) {
      this.v = true;
      DC3 var3 = this.d();
      var3.R(var1, var2, YP.r);
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
      boolean var1 = com.finalshell.ui.model.J2.P();
      AZ var10000 = this;
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
      this.b.h$void();
   }

   @Override
   public boolean x() {
      return this.b.T$boolean();
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
   public US e() {
      return this.d;
   }

   public void O(US var1) {
      this.d = var1;
   }

   @NotNull
   @Override
   public Xo2 S() {
      DC3 var1 = this.b.D(this.j.A() - 1);
      return new Xo2(new StringBuffer(var1.V$String()), this.j.z() - 1);
   }

   @Override
   public int f() {
      return this.j.R();
   }

   @NotNull
   public DC3 d() {
      boolean var10000 = com.finalshell.ui.model.J2.g();
      DC3 var2 = this.b.D(this.j.A() - 1);
      boolean var1 = var10000;
      DC3 var3 = var2.N;
      if (var1) {
         if (var2.N != null) {
            var2 = var2.N;
         }

         var3 = var2.X();
      }

      return var3;
   }

   public void f(@NotNull DC3 var1) {
      DC3 var2 = this.b.D(this.j.A() - 1);
      var2.N = var1;
   }
}





