package com;

import java.awt.Insets;
import java.awt.Point;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.image.BufferedImage;
import java.util.List;

public abstract class uw_2 implements up_2 {
   private static final long a;

   public abstract int w();

   public Insets O() {
      return new Insets(0, 0, 0, 0);
   }

   public BufferedImage v(List var1, DragSourceDragEvent var2) {
      return null;
   }

   public Point r(List var1, DragSourceDragEvent var2) {
      return new Point((int)a, 5);
   }

   public void M(List var1, DragSourceDropEvent var2) {
   }

   @Override
   public void v(Object var1, DragSourceDropEvent var2) {
      this.M((List)var1, var2);
   }

   @Override
   public Point e(Object var1, DragSourceDragEvent var2) {
      return this.r((List)var1, var2);
   }

   @Override
   public BufferedImage u(Object var1, DragSourceDragEvent var2) {
      return this.v((List)var1, var2);
   }

   static {
      long var0 = 1612977480307702895L;
      long var10002 = -1379538788452008842L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





