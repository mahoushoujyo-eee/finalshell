package com;

import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class aG {
   private Et_2 m;
   private Et_2 L;
   private EnumSet j;
   boolean Q = false;
   boolean J = false;
   boolean t;
   com.YP v;

   public boolean C() {
      return this.Q;
   }

   public void H(boolean var1) {
      this.Q = var1;
   }

   public boolean o() {
      return this.J;
   }

   public void v(boolean var1) {
      this.J = var1;
   }

   public boolean b() {
      return this.t;
   }

   public void R(boolean var1) {
      this.t = var1;
   }

   public aG(@NotNull com.YP var1) {
      this.J = var1.m;
      this.Q = var1.W;
      this.v = var1;
      this.m = com.YP.i(var1);
      this.L = com.YP.r(var1);
      this.j = com.YP.h(var1).clone();
   }

   public aG() {
      this.m = null;
      this.L = null;
      this.j = EnumSet.noneOf(SY.class);
   }

   @NotNull
   public com.aG c(@Nullable Et_2 var1) {
      this.m = var1;
      return this;
   }

   @NotNull
   public com.aG j(@Nullable Et_2 var1) {
      this.L = var1;
      return this;
   }

   @NotNull
   public com.aG c(@NotNull SY var1, boolean var2) {
      SY.L(var1, this.j, var2);
      return this;
   }

   @NotNull
   public com.YP y() {
      com.YP var1 = new com.YP(this.m, this.L, this.j);
      var1.e(this.J);
      var1.C(this.Q);
      var1.t(this.t);
      return var1;
   }
}





