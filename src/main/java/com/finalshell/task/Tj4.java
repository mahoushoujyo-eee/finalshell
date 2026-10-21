package com.finalshell.task;

import com.finalshell.core.Or4;
import java.io.IOException;

public class Tj4 implements Runnable {
   final Or4 P;

   Tj4(Or4 var1) {
      this.P = var1;
   }

   @Override
   public void run() {
      try {
         this.P.e.close();
      } catch (IOException var2) {
      }
   }
}





