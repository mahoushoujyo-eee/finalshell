package org.H;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public abstract class Y {
   private final short b;

   public Y(short var1) {
      this.b = var1;
   }

   public void B(DataOutputStream var1) throws IOException {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      this.T(new DataOutputStream(var2));
      var1.writeShort(this.b);
      var1.writeInt(var2.size());
      var2.writeTo(var1);
   }

   protected abstract void T(DataOutputStream var1) throws IOException;

   static short H(org.H.Y var0) {
      return var0.b;
   }
}





