package com.finalshell.core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Cc2 extends Y_3 {
   public final short h;

   public Cc2(short var1, short var2) {
      super(var1);
      this.h = var2;
   }

   public String Q(Cr2_2 var1) {
      return var1.S$String(this.h);
   }

   public static Y_3 Z(short var0, DataInputStream var1) throws IOException {
      return new Cc2(var0, var1.readShort());
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      var1.writeShort(this.h);
   }

   static Y_3 J(short var0, DataInputStream var1) throws IOException {
      return Z(var0, var1);
   }
}





