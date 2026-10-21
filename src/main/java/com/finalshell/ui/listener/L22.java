package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Address;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class L22 implements ActionListener {
   public final Address j;

   public L22(Address var1) {
      this.j = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 297039895041797653L;
      Ref.g(297039895041797653L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 433046742012662407L;
      Object[] var4 = var10002;
      Ref.h(433046742012662407L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





