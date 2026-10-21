package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Xn2;
import com.finalshell.ui.panel.KA_3;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

public class U__2 extends MouseAdapter {
   final KA_3 s;

   U__2(KA_3 var1) {
      this.s = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Xn2(this));
      long var3 = 434592463220957006L;
      Object[] var2 = var10001;
      Ref.h(434592463220957006L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }
}





