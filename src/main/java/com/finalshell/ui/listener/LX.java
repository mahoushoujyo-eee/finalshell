package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.lang.reflect.InvocationTargetException;

public class LX implements ComponentListener {
   public final AppendCarriageReturnCRPanel V;

   public LX(AppendCarriageReturnCRPanel var1) {
      this.V = var1;
   }

   @Override
   public void componentShown(ComponentEvent var1) {
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      Object var2 = 219012725260767547L;
      Ref.g(219012725260767547L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 363067491039837712L;
      Object[] var4 = var10002;
      Ref.h(363067491039837712L, var4, var5);

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





