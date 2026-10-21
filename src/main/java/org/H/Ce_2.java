package org.H;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Ce_2 extends org.H.Y {
   private final short G;

   Ce_2(short var1, short var2) {
      super(var1);
      this.G = var2;
   }

   public org.H.n_2 j(org.H.Cr_2 var1) {
      return var1.G(this.G);
   }

   private static org.H.Y x(short var0, DataInputStream var1) throws IOException {
      return new org.H.Ce_2(var0, var1.readShort());
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      var1.writeShort(this.G);
   }

   static org.H.Y n(short var0, DataInputStream var1) throws IOException {
      return x(var0, var1);
   }
}





