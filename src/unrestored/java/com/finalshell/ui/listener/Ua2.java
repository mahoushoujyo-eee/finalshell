package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.AW;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Ua2 implements ActionListener {
   public final AW V;

   public Ua2(AW var1) {
      this.V = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 330750425888276342L;
      Ref.g(330750425888276342L, var2);
      Object[] var10002 = Registry.packArgs(false);
      long var5 = 269104104400495911L;
      Object[] var4 = var10002;
      Ref.h(269104104400495911L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }
}





