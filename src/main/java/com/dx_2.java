package com;

import java.awt.Rectangle;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

class Dx_2 implements MouseWheelListener {
   final com.k4_2 a;
   private static final long b;

   Dx_2(com.k4_2 var1) {
      this.a = var1;
   }

   @Override
   public void mouseWheelMoved(MouseWheelEvent var1) {
      Rectangle var2 = com.k4_2.g(this.a).getVisibleRect();
      com.k4_2.g(this.a).scrollRectToVisible(new Rectangle(var2.x + var1.getWheelRotation() * (int)b, var2.y, var2.width, var2.height));
   }

   static {
      long var0 = 5978135476124666634L;
      long var10002 = 6503975202711554835L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





