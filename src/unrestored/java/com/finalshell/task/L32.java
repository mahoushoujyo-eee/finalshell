package com.finalshell.task;

import com.finalshell.core.FO;
import com.finalshell.crypto.PingMessageReceiver;
import java.io.IOException;
import java.net.DatagramPacket;

public class L32 implements Runnable {
   public final FO F;
   public static long a;

   public L32(FO var1) {
      this.F = var1;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void run() {
      label38: {
         String[] var1 = PingMessageReceiver.N();
         if (var1 != null) {
            try {
               if (!this.F.H) {
                  break label38;
               }
            } catch (IOException var9) {
               boolean var10001 = false;
               throw new RuntimeException(a(var9));
            }
         }

         while (true) {
            byte[] var2 = new byte[(int)a];
            DatagramPacket var3 = new DatagramPacket(var2, var2.length);

            try {
               this.F.K.receive(var3);
               this.F.B(var3);
            } catch (IOException var8) {
               try {
                  if (var1 != null) {
                     break;
                  }
               } catch (IOException var7) {
                  boolean var10 = false;
                  throw new RuntimeException(a(var7));
               }
            }

            try {
               if (!this.F.H) {
                  break;
               }
            } catch (IOException var6) {
               boolean var11 = false;
               throw new RuntimeException(a(var6));
            }
         }
      }

      try {
         ;
      } catch (IOException var5) {
         boolean var12 = false;
         throw new RuntimeException(a(var5));
      }
   }

   public static IOException a(IOException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5808219319646314783L;
      long var10002 = -8117510636330261309L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





