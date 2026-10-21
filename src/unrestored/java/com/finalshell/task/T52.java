package com.finalshell.task;

import com.finalshell.core.YT3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.io.BufferedReader;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

public class T52 implements Callable {
   public final BufferedReader D;
   public final StringBuffer g;

   public T52(BufferedReader var1, StringBuffer var2) {
      this.D = var1;
      this.g = var2;
   }

   public String F() throws Exception {
      com.finalshell.ui.panel.Ky4[] var1 = YT3_2.c();

      do {
         Object var3 = 454362310334684855L;
         String var2;
         if ((var2 = ((BufferedReader)Ref.g(454362310334684855L, var3)).readLine()) == null) {
            break;
         }

         Object var5 = 621745322823250220L;
         ((StringBuffer)Ref.g(621745322823250220L, var5)).append(var2 + "\n");
      } while (var1 != null);

      return null;
   }

   @Override
   public Object call() throws Exception {
      Object var10001 = Registry.emptyArgs();
      long var2 = 580399604591341686L;
      Object var1 = var10001;
      var10001 = Ref.h(580399604591341686L, var1, var2);

      try {
         return (String)var10001;
      } catch (InvocationTargetException var3) {
         throw new RuntimeException(var3.getTargetException());
      }
   }
}





