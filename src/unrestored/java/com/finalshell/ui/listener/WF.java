package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.LocalDrive;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;

public class WF implements ItemListener {
   public final LocalDrive W;

   public WF(LocalDrive var1) {
      this.W = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      if (var1.getStateChange() == 1) {
         Object var2 = 125089314760456719L;
         Ref.g(125089314760456719L, var2);
         Object[] var10002 = Registry.emptyArgs();
         long var5 = 568446940499935634L;
         Object[] var4 = var10002;
         Ref.h(568446940499935634L, var4, var5);

         try {
            ;
         } catch (InvocationTargetException var6) {
            throw new RuntimeException(var6.getTargetException());
         }
      }
   }
}





