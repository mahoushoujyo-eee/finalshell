package com.finalshell.core;

import java.awt.Point;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.image.BufferedImage;
import java.lang.ref.WeakReference;
import javax.swing.JComponent;

public abstract class Ix4 implements Up2 {
   protected Point r;
   protected WeakReference W;

   public BufferedImage H(JComponent var1, DragSourceDragEvent var2) {
      label16: {
         int var3 = Rn2.Y();
         Object var10000 = this.W;
         if (var3 != 0) {
            if (this.W == null) {
               break label16;
            }

            var10000 = this.W.get();
         }

         if (var10000 == var1) {
            return FN.p(var1, this.J());
         }
      }

      Point var4 = var1.getLocationOnScreen();
      Point var5 = var2.getLocation();
      this.r = new Point(var4.x - var5.x, var4.y - var5.y);
      this.W = new WeakReference<>(var1);
      return FN.p(var1, this.J());
   }

   public float J() {
      return 0.8F;
   }

   public Point f(JComponent var1, DragSourceDragEvent var2) {
      return this.r;
   }

   public void v(JComponent var1, DragSourceDropEvent var2) {
      this.r = null;
      this.W = null;
   }

   @Override
   public void v(Object var1, DragSourceDropEvent var2) {
      this.v((JComponent)var1, var2);
   }

   @Override
   public Point e(Object var1, DragSourceDragEvent var2) {
      return this.f((JComponent)var1, var2);
   }

   @Override
   public BufferedImage u(Object var1, DragSourceDragEvent var2) {
      return this.H((JComponent)var1, var2);
   }
}





