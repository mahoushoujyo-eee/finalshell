package com.finalshell.ui.listener;

import com.finalshell.core.WC_2;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Rt2 extends ComponentAdapter {
   public final Window F;
   public final Window E;
   public boolean i = true;
   public Point r;

   public Rt2(Window var1, Window var2) {
      this.F = var1;
      this.E = var2;
      this.r = var2.getLocation();
   }

   public boolean P() {
      return this.i;
   }

   public void x(boolean var1) {
      this.i = var1;
   }

   public void s$void() {
      this.r = this.E.getLocation();
   }

   public Window s$Window() {
      return this.F;
   }

   public Window F() {
      return this.E;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.s$void();
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      int[] var2 = WC_2.V();
      Rt2 var10000 = this;
      if (var2 == null) {
         if (!this.P()) {
            return;
         }

         var10000 = this;
      }

      Window var5 = var10000.F;
      if (var2 == null) {
         if (var10000.F == null) {
            return;
         }

         var5 = this.E;
      }

      if (var2 == null) {
         if (var5 == null) {
            return;
         }

         var5 = this.E;
      }

      Point var3 = var5.getLocation();
      Point var4 = this.F.getLocation();
      this.F.setLocation(var4.x + var3.x - this.r.x, var4.y + var3.y - this.r.y);
      this.r = var3;
   }

   public static Rt2 q(Window var0, Window var1) {
      Rt2 var2 = new Rt2(var0, var1);
      var1.addComponentListener(var2);
      return var2;
   }

   public static void f(Window var0, Rt2 var1) {
      var0.removeComponentListener(var1);
   }
}





