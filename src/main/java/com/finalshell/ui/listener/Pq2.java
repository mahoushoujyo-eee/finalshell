package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K42;
import com.finalshell.ui.panel.Kk4;
import com.finalshell.ui.panel.Kz4;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class Pq2 extends MouseAdapter {
   public boolean f;
   final K42 h;
   final com.finalshell.ui.panel.O b;
   final String W;
   final String E;
   final Kk4 z;

   Pq2(Kk4 var1, K42 var2, com.finalshell.ui.panel.O var3, String var4, String var5) {
      this.z = var1;
      this.h = var2;
      this.b = var3;
      this.W = var4;
      this.E = var5;
      this.f = K42.K(this.z.E);
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String var10000 = Kz4.M();
      this.z.requestFocusInWindow();
      String var2 = var10000;
      if (var2 != null) {
         label35:
         if (SwingUtilities.isRightMouseButton(var1)) {
            K42 var3 = this.z.E;
            if (var2 != null) {
               if (this.z.E.I) {
                  boolean var10001 = this.f;
                  if (var2 != null) {
                     var10001 = !this.f;
                  }

                  label43: {
                     this.f = var10001;
                     Pq2 var4 = this;
                     if (var2 != null) {
                        if (this.f) {
                           var5 = this.W;
                           break label43;
                        }

                        var4 = this;
                     }

                     var5 = var4.E;
                  }

                  this.b.setText(var5);
                  if (var2 != null) {
                     break label35;
                  }
               }

               var3 = this.z.E;
            }

            boolean var6 = this.z.E.o();
            if (var2 != null) {
               var6 = !var6;
            }

            var3.N(var6);
         }

         Kk4.L(this.z);
      }
   }
}





