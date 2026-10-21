package com.finalshell.ui.listener;

import java.awt.Component;
import java.awt.event.MouseAdapter;

public class NQ3 extends MouseAdapter {
   public static void S(Component var0) {
      NQ3 var1 = new NQ3();
      var0.addMouseListener(var1);
      var0.addMouseMotionListener(var1);
      var0.addMouseWheelListener(var1);
   }
}





