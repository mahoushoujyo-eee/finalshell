package com;

import java.net.Socket;

class wD_3 implements Runnable {
   final Socket h;
   final com.Qg_2 T;

   wD_3(com.Qg_2 var1, Socket var2) {
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





