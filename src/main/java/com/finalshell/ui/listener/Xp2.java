package com.finalshell.ui.listener;

import com.finalshell.core.KC;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Xp2 implements KeyListener {
   public final KC E;
   public static long a;

   public Xp2(KC var1) {
      this.E = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      int[] var2 = ConnectionInfoPanel.I();
      if (var2 != null && var1.getKeyCode() == (int)a) {
         Object var3 = 180777725202577610L;
         ((KC)Ref.g(180777725202577610L, var3)).stopCellEditing();
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 4943179860027291373L;
      long var10002 = -2768618212692412697L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





