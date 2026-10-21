package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.UZ;
import java.lang.reflect.InvocationTargetException;

public class TT3 implements Runnable {
   public final UZ J;

   public TT3(UZ var1) {
      this.J = var1;
   }

   @Override
   public void run() {
      Object var1 = 136486683299574244L;
      Ref.g(136486683299574244L, var1);
      Object var3 = 587337361913163398L;
      Ref.g(587337361913163398L, var3);
      Object var5 = 215526989813745242L;
      Ref.g(215526989813745242L, var5);
      Object var7 = 136486683299574244L;
      Ref.g(136486683299574244L, var7);
      Object var9 = 587337361913163398L;
      Ref.g(587337361913163398L, var9);
      Object var11 = 136486683299574244L;
      Object var10008 = Ref.g(136486683299574244L, var11);
      Object var13 = 587337361913163398L;
      var10008 = Registry.packArgs(var10008, Ref.g(587337361913163398L, var13));
      long var16 = 582301692004958968L;
      Object[] var15 = (Object[])var10008;
      Ref.h(582301692004958968L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw new RuntimeException(var17.getTargetException());
      }
   }
}





