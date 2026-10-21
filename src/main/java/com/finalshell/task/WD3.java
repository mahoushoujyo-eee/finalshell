package com.finalshell.task;

import com.finalshell.core.Qg2;
import java.net.Socket;

public class WD3 implements Runnable {
   final Socket h;
   final Qg2 T;

   WD3(Qg2 var1, Socket var2) {
      this.T = var1;
      this.h = var2;
   }

   @Override
   public void run() {
      try {
         this.T.I(this.h);
      } catch (Exception var2) {
      }
   }
}





