package org.H;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Ct_2 extends org.H.Y {
   private final short i;

   public Ct_2(short var1, short var2) {
      super(var1);
      this.i = var2;
   }

   private static org.H.Y w(short var0, DataInputStream var1) throws IOException {
      return new org.H.Ct_2(var0, var1.readShort());
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      var1.writeShort(this.i);
   }

   static org.H.Y N(short var0, DataInputStream var1) throws IOException {
      return w(var0, var1);
   }
}





