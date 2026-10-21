package com;

import java.io.IOException;
import java.io.OutputStream;

public class iS_3 extends OutputStream {
   E0 A;
   byte[] m = new byte[1];

   iS_3(E0 var1) {
      this.A = var1;
   }

   @Override
   public void write(int var1) throws IOException {
      this.m[0] = (byte)var1;
      this.A.a(this.m);
   }

   @Override
   public void write(byte[] var1, int var2, int var3) throws IOException {
      super.write(var1, var2, var3);
   }

   @Override
   public void flush() throws IOException {
      this.A.K();
   }
}





