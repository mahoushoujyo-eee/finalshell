package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.RouteTracePanel2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class MD implements ActionListener {
   public final RouteTracePanel2 W;

   public MD(RouteTracePanel2 var1) {
      this.W = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 524899208116425335L;
      Ref.g(524899208116425335L, var2);
      Object var4 = 131037384951395357L;
      Ref.g(131037384951395357L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 500682355287436659L;
      Object[] var6 = var10003;
      Ref.h(500682355287436659L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }
}





