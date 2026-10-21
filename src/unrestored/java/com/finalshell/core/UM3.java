package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.UpdateFrame;
import java.lang.reflect.InvocationTargetException;

public class UM3 {
   public long m;
   public TL3 u;
   public static long a;

   public UM3() {
      UpdateFrame var1 = new UpdateFrame(null);
      Ref.g(388376917454860932L, null);
      Object[] var10001 = Registry.packArgs(new com.finalshell.task.WW(this, var1), (int)a);
      long var3 = 201859364639460244L;
      Object[] var2 = var10001;
      Ref.h(201859364639460244L, var2, var3);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 558988037493500446L;
      Object[] var4 = var10002;
      Ref.h(558988037493500446L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 56449889732039166L;
      long var10002 = -6448708938294193642L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





