package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.core.TR_2;
import com.finalshell.ui.panel.K32;
import com.finalshell.ui.panel.KC3;
import com.finalshell.ui.panel.Ko4;
import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import javax.swing.SwingUtilities;

public class UY2 extends MouseAdapter {
   public int l;
   public final KC3 a;
   public final Ko4 G;

   public UY2(Ko4 var1, KC3 var2) {
      this.G = var1;
      this.a = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int[] var2 = K32.L$arrint();
      boolean var10000 = FN.l((Component)this.G);
      if (var2 != null) {
         if (!var10000) {
            this.G.transferFocus();
         }

         var10000 = this.G.V.isEnabled();
      }

      if (var2 != null) {
         if (!var10000) {
            return;
         }

         var10000 = SwingUtilities.isLeftMouseButton(var1);
      }

      if (var2 != null) {
         if (!var10000) {
            return;
         }

         Ko4.r(this.G, true);
      }

      this.l = this.i();
      KC3.H(this.G.V).setComponentZOrder(this.G, 0);
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      int[] var2 = K32.L$arrint();
      Ko4 var10000 = this.G;
      if (var2 != null) {
         if (!Ko4.Q(this.G)) {
            return;
         }

         this.G.V.v().y(this.G, this.i() - this.l);
         var10000 = this.G;
      }

      var10000.revalidate();
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      int var11;
      int var13;
      int[] var10000 = K32.L$arrint();
      Ko4 var3 = this.G;
      TR_2 var4 = this.G.V.v();
      int[] var2 = var10000;
      int var10 = (SwingUtilities.isLeftMouseButton(var1)) ? 1 : 0;
      if (var2 != null) {
         if (var10 == 0) {
            return;
         }

         var10 = (Ko4.Q(this.G)) ? 1 : 0;
      }

      label95: {
         label85: {
            label84: {
               label96: {
                  if (var2 != null) {
                     if (var10 == 0) {
                        return;
                     }

                     Ko4.r(this.G, false);
                     if (var2 == null) {
                        break label96;
                     }

                     var10 = this.i() - this.l;
                  }

                  if (var10 != 0) {
                     var11 = var4.b().size();
                     if (var2 == null) {
                        break label85;
                     }

                     if (var11 > 1) {
                        break label84;
                     }
                  }

                  var4.y(var3, null);
               }

               if (var2 != null) {
                  break label95;
               }
            }

            var11 = var4.z(var3);
         }

         int var5 = var11;
         int var6 = this.E(var3);
         int var7 = 0;
         Iterator var8 = var4.b().iterator();

         label98: {
            int var14;
            label99: {
               while (true) {
                  if (var8.hasNext()) {
                     Component var9 = (Component)var8.next();
                     if (var2 == null) {
                        break;
                     }

                     label58:
                     if (var9 != var3) {
                        int var12 = var6;
                        var14 = this.E(var9);
                        if (var2 != null) {
                           if (var6 <= var14) {
                              break label58;
                           }

                           var12 = var4.z(var9);
                           var14 = 1;
                        }

                        var7 = var12 + var14;
                     }

                     if (var2 != null) {
                        continue;
                     }
                  }

                  var13 = var7;
                  var14 = var5;
                  if (var2 == null) {
                     break label99;
                  }

                  if (var7 > var5) {
                     var7--;
                  }

                  var4.y(var3, null);
                  break;
               }

               if (var2 == null) {
                  break label98;
               }

               var13 = var5;
               var14 = var7;
            }

            if (var13 == var14) {
               break label95;
            }

            var4.removeLayoutComponent(var3);
            var4.u(var7, var3);
            KC3.s(this.G.V);
         }

         KC3.U(this.G.V, var3.I(), var5, var7);
      }

      var3.revalidate();
   }

   public int E(Component var1) {
      Rectangle var2 = var1.getBounds();
      return var2.y + var2.height / 2;
   }

   public int i() {
      return MouseInfo.getPointerInfo().getLocation().y;
   }
}





