package com.finalshell.ui.listener;

import com.finalshell.core.WC_2;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class M implements FocusListener, MouseListener {
   public Boolean k;
   public Boolean m;
   public Component p;
   public boolean W = false;
   public boolean o = false;

   public static void I(Component var0, Component var1, Boolean var2, Boolean var3) {
      int[] var10000 = WC_2.V();
      M var5 = new M(var1, var2, var3);
      int[] var4 = var10000;
      Boolean var6 = var2;
      if (var4 == null) {
         if (var2 != null) {
            var0.addFocusListener(var5);
         }

         var6 = var3;
      }

      if (var6 != null) {
         var0.addMouseListener(var5);
      }
   }

   public M(Component var1) {
      this(var1, null, null);
   }

   public M(Component var1, Boolean var2, Boolean var3) {
      this.W(var1);
      this.C(var2);
      this.q(var3);
   }

   public Boolean P() {
      return this.k;
   }

   public void C(Boolean var1) {
      this.k = var1;
   }

   public Boolean W() {
      return this.m;
   }

   public void q(Boolean var1) {
      this.m = var1;
   }

   public Component Y() {
      return this.p;
   }

   public void W(Component var1) {
      this.p = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      int[] var2 = WC_2.V();
      M var10000 = this;
      if (var2 == null) {
         if (this.k == null) {
            return;
         }

         this.W = true;
         var10000 = this;
      }

      var10000.n();
   }

   @Override
   public void focusLost(FocusEvent var1) {
      int[] var2 = WC_2.V();
      M var10000 = this;
      if (var2 == null) {
         if (this.k == null) {
            return;
         }

         this.W = false;
         var10000 = this;
      }

      var10000.n();
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      int[] var2 = WC_2.V();
      M var10000 = this;
      if (var2 == null) {
         if (this.m == null) {
            return;
         }

         this.o = true;
         var10000 = this;
      }

      var10000.n();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      int[] var2 = WC_2.V();
      M var10000 = this;
      if (var2 == null) {
         if (this.m == null) {
            return;
         }

         this.o = false;
         var10000 = this;
      }

      var10000.n();
   }

   public void n() {
      this.p.setVisible(this.g());
   }

   public boolean g() {
      int[] var1;
      boolean var4;
      label60: {
         label63: {
            var1 = WC_2.V();
            Boolean var10000 = this.k;
            if (var1 == null) {
               if (this.k == null) {
                  break label63;
               }

               var10000 = this.k;
            }

            var4 = var10000;
            if (var1 != null) {
               break label60;
            }

            if (var4 != this.W) {
               var4 = false;
               break label60;
            }
         }

         var4 = true;
      }

      boolean var2;
      label49: {
         label64: {
            var2 = var4;
            Boolean var5 = this.m;
            if (var1 == null) {
               if (this.m == null) {
                  break label64;
               }

               var5 = this.m;
            }

            var4 = var5;
            if (var1 != null) {
               break label49;
            }

            if (var4 != this.o) {
               var4 = false;
               break label49;
            }
         }

         var4 = true;
      }

      boolean var3 = var4;
      var4 = var2;
      if (var1 == null) {
         if (!var2) {
            return false;
         }

         var4 = var3;
      }

      return var1 != null ? var4 : var4;
   }
}





