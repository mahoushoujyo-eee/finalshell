package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.TerminalHelpFrame;
import java.lang.reflect.InvocationTargetException;

public class Kh4 implements Runnable {
   final Vo2 e;

   Kh4(Vo2 var1) {
      this.e = var1;
   }

   @Override
   public void run() {
      Object var1 = 130967415689204029L;
      Ref.g(130967415689204029L, var1);
      Object var3 = 288736546242913911L;
      Registry.packArgs(Ref.g(288736546242913911L, var3));
      long var5 = 385643251219565463L;
      Ref.h2(385643251219565463L, var5);
      Object[] var10004 = Registry.emptyArgs();
      long var8 = 613805675130464613L;
      Object[] var7 = var10004;
      var10004 = Ref.h(613805675130464613L, var7, var8);

      try {
         var11 = (Boolean)var10004;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      if (var11) {
         Registry.lookupField(194285877583497070L).set(null, new TerminalHelpFrame(null));
      }
   }
}





