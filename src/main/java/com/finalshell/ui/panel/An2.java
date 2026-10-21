package com.finalshell.ui.panel;

import com.finalshell.reflect.Ref;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class An2 extends As2 {
   public final GradientPaint m;
   public final UV3 s;

   public An2(UV3 var1, ShowDeletedPanel var2, Connection5 var3, GradientPaint var4) {
      super(var2, var3);
      this.s = var1;
      this.m = var4;
   }

   @Override
   public void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Graphics2D var2 = (Graphics2D)var1;
      Object var3 = 625238686649497327L;
      this.setPaint((GradientPaint)Ref.g(625238686649497327L, var3));
      var2.fillRect(0, 0, this.getWidth(), this.getHeight());
   }
}





