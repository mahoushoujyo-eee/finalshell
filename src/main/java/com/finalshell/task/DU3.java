package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.YJ3;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.Connection4;
import com.finalshell.ui.panel.FilePermissionPanel;
import java.lang.reflect.InvocationTargetException;

public class DU3 implements Runnable {
   public final YJ3 o;

   public DU3(YJ3 var1) {
      this.o = var1;
   }

   @Override
   public void run() {
      int[] var1 = Connection4.I();
      Object var2 = 605613512724604290L;
      Ref.g(605613512724604290L, var2);
      Object var4 = 239395089633094126L;
      FilePermissionPanel var10002 = (FilePermissionPanel)Ref.g(239395089633094126L, var4);
      if (var1 != null) {
         Object var6 = 515525013030853953L;
         if ((Tf4)Ref.g(515525013030853953L, var6) == null) {
            return;
         }

         Object var8 = 605613512724604290L;
         Ref.g(605613512724604290L, var8);
         Object var10 = 239395089633094126L;
         FilePermissionPanel var10005 = (FilePermissionPanel)Ref.g(239395089633094126L, var10);
      }

      Object var12 = 305402254993059552L;
      Ref.g(305402254993059552L, var12);
      Object[] var10004 = Registry.emptyArgs();
      long var15 = 346382751221538814L;
      Object[] var14 = var10004;
      Ref.h(346382751221538814L, var14, var15);
      Object var16 = 605613512724604290L;
      Ref.g(605613512724604290L, var16);
      Object var18 = 239395089633094126L;
      Ref.g(239395089633094126L, var18);
      Object var20 = 515525013030853953L;
      Object[] var10008 = Registry.packArgs(Ref.g(515525013030853953L, var20));
      long var23 = 191479498782345680L;
      Object[] var22 = var10008;
      Ref.h(191479498782345680L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }
   }
}





