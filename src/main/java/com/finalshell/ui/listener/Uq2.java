package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ShowDeletedPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Uq2 implements ActionListener {
   final ShowDeletedPanel E;

   Uq2(ShowDeletedPanel var1) {
      this.E = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 301903381895589877L;
      Ref.g(301903381895589877L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 378734658016285263L;
      Object[] var4 = var10002;
      Ref.h(378734658016285263L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





