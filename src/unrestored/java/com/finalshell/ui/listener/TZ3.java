package com.finalshell.ui.listener;

import com.finalshell.core.Yz2;
import com.finalshell.ui.panel.SwitchTabCommand;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TZ3 implements KeyListener {
   public final Yz2 n;

   public TZ3(Yz2 var1) {
      this.n = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      String[] var10000 = SwitchTabCommand.B();
      int var3 = var1.getModifiers();
      String[] var2 = var10000;
      int var4 = var3;
      if (var2 != null) {
         if (var3 <= 0) {
            return;
         }

         var4 = var3 & 2;
      }

      if (var4 != 0) {
      }
   }
}





