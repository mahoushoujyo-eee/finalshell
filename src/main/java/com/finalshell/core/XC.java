package com.finalshell.core;

import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class XC implements D2 {
   final Color A;
   final Font X;
   final int s;
   final int D;
   final com.finalshell.ui.model.J2 l;
   final com.finalshell.ui.model.J2 M;
   final int b;
   final int E;
   final SetBackgroundImagePanel p;

   XC(
      SetBackgroundImagePanel var1,
      Color var2,
      Font var3,
      int var4,
      int var5,
      com.finalshell.ui.model.J2 var6,
      com.finalshell.ui.model.J2 var7,
      int var8,
      int var9
   ) {
      this.p = var1;
      this.A = var2;
      this.X = var3;
      this.s = var4;
      this.D = var5;
      this.l = var6;
      this.M = var7;
      this.b = var8;
      this.E = var9;
   }

   @Override
   public void h(Graphics var1) {
      Graphics2D var2 = (Graphics2D)var1;
      var2.setColor(this.A);
      var2.setFont(this.X);
      int var3 = this.s + this.D;
      var2.drawChars(this.l.r(), this.M.o() + this.b, this.E, this.D + this.p.U, var3);
      var2.dispose();
   }
}





