package com.finalshell.ui.listener;

import com.finalshell.core.TM;
import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.AA;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Yp2 implements KeyListener {
   public final TM a;
   public static long b;

   public Yp2(TM var1) {
      this.a = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      String var2 = AA.z();
      if (var2 == null && var1.getKeyCode() == (int)b) {
         Object var3 = 375005397175227093L;
         ((TM)Ref.g(375005397175227093L, var3)).stopCellEditing();
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 1995765593045538617L;
      long var10002 = 3831334980704606003L ^ var0;
      byte var10001 = -1;
      b = var10002;
   }
}





