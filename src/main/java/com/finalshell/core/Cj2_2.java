package com.finalshell.core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Cj2_2 extends Y_3 {
   public final R2_3 S;

   public Cj2_2(short var1, R2_3 var2) {
      super(var1);
      this.S = var2;
   }

   public static Y_3 W(short var0, DataInputStream var1) throws IOException {
      return new Cj2_2(var0, Cr2_2.d$r_2(var1));
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      var1.writeByte(this.S.s());
      this.S.E(var1);
   }

   static Y_3 H(short var0, DataInputStream var1) throws IOException {
      return W(var0, var1);
   }
}





