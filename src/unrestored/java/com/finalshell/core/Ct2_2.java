package com.finalshell.core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Ct2_2 extends Y_3 {
   public final short i;

   public Ct2_2(short var1, short var2) {
      super(var1);
      this.i = var2;
   }

   public static Y_3 w(short var0, DataInputStream var1) throws IOException {
      return new Ct2_2(var0, var1.readShort());
   }

   @Override
   public void T(DataOutputStream var1) throws IOException {
      var1.writeShort(this.i);
   }

   public static Y_3 N(short var0, DataInputStream var1) throws IOException {
      return w(var0, var1);
   }
}





