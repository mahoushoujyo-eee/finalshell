package com.finalshell.task;

import com.finalshell.core.BN3;
import com.finalshell.core.Bi4;

public class DV implements Runnable {
   DV() {
   }

   @Override
   public void run() {
      Bi4.O = true;
      byte[] var1 = new byte[1];

      try {
         int var2 = BN3.J.read(var1, 0, var1.length);
      } catch (Exception var3) {
         Bi4.B = true;
      }

      Bi4.O = false;
   }
}





