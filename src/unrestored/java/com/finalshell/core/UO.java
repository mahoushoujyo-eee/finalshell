package com.finalshell.core;

import com.finalshell.task.Ib2;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class UO implements N3 {
   public static ScheduledExecutorService i;
   public final Object Z = new Object();
   public final Runnable f;
   public final long g;
   public Ib2 v = null;

   public UO(Runnable var1, long var2) {
      this.f = var1;
      this.g = var2;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void q() {
      boolean var10000 = com.finalshell.ui.model.J2.P();
      Object var2 = this.Z;
      synchronized (this.Z){} // $VF: monitorenter 
      boolean var1 = var10000;

      try {
         Object var6 = this.v;
         if (!var1) {
            if (this.v != null) {
               this.v.I();
            }

            this.v = new Ib2(this);
            i.schedule(this.v, this.g, TimeUnit.NANOSECONDS);
            var6 = var2;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void y() {
      boolean var10000 = com.finalshell.ui.model.J2.P();
      Object var2 = this.Z;
      synchronized (this.Z){} // $VF: monitorenter 
      boolean var1 = var10000;

      try {
         Object var6 = this.v;
         if (!var1) {
            if (this.v != null) {
               this.v.I();
               this.v = null;
            }

            var6 = var2;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   public static long G(UO var0) {
      return var0.g;
   }

   public static ScheduledExecutorService J() {
      return i;
   }

   public static Runnable u(UO var0) {
      return var0.f;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      i = Executors.newScheduledThreadPool(1);
   }
}





