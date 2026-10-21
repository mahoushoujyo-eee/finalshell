package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AA;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;

public class W7 implements ItemListener {
   public final com.finalshell.core.Ol4 w;

   public W7(com.finalshell.core.Ol4 var1) {
      this.w = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      String var2 = AA.z();
      Object var3 = 549916051604035708L;
      Object var10001 = (com.finalshell.core.Ol4)Ref.g(549916051604035708L, var3);
      if (var2 == null) {
         if (!((com.finalshell.core.Ol4)var10001).stopCellEditing()) {
            return;
         }

         var10001 = this;
         Object var5 = 549916051604035708L;
         com.finalshell.core.Ol4 var10002 = (com.finalshell.core.Ol4)Ref.g(549916051604035708L, var5);
      }

      Registry.packArgs(var10001);
      long var7 = 582852501439449305L;
      Ref.h2(582852501439449305L, var7);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }
}





