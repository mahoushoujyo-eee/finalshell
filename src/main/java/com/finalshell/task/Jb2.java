package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Jb2 implements Runnable {
   public final G f;

   public Jb2(G var1) {
      this.f = var1;
   }

   @Override
   public void run() {
      Object var1 = 377408411119867282L;
      Ref.g(377408411119867282L, var1);
      Object var3 = 494329747335816596L;
      Ref.g(494329747335816596L, var3);
      Object var5 = 332928532684882633L;
      Ref.g(332928532684882633L, var5);
      Object[] var10004 = Registry.emptyArgs();
      long var8 = 149160680229662748L;
      Object[] var7 = var10004;
      Ref.h(149160680229662748L, var7, var8);
      Object[] var10005 = Registry.emptyArgs();
      long var10 = 615229640085119640L;
      Object[] var9 = var10005;
      Ref.h(615229640085119640L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }
}





