package com;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class uO implements N3 {
   private static final ScheduledExecutorService i = Executors.newScheduledThreadPool(1);
   private final Object Z = new Object();
   private final Runnable f;
   private final long g;
   private Ib_2 v = null;

   public uO(Runnable var1, long var2) {
      this.f = var1;
      this.g = var2;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void q() {
      boolean var10000 = j_2.P();
      Object var2 = this.Z;
      synchronized (this.Z){} // $VF: monitorenter 
      boolean var1 = var10000;

      try {
         Object var6 = this.v;
         if (!var1) {
            if (this.v != null) {
               this.v.I();
            }

            this.v = new Ib_2(this);
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
      boolean var10000 = j_2.P();
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

   static long G(uO var0) {
      return var0.g;
   }

   static ScheduledExecutorService J() {
      return i;
   }

   static Runnable u(uO var0) {
      return var0.f;
   }
}





