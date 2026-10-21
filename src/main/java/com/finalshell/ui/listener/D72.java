package com.finalshell.ui.listener;

import com.finalshell.core.NE3;
import com.finalshell.ui.panel.KD3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class D72 implements ActionListener {
   public final KD3 R;

   public D72(KD3 var1) {
      this.R = var1;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = KD3.u();

      IOException var7;
      label30: {
         label29: {
            try {
               var10000 = this.R;
               if (var2 != null) {
                  break label29;
               }

               if (KD3.b(this.R) == null) {
                  return;
               }
            } catch (IOException var6) {
               throw a(var6);
            }

            try {
               var10000 = this.R;
            } catch (IOException var5) {
               var7 = var5;
               boolean var10001 = false;
               break label30;
            }
         }

         try {
            KD3.U(var10000, new File(KD3.b(this.R)));
            return;
         } catch (IOException var4) {
            var7 = var4;
            boolean var8 = false;
         }
      }

      IOException var3 = var7;
      NE3.g(this, var3);
   }

   public static IOException a(IOException var0) {
      return var0;
   }
   private static Object var10000;
}





