package com.finalshell.core;

import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.event.MouseEvent;
import java.util.List;

public class Gj2 implements CS3_2 {
   public final Ca4_2 A;
   public final MouseEvent h;
   public final SetBackgroundImagePanel e;

   public Gj2(SetBackgroundImagePanel var1, Ca4_2 var2, MouseEvent var3) {
      this.e = var1;
      this.A = var2;
      this.h = var3;
   }

   @Override
   public List n() {
      return this.A.x(this.h);
   }

   @Override
   public CS3_2 c() {
      return this.e;
   }

   @Override
   public void Y(CS3_2 var1) {
   }
}





