package com.finalshell.task;

import com.finalshell.core.Jk2;
import com.finalshell.core.TR;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Kn4 implements Runnable {
   Object[] T;
   String K;
   String N;

   Kn4(Object[] var1) {
      this.T = var1;
      this.K = this.N = null;
   }

   Kn4(Object[] var1, String var2, String var3) {
      this.T = var1;
      this.K = var2;
      this.N = var3;
   }

   public final void L() {
      this.Q(true);
   }

   public final void Q(boolean var1) {
      String[] var2 = Jk2.Y();
      if (var1) {
         Thread var3 = new Thread(this);
         var3.start();
         if (var2 != null) {
            return;
         }
      }

      this.run();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void run() {
      String[] var1 = Jk2.Y();

      try {
         String var10000;
         label49: {
            label45: {
               try {
                  var10000 = this.K;
                  if (var1 == null) {
                     break label49;
                  }

                  if (this.K != null) {
                     break label45;
                  }
               } catch (UnknownHostException var6) {
                  throw a(var6);
               }

               InetAddress var2 = InetAddress.getByName((String)this.T[0]);
               this.T[1] = var2;
               Long var3 = new Long(TR.J(var2));

               try {
                  this.T[2] = this.T[3] = var3;
                  if (var1 != null) {
                     return;
                  }
               } catch (UnknownHostException var5) {
                  boolean var10001 = false;
                  throw a(var5);
               }
            }

            try {
               var10000 = this.K;
            } catch (UnknownHostException var4) {
               boolean var11 = false;
               throw a(var4);
            }
         }

         InetAddress var8 = InetAddress.getByName(var10000);
         InetAddress var9 = InetAddress.getByName(this.N);
         this.T[2] = new Long(TR.J(var8));
         this.T[3] = new Long(TR.J(var9));
      } catch (UnknownHostException var7) {
      }
   }

   public static UnknownHostException a(UnknownHostException var0) {
      return var0;
   }
}





