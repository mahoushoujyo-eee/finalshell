package com.finalshell.core;

import java.util.Objects;

public class Hx2_2 extends HP_2 {
   public final String T;
   public final Hd2[] P;
   public final H3_2 c;

   public Hx2_2(H3_2 var1, Hd2 var2, String var3, Hd2[] var4) {
   super(var2);
      this.c = var1;
      this.T = var3;
      this.P = var4;
      Objects.requireNonNull(var2);
   }

   @Override
   public H4_2[] f() {
      return new H4_2[0];
   }

   public com.finalshell.ui.model.S_3 p$_S() {
      return com.finalshell.ui.model.S_3.PUBLIC;
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public boolean F() {
      return false;
   }

   public Hd2 p$hd_2() {
      return Hd2.G;
   }

   @Override
   public String K() {
      return this.T;
   }

   @Override
   public Hd2[] d() {
      return this.P;
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public Hd2[] S() {
      return new Hd2[0];
   }
}





