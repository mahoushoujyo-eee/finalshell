package com.finalshell.task;

import com.finalshell.connection.Connection7;
import com.finalshell.core.Connect;

public class TJ implements Runnable {
   final Connect b;
   public final String i;
   public final int M;

   TJ(Connect var1, String var2, int var3) {
      this.b = var1;
      this.i = var2;
      this.M = var3;
   }

   @Override
   public void run() {
      try {
         new Connection7(this.i, this.M);
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }
}





