package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.LS;
import java.lang.reflect.InvocationTargetException;

public class KH implements Runnable {
   public final LS A;

   public KH(LS var1) {
      this.A = var1;
   }

   @Override
   public void run() {
      Object var1 = 156801642212502866L;
      Ref.g(156801642212502866L, var1);
      Object var3 = 366105017638426158L;
      Ref.g(366105017638426158L, var3);
      Object var5 = 305402254993059552L;
      Ref.g(305402254993059552L, var5);
      Object[] var10004 = Registry.emptyArgs();
      long var8 = 346382751221538814L;
      Object[] var7 = var10004;
      Ref.h(346382751221538814L, var7, var8);
      Object var9 = 156801642212502866L;
      Ref.g(156801642212502866L, var9);
      Object var11 = 622438402074773363L;
      Object[] var10007 = Registry.packArgs(Ref.g(622438402074773363L, var11));
      long var14 = 277808345207982888L;
      Object[] var13 = var10007;
      Ref.h(277808345207982888L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw new RuntimeException(var15.getTargetException());
      }
   }
}





