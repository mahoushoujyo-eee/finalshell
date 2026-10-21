package com.finalshell.ui.listener;

import com.finalshell.core.A5;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeListener;

public class G5 implements CaretListener {
   public final ChangeListener f;
   public final com.finalshell.ui.panel.N_2 V;

   public G5(com.finalshell.ui.panel.N_2 var1, ChangeListener var2) {
      this.V = var1;
      this.f = var2;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void caretUpdate(CaretEvent var1) {
      int var2 = com.finalshell.ui.panel.N_2.W();

      label34: {
         int var10000;
         label40: {
            try {
               var10000 = (com.finalshell.ui.panel.N_2.N(this.V)) ? 1 : 0;
               if (var2 == 0) {
                  break label40;
               }

               if (var10000 != 0) {
                  return;
               }
            } catch (Throwable var8) {
               throw new RuntimeException(a(var8));
            }

            com.finalshell.ui.panel.N_2.r(this.V).K(this.f);

            try {
               var10000 = Integer.parseInt(com.finalshell.ui.panel.N_2.t(this.V).getText());
            } catch (Throwable var7) {
               boolean var10001 = false;
               break label34;
            }
         }

         try {
            float var3 = (float)var10000 / 360.0F;
            float var4 = (float)Integer.parseInt(com.finalshell.ui.panel.N_2.f(this.V).getText()) / 100.0F;
            float var5 = (float)Integer.parseInt(com.finalshell.ui.panel.N_2.o(this.V).getText()) / 100.0F;
            com.finalshell.ui.panel.N_2.y(this.V, new A5(var3, var4, var5).E());
            com.finalshell.ui.panel.N_2.a(this.V, com.finalshell.ui.panel.N_2.c(this.V), com.finalshell.ui.model.A2.hsbField);
         } catch (Throwable var6) {
            boolean var9 = false;
         }
      }

      com.finalshell.ui.panel.N_2.r(this.V).N(this.f);
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }
}





