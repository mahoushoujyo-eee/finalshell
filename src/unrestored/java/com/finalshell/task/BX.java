package com.finalshell.task;

import com.finalshell.connection.Connection7;
import com.finalshell.crypto.PingMessageReceiver;
import java.io.IOException;
import java.io.OutputStream;

public class BX extends Thread {
   public final Connection7 J;
   public final OutputStream y;
   public static long a;

   public BX(Connection7 var1, OutputStream var2) {
      this.J = var1;
      this.y = var2;
   }

   @Override
   public void run() {
      String[] var10000 = PingMessageReceiver.N();
      int var2 = 0;
      String[] var1 = var10000;

      while (true) {
         try {
            this.y.write(new byte[(int)a]);
         } catch (IOException var4) {
            var4.printStackTrace();
         }

         var2++;

         while (var2 > 1) {
            if (var1 != null) {
               return;
            }
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 2178795676662593198L;
      long var10002 = 5504536141268863022L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





