package com.finalshell.ui.listener;

import com.finalshell.core.E_;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Kv4 extends WindowAdapter {
   final E_ k;

   Kv4(E_ var1) {
      this.k = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      this.k.a(var1);
   }
}





