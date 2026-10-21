package com.finalshell.core;

import java.util.Objects;

public class P_2_5 extends U3_3 {
   public final String g;
   public final Hd2 X;

   public P_2_5(Hd2 var1, String var2, Hd2 var3) {
      Objects.requireNonNull(var1);
      super(var1);
      this.g = var2;
      this.X = var3;
   }

   @Override
   public Object J() {
      return H3_2.K;
   }

   @Override
   public String h() {
      return this.g;
   }

   @Override
   public Hd2 P() {
      return this.X;
   }

   @Override
   public boolean b() {
      return false;
   }

   @Override
   public com.finalshell.ui.model.S_3 p() {
      return com.finalshell.ui.model.S_3.DEFAULT;
   }

   @Override
   public H4_2[] f() {
      return new H4_2[0];
   }
}





