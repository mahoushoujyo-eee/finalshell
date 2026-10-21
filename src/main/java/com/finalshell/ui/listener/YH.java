package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.Ox4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class YH implements ActionListener {
   public final Ox4 t;

   public YH(Ox4 var1) {
      this.t = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 629142092354287791L;
      Ref.g(629142092354287791L, var2);
      Object[] var10002 = Registry.packArgs(false);
      long var5 = 509679152478047438L;
      Object[] var4 = var10002;
      Ref.h(509679152478047438L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





