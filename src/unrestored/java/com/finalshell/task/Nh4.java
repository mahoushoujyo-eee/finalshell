package com.finalshell.task;
import com.finalshell.reflect.Ref;

import com.finalshell.core.Dm4;
import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Registry;

public class Nh4 implements Runnable {
   public final ConnectHost t;

   public Nh4(ConnectHost var1) {
      this.t = var1;
   }

   @Override
   public void run() {
      boolean var1 = Dm4.F$boolean();

      while (this.t.t$boolean()) {
         try {
            this.t.U$void();
         } catch (Exception var4) {
            var4.printStackTrace();
            if (var1) {
               break;
            }
         }

         try {
            Thread.sleep((long)((Integer)Ref.g(327550303567808343L, null)).intValue());
         } catch (InterruptedException var3) {
            var3.printStackTrace();
            if (!var1) {
               break;
            }
         }
      }
   }
}





