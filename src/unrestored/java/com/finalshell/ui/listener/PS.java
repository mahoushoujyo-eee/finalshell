package com.finalshell.ui.listener;

import com.finalshell.core.GR;
import com.finalshell.ui.panel.II;
import com.finalshell.ui.panel.Wb2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PS extends KeyAdapter {
   public final II a;

   public PS(II var1) {
      this.a = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      String var2 = Wb2.m$String();
      int var10000 = II.d(this.a).size();
      if (var2 != null) {
         if (var10000 <= 0) {
            return;
         }

         var10000 = this.a.i();
      }

      int var3 = var10000;
      boolean var4 = GR.rF.J(var1);
      if (var2 != null) {
         if (var4) {
            int var6;
            label105: {
               var6 = var3;
               byte var10002 = -1;
               if (var2 != null) {
                  label77:
                  if (var3 != -1) {
                     var6 = var3;
                     if (var2 != null) {
                        if (var3 == 0) {
                           break label77;
                        }

                        var6 = var3;
                     }

                     var6 -= 1;
                     break label105;
                  }

                  var6 = II.d(this.a).size();
                  var10002 = 1;
               }

               var6 -= var10002;
            }

            this.a.T(var6);
            if (var2 != null) {
               return;
            }
         }

         var4 = GR.lx.J(var1);
      }

      if (var2 != null) {
         if (var4) {
            int var7;
            var7 = var3;
            label58:
            if (var2 != null) {
               label55:
               if (var3 != -1) {
                  var7 = var3;
                  int var9 = II.d(this.a).size() - 1;
                  if (var2 != null) {
                     if (var3 == var9) {
                        break label55;
                     }

                     var7 = var3;
                     var9 = 1;
                  }

                  var7 += var9;
                  break label58;
               }

               var7 = 0;
            }

            this.a.T(var7);
            if (var2 != null) {
               return;
            }
         }

         var4 = GR.lG.J(var1);
      }

      if (var2 != null) {
         if (var4) {
            this.a.T(0);
            if (var2 != null) {
               return;
            }
         }

         var4 = GR.lj.J(var1);
      }

      if (var4) {
         this.a.T(II.d(this.a).size() - 1);
      }
   }
}





