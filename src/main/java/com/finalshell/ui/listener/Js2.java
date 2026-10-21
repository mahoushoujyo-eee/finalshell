package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Js2 implements ActionListener {
   public final com.finalshell.ui.frame.U r;

   public Js2(com.finalshell.ui.frame.U var1) {
      this.r = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 311061606336322654L;
      Ref.g(311061606336322654L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 580435810785546608L;
      Object[] var4 = var10002;
      Ref.h(580435810785546608L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }
}





