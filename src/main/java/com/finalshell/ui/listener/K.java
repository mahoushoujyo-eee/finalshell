package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Copy3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class K implements ActionListener {
   public final Copy3 c;

   public K(Copy3 var1) {
      this.c = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 141611939216033156L;
      Ref.g(141611939216033156L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 363445102399037940L;
      Object[] var4 = var10002;
      Ref.h(363445102399037940L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





