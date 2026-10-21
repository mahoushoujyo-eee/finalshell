package com.finalshell.task;

import com.finalshell.core.Connect5;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Fs4 extends Thread {
   public final Connect5 n;
   public final ServerSocket V;

   public Fs4(Connect5 var1, ServerSocket var2) {
      this.n = var1;
      this.V = var2;
   }

   @Override
   public void run() {
      while (true) {
         try {
            Socket var1 = this.V.accept();
            this.n.n(var1);
         } catch (IOException var2) {
            var2.printStackTrace();
         }
      }
   }
}





