package com.finalshell.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

public class Ke4_2 {
   public InputStream K;
   public OutputStream Z;
   public boolean S = true;

   public Ke4_2(InputStream var1, OutputStream var2) {
      this.K = var1;
      this.Z = var2;
   }

   public void G(FY var1) throws IOException {
      Q8 var2 = new Q8(this, var1, this.K, this.Z);
      var2.o();
      this.Z.flush();
   }

   public void N(Map var1) throws IOException {
      ZModemFileStream var2 = new ZModemFileStream(this, var1, this.K, this.Z);
      var2.k();
      this.Z.flush();
   }

   public void g() {
      this.S = false;
   }

   public boolean J() {
      int var1 = com.finalshell.io.To2.L();
      boolean var10000 = this.S;
      if (var1 != 0) {
         var10000 = !this.S;
      }

      return var10000;
   }
}





