package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K42;
import java.awt.Rectangle;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Dx2 implements MouseWheelListener {
   public final K42 a;
   public static long b;

   public Dx2(K42 var1) {
      this.a = var1;
   }

   @Override
   public void mouseWheelMoved(MouseWheelEvent var1) {
      Rectangle var2 = K42.g(this.a).getVisibleRect();
      K42.g(this.a).scrollRectToVisible(new Rectangle(var2.x + var1.getWheelRotation() * (int)b, var2.y, var2.width, var2.height));
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 5978135476124666634L;
      long var10002 = 6503975202711554835L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





