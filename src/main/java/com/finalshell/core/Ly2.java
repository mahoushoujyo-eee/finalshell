package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class Ly2 implements WindowFocusListener {
   final com.finalshell.ui.dialog.C5 x;

   Ly2(com.finalshell.ui.dialog.C5 var1) {
      this.x = var1;
   }

   @Override
   public void windowGainedFocus(WindowEvent var1) {
   }

   @Override
   public void windowLostFocus(WindowEvent var1) {
      Object var2 = 622353857250685855L;
      Registry.lookupField(551384867496479483L).setLong(Ref.g(622353857250685855L, var2), System.currentTimeMillis());
      Object var4 = 622353857250685855L;
      ((com.finalshell.ui.dialog.C5)Ref.g(622353857250685855L, var4)).setVisible(false);
   }
}





