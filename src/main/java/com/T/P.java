package com.t;

import java.awt.Color;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeListener;

class P implements CaretListener {
   final ChangeListener q;
   final com.t.n_2 O;

   P(com.t.n_2 var1, ChangeListener var2) {
      this.O = var1;
      this.q = var2;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void caretUpdate(CaretEvent var1) {
      int var2 = com.t.n_2.g();

      label34: {
         int var10000;
         label40: {
            try {
               var10000 = com.t.n_2.N(this.O);
               if (var2 != 0) {
                  break label40;
               }

               if (var10000 != 0) {
                  return;
               }
            } catch (Throwable var8) {
               throw a(var8);
            }

            com.t.n_2.r(this.O).K(this.q);

            try {
               var10000 = Integer.parseInt(com.t.n_2.U(this.O).getText());
            } catch (Throwable var7) {
               boolean var10001 = false;
               break label34;
            }
         }

         try {
            int var3 = var10000;
            int var4 = Integer.parseInt(com.t.n_2.Z(this.O).getText());
            int var5 = Integer.parseInt(com.t.n_2.l(this.O).getText());
            com.t.n_2.y(this.O, new Color(var3, var4, var5));
            com.t.n_2.a(this.O, com.t.n_2.c(this.O), com.t.a_2.rgbField);
         } catch (Throwable var6) {
            boolean var9 = false;
         }
      }

      com.t.n_2.r(this.O).N(this.q);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





