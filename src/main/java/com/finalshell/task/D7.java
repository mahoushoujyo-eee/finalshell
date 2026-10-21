package com.finalshell.task;

import com.finalshell.core.Ln4_2;
import com.finalshell.core.MV;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class D7 implements Runnable {
   final MV B;

   D7(MV var1) {
      this.B = var1;
   }

   @Override
   public void run() {
      boolean var1 = Ln4_2.i();
      Object var2 = 232335853224685312L;
      Object var10001 = (MV)Ref.g(232335853224685312L, var2);
      if (var1) {
         if (!Registry.lookupField(303519943996955852L).getBoolean(var10001)) {
            return;
         }

         var10001 = this;
         Object var4 = 232335853224685312L;
         Ref.g(232335853224685312L, var4);
         Object[] var10003 = Registry.emptyArgs();
         long var7 = 619282492819259929L;
         Object[] var6 = var10003;
         Ref.h(619282492819259929L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         Object var8 = 232335853224685312L;
         MV var10004 = (MV)Ref.g(232335853224685312L, var8);
      }

      Registry.lookupField(303519943996955852L).setBoolean(var10001, false);
   }
}





