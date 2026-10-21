package com.finalshell.task;

import com.finalshell.core.A0;
import java.io.IOException;

public class B9 implements Runnable {
   public final A0 l;

   public B9(A0 var1) {
      this.l = var1;
   }

   @Override
   public void run() {
      try {
         this.l.x.close();
      } catch (IOException var2) {
      }
   }
}





