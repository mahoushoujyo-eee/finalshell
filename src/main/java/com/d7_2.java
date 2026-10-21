package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

class d7_2 implements ActionListener {
   final com.kD_3 R;

   d7_2(com.kD_3 var1) {
      this.R = var1;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = com.kD_3.u();

      IOException var7;
      label30: {
         label29: {
            try {
               var10000 = this.R;
               if (var2 != null) {
                  break label29;
               }

               if (com.kD_3.b(this.R) == null) {
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
            com.kD_3.U(var10000, new File(com.kD_3.b(this.R)));
            return;
         } catch (IOException var4) {
            var7 = var4;
            boolean var8 = false;
         }
      }

      IOException var3 = var7;
      nE_3.g(this, var3);
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





