package com.finalshell.task;

import com.finalshell.core.Or4;
import java.io.IOException;

public class KW implements Runnable {
   public final Or4 D;

   public KW(Or4 var1) {
      this.D = var1;
   }

   @Override
   public void run() {
      try {
         this.D.H.close();
      } catch (IOException var2) {
      }
   }
}





