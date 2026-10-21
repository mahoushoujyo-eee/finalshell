package com;

import java.util.ArrayList;
import java.util.List;

class Nm_2 implements Np_2 {
   final com.cB_3 J;
   final com.zn_2 y;

   Nm_2(com.zn_2 var1, com.cB_3 var2) {
      this.y = var1;
      this.J = var2;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void S(List var1) {
      String[] var10000 = com.cB_3.C();
      Object var3 = this.y.f;
      synchronized (this.y.f){} // $VF: monitorenter 
      String[] var2 = var10000;
      boolean var19 = false /* VF: Semaphore variable */;

      try {
         var19 = true;
         this.y.i.put(this.J.H(), var1);
         this.y.g(var1);
         // $VF: monitorexit
         var19 = false;
      } finally {
         if (var19) {
            // $VF: monitorexit
         }
      }

      var3 = this.y.Y(this.J, var1);
      Object var4 = this.y.f;
      synchronized (this.y.f) {
         this.y.g.put(this.J.H(), true);
      }

      label149: {
         label156: {
            var10000 = (String[])var3;
            label146:
            if (var2 != null) {
               if (var3 != null) {
                  var10000 = (String[])var3;
                  if (var2 == null) {
                     break label146;
                  }

                  if (var3.size() > 0) {
                     this.y.o((List)var3, this.J, 0);
                  }
               }

               var4 = this.y.K;
               synchronized (this.y.K){} // $VF: monitorenter 

               try {
                  this.J.Y(ux_2.loaded);
                  this.y.nodeChanged(this.J);
                  var10000 = (String[])var4;
               } catch (Throwable var23) {
                  var28 = var23;
                  boolean var10001 = false;
                  break label156;
               }
            }

            label137:
            try {
               // $VF: monitorexit
               break label149;
            } catch (Throwable var22) {
               var28 = var22;
               boolean var29 = false;
               break label137;
            }
         }

         Throwable var6 = var28;
         // $VF: monitorexit
         throw var6;
      }

      this.y.s(this.J, (List)var3);
      if (com.ky_4.F() != null) {
         com.cB_3.s(new String[4]);
      }
   }

   @Override
   public void l(Throwable var1) {
      synchronized (this.y.f) {
         this.y.i.put(this.J.H(), new ArrayList(0));
         this.y.g.put(this.J.H(), true);
      }

      synchronized (this.y.K) {
         this.J.Y(ux_2.failed);
         this.J.o(var1);
         this.y.nodeChanged(this.J);
      }

      this.y.r(this.J, var1);
   }
}





