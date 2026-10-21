package com.finalshell.task;

import com.finalshell.core.AU;
import com.finalshell.core.DH;
import java.io.IOException;

public class Cu2 implements Runnable {
   public final AU Y;
   public final DH q;

   public Cu2(DH var1, AU var2) {
      this.q = var1;
      this.Y = var2;
   }

   @Override
   public void run() {
      try {
         this.q.H(this.Y);
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }
}





