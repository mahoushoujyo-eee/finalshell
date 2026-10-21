package com.finalshell.core;

import java.util.Objects;

public class HY_2 extends Hv2_2 {
   final Hd2[] i;
   final H3_2 h;

   HY_2(H3_2 var1, Hd2 var2, Hd2[] var3) {
      this.h = var1;
      this.i = var3;
      Objects.requireNonNull(var2);
      super(var2);
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public Hd2[] d() {
      return this.i;
   }

   @Override
   public com.finalshell.ui.model.S_3 p() {
      return com.finalshell.ui.model.S_3.PUBLIC;
   }

   @Override
   public Hd2[] S() {
      return new Hd2[0];
   }

   @Override
   public H4_2[] f() {
      return new H4_2[0];
   }
}





