package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.lang.reflect.InvocationTargetException;

public class Dc2 extends ComponentAdapter {
   public final com.finalshell.ui.frame.MainFrame A;

   public Dc2(com.finalshell.ui.frame.MainFrame var1) {
      this.A = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      Object var2 = 341968994965858136L;
      Ref.g(341968994965858136L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 138331449693050657L;
      Object[] var4 = var10002;
      Ref.h(138331449693050657L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      Object var2 = 341968994965858136L;
      Ref.g(341968994965858136L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 138331449693050657L;
      Object[] var4 = var10002;
      Ref.h(138331449693050657L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }
}





