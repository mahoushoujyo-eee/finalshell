package com.finalshell.core;

import com.finalshell.ui.listener.Xo4;
import com.finalshell.ui.model.G6;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.File;
import javax.swing.JList;

public class W22 extends WO3 {
   protected Object t = null;

   @Override
   protected void W(JList var1) {
      this.Q = new Xo4(this, var1);
      var1.addKeyListener(this.Q);
   }

   @Override
   protected void H(JList var1) {
      var1.removeKeyListener(this.Q);
   }

   public boolean E(JList var1, int var2, Wo4 var3) {
      String var4;
      File var6;
      label41: {
         var4 = com.finalshell.ui.panel.Co2.U$String();
         Wo4 var10000 = var3;
         if (var4 != null) {
            if (var3 == null) {
               var6 = null;
               break label41;
            }

            var10000 = var3;
         }

         var6 = var10000.T();
      }

      File var5 = var6;
      var6 = var5;
      if (var4 != null) {
         if (var5 == null) {
            return false;
         }

         var6 = var5;
      }

      boolean var8 = Cz2.J(var6);
      if (var4 != null) {
         if (!var8) {
            return false;
         }

         var8 = super.T(var1, var2, var3);
      }

      return var4 == null ? var8 : var8;
   }

   protected Ne4 r(JList var1, int var2, Wo4 var3) {
      Ne4 var5 = Ne4.r(true, Wx4.n, Wx4.y);
      String var10000 = com.finalshell.ui.panel.Co2.U$String();
      var5.c$void(false);
      String var4 = var10000;
      Ne4 var7 = var5;
      if (var4 != null) {
         Cz2.D(var5, var3.T());
         if (var1 instanceof com.finalshell.ui.panel.Co2) {
            byte var6 = (((com.finalshell.ui.panel.Co2)var1).Q().equals(G6.tiles)) ? 1 : 0;
            int var10001 = var6;
            if (var4 != null) {
               var10001 = var6 != 0 ? 2 : 0;
            }

            var5.setHorizontalAlignment(var10001);
         }

         var7 = var5;
      }

      return var7;
   }

   protected Rectangle U(JList var1, int var2, Wo4 var3, Rectangle var4) {
      String var5 = com.finalshell.ui.panel.Co2.U$String();
      JList var10000 = var1;
      if (var5 != null) {
         if (!(var1 instanceof com.finalshell.ui.panel.Co2)) {
            return super.O(var1, var2, var3, var4);
         }

         var10000 = var1;
      }

      com.finalshell.ui.panel.OQ var6 = ((com.finalshell.ui.panel.Co2)var10000).l$OQ();
      Rectangle var7 = var6.C();
      Dimension var8 = ((Ne4)this.d).getPreferredSize();
      return new Rectangle(var7.x, var7.y + var7.height / 2 - var8.height / 2, var7.width, var8.height);
   }

   public Wo4 e(JList var1, int var2, Wo4 var3) {
      String var10000 = com.finalshell.ui.panel.Co2.U$String();
      this.t = var1.getSelectedValue();
      File var5 = new File(var3.T().getParent(), ((Ne4)this.d).getText());
      String var4 = var10000;
      Wo4 var6 = var3;
      if (var4 != null) {
         if (var3.T().renameTo(var5)) {
            W22 var7 = this;
            if (var4 != null) {
               if (this.t != var3) {
                  return new Wo4(var5);
               }

               var7 = this;
            }

            var7.t = var5;
            return new Wo4(var5);
         }

         var6 = var3;
      }

      return var6;
   }

   public boolean L(JList var1, int var2, Wo4 var3, Wo4 var4, boolean var5) {
      String var6 = com.finalshell.ui.panel.Co2.U$String();
      boolean var10000 = var1.getModel() instanceof EP3;
      if (var6 != null) {
         if (var10000) {
            EP3 var7 = (EP3)var1.getModel();
            var10000 = var3.T().getAbsolutePath().equals(var4.T().getAbsolutePath());
            if (var6 != null) {
               if (!var10000) {
                  label25: {
                     label24: {
                        var7.X(var4, var2);
                        if (var6 != null) {
                           if (this.t == null) {
                              break label24;
                           }

                           var1.setSelectedValue(this.t, true);
                        }

                        if (var6 != null) {
                           break label25;
                        }
                     }

                     var1.clearSelection();
                  }

                  var1.repaint();
                  return true;
               }

               var10000 = false;
            }

            return var10000;
         }

         var10000 = super.U(var1, var2, var3, var4, var5);
      }

      return var10000;
   }

   @Override
   public boolean U(JList var1, int var2, Object var3, Object var4, boolean var5) {
      return this.L(var1, var2, (Wo4)var3, (Wo4)var4, var5);
   }

   @Override
   protected Rectangle O(JList var1, int var2, Object var3, Rectangle var4) {
      return this.U(var1, var2, (Wo4)var3, var4);
   }

   @Override
   protected Component j(JList var1, int var2, Object var3) {
      return this.r(var1, var2, (Wo4)var3);
   }

   @Override
   public boolean T(JList var1, int var2, Object var3) {
      return this.E(var1, var2, (Wo4)var3);
   }

   @Override
   public Object E(JList var1, int var2, Object var3) {
      return this.e(var1, var2, (Wo4)var3);
   }
}





