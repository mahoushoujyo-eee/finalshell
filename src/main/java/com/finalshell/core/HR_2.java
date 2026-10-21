package com.finalshell.core;

import java.util.Objects;

public class HR_2 extends HP_2 {
   public final HP_2 N;
   public final Hd2[] U;
   public final H3_2 m;

   public HR_2(H3_2 var1, Hd2 var2, HP_2 var3, Hd2[] var4) {
   super(var2);
      this.m = var1;
      this.N = var3;
      this.U = var4;
      Objects.requireNonNull(var2);
   }

   @Override
   public H4_2[] f() {
      return this.N.f();
   }

   public com.finalshell.ui.model.S_3 p$_S() {
      return this.N.p();
   }

   @Override
   public boolean F() {
      return true;
   }

   @Override
   public boolean u() {
      return this.N.u();
   }

   public Hd2 p$hd_2() throws B2_5 {
      return this.N.p();
   }

   @Override
   public String K() {
      return this.N.K();
   }

   @Override
   public Hd2[] d() throws B2_5 {
      return this.N.p();
   }

   @Override
   public boolean c() {
      return this.N.c();
   }

   @Override
   public Hd2[] S() {
      return this.U;
   }
}





