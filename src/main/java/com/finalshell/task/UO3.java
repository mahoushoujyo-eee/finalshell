package com.finalshell.task;

import com.finalshell.core.BN3;
import com.finalshell.core.Bz4;
import java.io.IOException;

public class UO3 implements Runnable {
   final byte[] u;

   UO3(byte[] var1) {
      this.u = var1;
   }

   @Override
   public void run() {
      Bz4.o = true;

      try {
         Bz4.c = BN3.J.read(this.u, 0, this.u.length);
         Bz4.a = System.currentTimeMillis();
      } catch (IOException var2) {
         var2.printStackTrace();
      }

      Bz4.o = false;
   }
}





