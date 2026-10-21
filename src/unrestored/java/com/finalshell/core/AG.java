package com.finalshell.core;

import com.finalshell.ui.model.SY;
import java.util.EnumSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AG {
   public Et2 m;
   public Et2 L;
   public EnumSet j;
   public boolean Q = false;
   public boolean J = false;
   public boolean t;
   public YP v;

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

   public AG(@NotNull YP var1) {
      this.J = var1.m;
      this.Q = var1.W;
      this.v = var1;
      this.m = YP.i(var1);
      this.L = YP.r(var1);
      this.j = YP.h(var1).clone();
   }

   public AG() {
      this.m = null;
      this.L = null;
      this.j = EnumSet.noneOf(SY.class);
   }

   @NotNull
   public AG c(@Nullable Et2 var1) {
      this.m = var1;
      return this;
   }

   @NotNull
   public AG j(@Nullable Et2 var1) {
      this.L = var1;
      return this;
   }

   @NotNull
   public AG c(@NotNull SY var1, boolean var2) {
      SY.L(var1, this.j, var2);
      return this;
   }

   @NotNull
   public YP y() {
      YP var1 = new YP(this.m, this.L, this.j);
      var1.e(this.J);
      var1.C(this.Q);
      var1.t(this.t);
      return var1;
   }
}





