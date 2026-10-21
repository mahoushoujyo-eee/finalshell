package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.RouteTracePanel2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Bk4 implements ActionListener {
   final RouteTracePanel2 o;

   Bk4(RouteTracePanel2 var1) {
      this.o = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 120690641910372750L;
      Ref.g(120690641910372750L, var2);
      Object var4 = 131037384951395357L;
      Ref.g(131037384951395357L, var4);
      Object[] var10003 = Registry.packArgs(false);
      long var7 = 330853429046648426L;
      Object[] var6 = var10003;
      Ref.h(330853429046648426L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





