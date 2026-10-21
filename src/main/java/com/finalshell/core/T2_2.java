package com.finalshell.core;

import java.awt.Shape;
import javax.swing.JComponent;

public class T2_2 implements E_2 {
   final JComponent y;
   final boolean z;
   final O_2 I;

   T2_2(O_2 var1, JComponent var2, boolean var3) {
      this.I = var1;
      this.y = var2;
      this.z = var3;
   }

   public Shape h() {
      return this.I.o(this.y, this.z);
   }

   @Override
   public Object J() {
      return this.h();
   }
}





