package com.finalshell.task;

import com.finalshell.core.Dv2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Backspace;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;

public class NZ implements Runnable {
   public final Backspace j;

   public NZ(Backspace var1) {
      this.j = var1;
   }

   @Override
   public void run() {
      Object var1 = 268243776161260323L;
      Registry.packArgs(Ref.g(268243776161260323L, var1));
      long var3 = 560527826014327263L;
      Dv2 var10002 = (Dv2)Ref.h2(560527826014327263L, var3);

      try {
         var10002 = var10002;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      var10002.n();
      Object var5 = 268243776161260323L;
      Object var10004 = Ref.g(268243776161260323L, var5);
      Object var7 = 316737507384357237L;
      var10004.add((JButton)Ref.g(316737507384357237L, var7), 1);
   }
}





