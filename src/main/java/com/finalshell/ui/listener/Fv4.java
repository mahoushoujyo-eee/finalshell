package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ApplyToFileAndDirDialog;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;

public class Fv4 implements ItemListener {
   public final ApplyToFileAndDirDialog q;

   public Fv4(ApplyToFileAndDirDialog var1) {
      this.q = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      Object var2 = 605320047016216042L;
      Ref.g(605320047016216042L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 569560317630803778L;
      Object[] var4 = var10002;
      Ref.h(569560317630803778L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





