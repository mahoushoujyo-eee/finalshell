package com;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class kv_4 extends WindowAdapter {
   final E_ k;

   kv_4(E_ var1) {
      this.k = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      this.k.a(var1);
   }
}





