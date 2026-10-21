package org.H;

import java.io.DataOutputStream;
import java.io.IOException;

class e_2 extends org.H.Y {
   final byte[] n;
   final org.H.Cr_2 F;

   e_2(org.H.Cr_2 var1, short var2, byte[] var3) {
      super(var2);
      this.F = var1;
      this.n = var3;
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      var1.write(this.n);
   }
}





