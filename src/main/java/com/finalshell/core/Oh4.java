package com.finalshell.core;

import com.finalshell.ui.model.PI3;
import java.awt.Component;
import java.awt.Shape;

public class Oh4 extends O82 {
   public W2_3 Y;

   public Oh4(Component var1) {
      super(var1);
   }

   @Override
   public void j(Component var1) {
      super.j(var1);
      this.Y = GA.e(var1);
   }

   @Override
   public Shape v() {
      String[] var1 = PI3.v();
      W2_3 var10000 = this.Y;
      if (var1 == null) {
         if (this.Y == null) {
            return null;
         }

         var10000 = this.Y;
      }

      return var10000.B();
   }
}





