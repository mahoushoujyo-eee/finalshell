package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.RouteTracePanel2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class B92 implements ActionListener {
   public final RouteTracePanel2 b;

   public B92(RouteTracePanel2 var1) {
      this.b = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 555867601666694296L;
      Ref.g(555867601666694296L, var2);
      Object var4 = 270550610354043937L;
      Ref.g(270550610354043937L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 283087596964075372L;
      Object[] var6 = var10003;
      Ref.h(283087596964075372L, var6, var7);
      Object[] var10004 = Registry.emptyArgs();
      long var9 = 258873058137482580L;
      Object[] var8 = var10004;
      Ref.h(258873058137482580L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }
}





