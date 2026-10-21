package com.finalshell.task;

import com.finalshell.core.Km2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Uv4 implements Runnable {
   public final O32 r;

   public Uv4(O32 var1) {
      this.r = var1;
   }

   @Override
   public void run() {
      Object var1 = 236372290177734785L;
      Ref.g(236372290177734785L, var1);
      Object var3 = 623978626682822626L;
      Ref.g(623978626682822626L, var3);
      Object var5 = 396507593444187971L;
      Ref.g(396507593444187971L, var5);
      Object var7 = 612091313834066062L;
      Ref.g(612091313834066062L, var7);
      Object[] var10005 = Registry.emptyArgs();
      long var10 = 505450737708956760L;
      Object[] var9 = var10005;
      Ref.h(505450737708956760L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      Object var11 = 236372290177734785L;
      Ref.g(236372290177734785L, var11);
      Object var13 = 623978626682822626L;
      Ref.g(623978626682822626L, var13);
      Object var15 = 396507593444187971L;
      Km2 var10008 = (Km2)Ref.g(396507593444187971L, var15);
      Object var17 = 236372290177734785L;
      int var10010 = Registry.lookupField(586111568867965214L).getInt(Ref.g(236372290177734785L, var17));
      Object var19 = 236372290177734785L;
      var10010.editCellAt((int)this, Registry.lookupField(216074577526253003L).getInt(Ref.g(236372290177734785L, var19)));
   }
}





