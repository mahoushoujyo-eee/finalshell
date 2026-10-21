package com.finalshell.core;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public abstract class Y_3 {
   public final short b;

   public Y_3(short var1) {
      this.b = var1;
   }

   public void B(DataOutputStream var1) throws IOException {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      this.T(new DataOutputStream(var2));
      var1.writeShort(this.b);
      var1.writeInt(var2.size());
      var2.writeTo(var1);
   }

   public abstract void T(DataOutputStream var1) throws IOException;

   public static short H(Y_3 var0) {
      return var0.b;
   }
}





