package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.RouteTracePanel3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class A9 implements ActionListener {
   public final RouteTracePanel3 W;

   public A9(RouteTracePanel3 var1) {
      this.W = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 476692636041079297L;
      Ref.g(476692636041079297L, var2);
      Object[] var10002 = Registry.packArgs(null);
      long var5 = 519002930381305189L;
      Object[] var4 = var10002;
      Ref.h(519002930381305189L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





