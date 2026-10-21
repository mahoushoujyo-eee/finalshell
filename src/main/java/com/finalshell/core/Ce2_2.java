package com.finalshell.core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Ce2_2 extends Y_3 {
   public final short G;

   public Ce2_2(short var1, short var2) {
      super(var1);
      this.G = var2;
   }

   public N2_3 j(Cr2_2 var1) {
      return var1.G(this.G);
   }

   public static Y_3 x(short var0, DataInputStream var1) throws IOException {
      return new Ce2_2(var0, var1.readShort());
   }

   @Override
   public void T(DataOutputStream var1) throws IOException {
      var1.writeShort(this.G);
   }

   public static Y_3 n(short var0, DataInputStream var1) throws IOException {
      return x(var0, var1);
   }
}





