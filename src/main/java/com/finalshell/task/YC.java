package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.EnableBackgroundImage;
import java.lang.reflect.InvocationTargetException;

public class YC implements Runnable {
   final EnableBackgroundImage w;

   YC(EnableBackgroundImage var1) {
      this.w = var1;
   }

   @Override
   public void run() {
      Registry.emptyArgs();
      long var1 = 168325533756172104L;
      Ref.h2(168325533756172104L, var1);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





