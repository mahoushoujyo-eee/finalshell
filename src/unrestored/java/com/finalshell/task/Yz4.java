package com.finalshell.task;

import com.finalshell.core.D6;
import com.finalshell.core.LH3_2;
import com.finalshell.core.Lc4_2;
import com.finalshell.core.Wu2;
import com.finalshell.crypto.PingMessageReceiver;
import java.io.IOException;
import java.net.DatagramPacket;

public class Yz4 implements Runnable {
   public final com.finalshell.core.PacketLossStats k;
   public static long a;

   public Yz4(com.finalshell.core.PacketLossStats var1) {
      this.k = var1;
   }

   @Override
   public void run() {
      String[] var1 = PingMessageReceiver.N();

      while (true) {
         byte[] var2 = new byte[(int)a];
         DatagramPacket var3 = new DatagramPacket(var2, var2.length);

         try {
            this.k.k.receive(var3);
            byte[] var4 = var3.getData();
            int var5 = LH3_2.z(var4, 0);

            while (var5 == D6.s) {
               Wu2 var6 = new Wu2(var3);
               int var7 = var6.l();
               Lc4_2 var8 = (Lc4_2)this.k.C.get(var7);
               if (var1 != null) {
                  Lc4_2 var10000;
                  label27: {
                     try {
                        var10000 = var8;
                        if (var1 == null) {
                           break label27;
                        }

                        if (var8 == null) {
                           break;
                        }
                     } catch (IOException var9) {
                        throw new RuntimeException(a(var9));
                     }

                     var8.B = true;
                     var8.m = System.currentTimeMillis();
                     var10000 = var8;
                  }

                  var10000.o = (int)(var8.m - var8.T);
                  break;
               }
            }
         } catch (IOException var10) {
            return;
         }
      }
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 6897935784349423364L;
      long var10002 = 7105626766262817540L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





