package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.lang.reflect.InvocationTargetException;

public class Vv2 implements ComponentListener {
   public final AM q;

   public Vv2(AM var1) {
      this.q = var1;
   }

   @Override
   public void componentShown(ComponentEvent var1) {
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      Object var2 = 253393745237664095L;
      Ref.g(253393745237664095L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 487819805049017899L;
      Object[] var4 = var10002;
      Ref.h(487819805049017899L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
   }
}





