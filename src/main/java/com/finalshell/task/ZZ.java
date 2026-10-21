package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.io.BufferedReader;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

public class ZZ implements Callable {
   public final BufferedReader F;
   public final StringBuffer u;

   public ZZ(BufferedReader var1, StringBuffer var2) {
      this.F = var1;
      this.u = var2;
   }

   public String y() throws Exception {
      com.finalshell.ui.panel.Ky4[] var1 = YT3_2.c();

      do {
         Object var3 = 557524112743495789L;
         String var2;
         if ((var2 = ((BufferedReader)Ref.g(557524112743495789L, var3)).readLine()) == null) {
            break;
         }

         Object var5 = 201311005218497213L;
         ((StringBuffer)Ref.g(201311005218497213L, var5)).append(var2 + "\n");
      } while (var1 != null);

      return null;
   }

   @Override
   public Object call() throws Exception {
      Object var10001 = Registry.emptyArgs();
      long var2 = 358091690752758155L;
      Object var1 = var10001;
      var10001 = Ref.h(358091690752758155L, var1, var2);

      try {
         return (String)var10001;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }
}





