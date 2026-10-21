package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class HG extends MouseAdapter {
   protected Component A;
   protected boolean B = false;
   protected Component V = null;
   protected Point k = null;
   protected Rectangle C = null;

   public static void Y(Component var0) {
      X(var0, null);
   }

   public static void X(Component var0, Component var1) {
      HG var2 = new HG(var1);
      var0.addMouseListener(var2);
      var0.addMouseMotionListener(var2);
   }

   public HG() {
      this(null);
   }

   public HG(Component var1) {
      this.A = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int[] var2 = com.finalshell.ui.dialog.Ds2.U$arrint();
      if (var2 == null) {
         if (!SwingUtilities.isLeftMouseButton(var1)) {
            return;
         }

         this.V = this.T(var1);
      }

      HG var10000 = this;
      if (var2 == null) {
         if (this.V == null) {
            return;
         }

         var10000 = this;
      }

      Rectangle var3 = var10000.V(var1);
      Rectangle var4 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return;
         }

         var4 = var3;
      }

      if (var4.contains(var1.getPoint())) {
         this.B = true;
         this.k = MouseInfo.getPointerInfo().getLocation();
         this.C = this.V.getBounds();
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      if (this.B) {
         Point var2 = MouseInfo.getPointerInfo().getLocation();
         this.V.setLocation(this.C.x + (var2.x - this.k.x), this.C.y + (var2.y - this.k.y));
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.B = false;
      this.V = null;
      this.k = null;
      this.C = null;
   }

   protected Component T(MouseEvent var1) {
      int[] var2 = com.finalshell.ui.dialog.Ds2.U$arrint();
      HG var10000 = this;
      if (var2 == null) {
         if (this.A == null) {
            return FN.L(var1.getComponent());
         }

         var10000 = this;
      }

      return var10000.A;
   }

   protected Rectangle V(MouseEvent var1) {
      return FN.N(var1.getComponent());
   }
}





