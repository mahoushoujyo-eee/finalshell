package com.finalshell.task;

import com.finalshell.core.A0;
import java.io.IOException;

public class Jv2 implements Runnable {
   public final A0 I;

   public Jv2(A0 var1) {
      this.I = var1;
   }

   @Override
   public void run() {
      try {
         this.I.L.close();
      } catch (IOException var2) {
      }
   }
}





