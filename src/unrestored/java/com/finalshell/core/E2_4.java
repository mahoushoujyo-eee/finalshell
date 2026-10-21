package com.finalshell.core;

import java.io.DataOutputStream;
import java.io.IOException;

public class E2_4 extends Y_3 {
   public final byte[] n;
   public final Cr2_2 F;

   public E2_4(Cr2_2 var1, short var2, byte[] var3) {
      super(var2);
      this.F = var1;
      this.n = var3;
   }

   @Override
   public void T(DataOutputStream var1) throws IOException {
      var1.write(this.n);
   }
}





