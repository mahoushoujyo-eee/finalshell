package com.t;

import com.P9;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeListener;

class h implements CaretListener {
   final ChangeListener N;
   final com.t.n_2 m;

   h(com.t.n_2 var1, ChangeListener var2) {
      this.m = var1;
      this.N = var2;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void caretUpdate(CaretEvent var1) {
      int var2 = com.t.n_2.g();

      label34: {
         com.t.n_2 var10000;
         label40: {
            try {
               var10000 = this.m;
               if (var2 != 0) {
                  break label40;
               }

               if (com.t.n_2.N(this.m)) {
                  return;
               }
            } catch (Throwable var6) {
               throw a(var6);
            }

            com.t.n_2.r(this.m).K(this.N);

            try {
               com.t.n_2.y(this.m, P9.C(com.t.n_2.E(this.m).getText()));
               var10000 = this.m;
            } catch (Throwable var5) {
               boolean var10001 = false;
               break label34;
            }
         }

         try {
            com.t.n_2.a(var10000, com.t.n_2.c(this.m), com.t.a_2.hexField);
         } catch (Throwable var4) {
            boolean var7 = false;
         }
      }

      com.t.n_2.r(this.m).N(this.N);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





