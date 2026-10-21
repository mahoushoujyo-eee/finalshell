package com;

import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.image.BufferedImage;

class RF extends FocusAdapter {
   final Component i;
   final int P;
   final int h;
   final BufferedImage H;
   final com.Qj_2 f;

   RF(com.Qj_2 var1, Component var2, int var3, int var4, BufferedImage var5) {
      this.f = var1;
      this.i = var2;
      this.P = var3;
      this.h = var4;
      this.H = var5;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      this.f.removeFocusListener(this);
      this.f.I(this.i, this.P, this.h, this.H);
   }
}





