package com.finalshell.task;

import com.finalshell.core.B2;
import com.finalshell.core.UR;

public class VE implements Runnable {
   public final B2 U;
   public final UR z;

   public VE(B2 var1, UR var2) {
      this.U = var1;
      this.z = var2;
   }

   @Override
   public void run() {
      this.z.H = true;
      this.z.R(true);
   }
}





