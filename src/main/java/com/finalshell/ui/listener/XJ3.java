package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Kz4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class XJ3 implements ActionListener {
   public final Kz4 I;

   public XJ3(Kz4 var1) {
      this.I = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      label53: {
         String var2;
         label49: {
            Kz4 var10000;
            label54: {
               label55: {
                  var2 = Kz4.M();
                  var10000 = this.I;
                  if (var2 != null) {
                     if (this.I.d != null) {
                        var4 = this.I.d.isVisible();
                        if (var2 == null) {
                           break label55;
                        }

                        if (var4) {
                           return;
                        }
                     }

                     var10000 = this.I;
                  }

                  if (var2 == null) {
                     break label54;
                  }

                  var4 = var10000.Z.getText().trim().equals("");
               }

               if (!var4) {
                  break label49;
               }

               var10000 = this.I;
            }

            var10000.X(null);
            if (var2 != null) {
               break label53;
            }
         }

         label31: {
            File var3 = new File(this.I.Z.getText());
            boolean var5 = var3.exists();
            if (var2 != null) {
               if (!var5) {
                  break label31;
               }

               var5 = var3.isDirectory();
            }

            if (var5) {
               this.I.X(var3);
               if (var2 != null) {
                  break label53;
               }
            }
         }

         this.I.P();
      }

      this.I.transferFocus();
   }
}





