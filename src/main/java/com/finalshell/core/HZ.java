package com.finalshell.core;

import java.util.Objects;

public class HZ extends HP_2 {
   final String y;
   final Hd2[] c;
   final H3_2 U;

   HZ(H3_2 var1, Hd2 var2, String var3, Hd2[] var4) {
      this.U = var1;
      this.y = var3;
      this.c = var4;
      Objects.requireNonNull(var2);
      super(var2);
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
      return false;
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
      return this.y;
   }

   @Override
   public Hd2[] d() {
      return this.c;
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





