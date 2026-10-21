package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class D0 implements ActionListener {
   public final AddCommandListener S;

   public D0(AddCommandListener var1) {
      this.S = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 361233421463988444L;
      Ref.g(361233421463988444L, var2);
      Object var4 = 251977851460879585L;
      Ref.g(251977851460879585L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 239861906826915435L;
      Object[] var6 = var10003;
      Ref.h(239861906826915435L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw new RuntimeException(var8.getTargetException());
      }
   }
}





