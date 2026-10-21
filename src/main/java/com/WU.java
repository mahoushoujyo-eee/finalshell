package com;

import javax.swing.JComponent;
import javax.swing.JViewport;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicViewportUI;

public class WU extends BasicViewportUI {
   private static int C;

   public static ComponentUI createUI(JComponent var0) {
      return new com.WU();
   }

   @Override
   public void installUI(JComponent var1) {
      int var10000 = p();
      super.installUI(var1);
      int var2 = var10000;
      JViewport var3 = (JViewport)var1;
      var3.setScrollMode(com.a9.y());
      com.FN.Y(var1);
      if (var2 == 0) {
         com.ky_4.K(new String[2]);
      }
   }

   public static void M(int var0) {
      C = var0;
   }

   public static int A() {
      return C;
   }

   public static int p() {
      int var0 = A();
      return var0 == 0 ? 69 : 0;
   }

   static {
      if (p() == 0) {
         M(56);
      }
   }
}





