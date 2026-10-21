package com.Z;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

class C implements CaretListener {
   final com.Z.T z;

   C(com.Z.T var1) {
      this.z = var1;
   }

   @Override
   public void caretUpdate(CaretEvent var1) {
      this.z.b(null);
   }
}





