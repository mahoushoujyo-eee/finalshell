package com.finalshell.task;

import com.finalshell.core.BF3;
import com.finalshell.core.BN3;
import java.io.IOException;

public class U8 implements Runnable {
   U8() {
   }

   @Override
   public void run() {
      BF3.L = true;

      try {
         BF3.W = System.currentTimeMillis();
         BF3.w = BN3.J.read(BF3.O, 0, BF3.O.length);
         BF3.D = System.currentTimeMillis();
      } catch (IOException var2) {
         var2.printStackTrace();
      }

      BF3.L = false;
   }
}





