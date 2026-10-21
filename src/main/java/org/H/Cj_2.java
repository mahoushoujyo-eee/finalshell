package org.H;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Cj_2 extends org.H.Y {
   private final org.H.r_2 S;

   public Cj_2(short var1, org.H.r_2 var2) {
      super(var1);
      this.S = var2;
   }

   private static org.H.Y W(short var0, DataInputStream var1) throws IOException {
      return new org.H.Cj_2(var0, org.H.Cr_2.d(var1));
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      var1.writeByte(this.S.s());
      this.S.E(var1);
   }

   static org.H.Y H(short var0, DataInputStream var1) throws IOException {
      return W(var0, var1);
   }
}





