package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;

public class Wd2 extends W2 {
   public final RemoteProcessManager a;

   public Wd2(RemoteProcessManager var1) {
      this.a = var1;
      Object[] var10001 = Registry.packArgs(Ref.g(353811571070434348L, null));
      long var3 = 241374024532053562L;
      Object[] var2 = var10001;
      Ref.h(241374024532053562L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw new RuntimeException(var4.getTargetException());
      }
   }

   @Override
   public void O() {
      label34: {
         String[] var1 = KV.b$arrString();
         Object var2 = 372236004790213499L;
         Object var10001 = (String)Ref.g(372236004790213499L, var2);
         if (var1 == null) {
            if (var10001 == null) {
               return;
            }

            var10001 = this;
            if (var1 != null) {
               break label34;
            }

            Object[] var10002 = Registry.emptyArgs();
            long var5 = 297950173727673677L;
            Object[] var4 = var10002;
            Ref.h(297950173727673677L, var4, var5);
            Object[] var10003 = Registry.emptyArgs();
            long var7 = 164968885333537697L;
            Object[] var6 = var10003;
            Ref.h(164968885333537697L, var6, var7);

            try {
               ;
            } catch (InvocationTargetException var10) {
               throw new RuntimeException(var10.getTargetException());
            }
         }

         if (var10001.equals("")) {
            return;
         }
      }

      Object var8 = 612496811166955604L;
      Ref.setBoolean(284041043052708509L, Ref.g(612496811166955604L, var8), false);
   }
}





