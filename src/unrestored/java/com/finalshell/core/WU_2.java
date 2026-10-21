package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import javax.swing.JComponent;
import javax.swing.JViewport;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicViewportUI;

public class WU_2 extends BasicViewportUI {
   public static int C;

   public static ComponentUI createUI(JComponent var0) {
      return new WU_2();
   }

   @Override
   public void installUI(JComponent var1) {
      int var10000 = p();
      super.installUI(var1);
      int var2 = var10000;
      JViewport var3 = (JViewport)var1;
      var3.setScrollMode(A9.y());
      FN.Y(var1);
      if (var2 == 0) {
         Ky4.K(new String[2]);
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
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (p() == 0) {
         M(56);
      }
   }
}





