package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.RouteTraceAddressPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Mr2 implements ActionListener {
   public final RouteTraceAddressPanel H;

   public Mr2(RouteTraceAddressPanel var1) {
      this.H = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 289029244182343081L;
      Ref.g(289029244182343081L, var2);
      Object[] var10002 = Registry.packArgs(null);
      long var5 = 519002930381305189L;
      Object[] var4 = var10002;
      Ref.h(519002930381305189L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }
}





