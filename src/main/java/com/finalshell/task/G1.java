package com.finalshell.task;

import com.finalshell.core.Dv2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.Fm2;
import java.lang.reflect.InvocationTargetException;

public class G1 implements Runnable {
   public final Fm2 d;

   public G1(Fm2 var1) {
      this.d = var1;
   }

   @Override
   public void run() {
      Object var1 = 503810328741634318L;
      Registry.packArgs(Ref.g(503810328741634318L, var1));
      long var3 = 229916307541783595L;
      Dv2 var10002 = (Dv2)Ref.h2(229916307541783595L, var3);

      try {
         var10002 = var10002;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10002.setText("");
   }
}





