package com.finalshell.task;

import com.finalshell.core.BN3;
import com.finalshell.core.Bj4;
import java.io.IOException;

public class OX implements Runnable {
   final byte[] S;

   OX(byte[] var1) {
      this.S = var1;
   }

   @Override
   public void run() {
      Bj4.t = true;
      Bj4.x = true;

      try {
         Bj4.F = BN3.J.read(this.S, 0, this.S.length);
         Bj4.T = System.currentTimeMillis();
      } catch (IOException var2) {
         var2.printStackTrace();
      }

      Bj4.t = false;
   }
}





