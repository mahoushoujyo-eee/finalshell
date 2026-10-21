package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.EditPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Of_4 implements ActionListener {
   public final EditPanel I;

   public Of_4(EditPanel var1) {
      this.I = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 211885093606991747L;
      Ref.g(211885093606991747L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 469112436702288424L;
      Object[] var4 = var10002;
      Ref.h(469112436702288424L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }
}





