package com.finalshell.task;

import com.finalshell.core.Fc2;
import com.finalshell.core.Ln2;
import com.finalshell.core.Ln4_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class OO3 implements Runnable {
   public final Ln2 E;

   public OO3(Ln2 var1) {
      this.E = var1;
   }

   @Override
   public void run() {
      boolean var1 = Ln4_2.R();
      Object var2 = 556455112978357862L;
      Ln2 var10001 = (Ln2)Ref.g(556455112978357862L, var2);
      if (!var1) {
         Object var4 = 538673647573365483L;
         if ((Fc2)Ref.g(538673647573365483L, var4) != null) {
            Object var6 = 556455112978357862L;
            Ref.g(556455112978357862L, var6);
            Object var8 = 538673647573365483L;
            Ref.g(538673647573365483L, var8);
            Object[] var10005 = Registry.emptyArgs();
            long var11 = 507718653540547382L;
            Object[] var10 = var10005;
            Ref.h(507718653540547382L, var10, var11);

            try {
               ;
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }
         }

         Object var12 = 556455112978357862L;
         Ln2 var10003 = (Ln2)Ref.g(556455112978357862L, var12);
      }

      Registry.lookupField(257898823081515939L).setBoolean(var10001, false);
   }
}





