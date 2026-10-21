package com.finalshell.task;

import com.finalshell.core.Connect;
import java.io.IOException;
import java.net.Socket;

public class Jm2 extends Thread {
   public final Connect P;

   public Jm2(Connect var1) {
      this.P = var1;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Socket var1 = this.P.v.accept();
            this.P.T(var1);
         } catch (IOException var2) {
            var2.printStackTrace();
         }
      }
   }
}





