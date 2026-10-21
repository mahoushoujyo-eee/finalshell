package com.finalshell.core;

import java.io.DataOutputStream;
import java.io.IOException;

public abstract class CB_3 implements R2_3 {
   public final byte J;
   public final short h;

   public CB_3(byte var1, short var2) {
      this.J = var1;
      this.h = var2;
   }

   @Override
   public byte s() {
      return this.J;
   }

   @Override
   public void E(DataOutputStream var1) throws IOException {
      var1.writeShort(this.h);
   }

   @C_9
   @Override
   public Object d(M2_4 var1) throws Throwable {
      return this.b(var1);
   }

   @C_9
   protected abstract Object b(G2_3 var1) throws Throwable;
}





