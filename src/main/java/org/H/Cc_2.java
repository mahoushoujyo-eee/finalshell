package org.H;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Cc_2 extends org.H.Y {
   private final short h;

   public Cc_2(short var1, short var2) {
      super(var1);
      this.h = var2;
   }

   public String Q(org.H.Cr_2 var1) {
      return var1.S(this.h);
   }

   private static org.H.Y Z(short var0, DataInputStream var1) throws IOException {
      return new org.H.Cc_2(var0, var1.readShort());
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      var1.writeShort(this.h);
   }

   static org.H.Y J(short var0, DataInputStream var1) throws IOException {
      return Z(var0, var1);
   }
}





