package com;

import java.awt.Component;
import java.awt.Shape;

public class oh_4 extends com.o8_2 {
   private com.W2 Y;

   public oh_4(Component var1) {
      super(var1);
   }

   @Override
   public void j(Component var1) {
      super.j(var1);
      this.Y = GA.e(var1);
   }

   @Override
   public Shape v() {
      String[] var1 = pI_3.v();
      com.W2 var10000 = this.Y;
      if (var1 == null) {
         if (this.Y == null) {
            return null;
         }

         var10000 = this.Y;
      }

      return var10000.B();
   }
}





