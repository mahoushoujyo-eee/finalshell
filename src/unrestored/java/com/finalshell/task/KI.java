package com.finalshell.task;

import com.finalshell.core.Td4;
import com.finalshell.core.Uf4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

public class KI implements Runnable {
   public final Uf4 z;
   public final ConnectionInfoPanel D;

   public KI(ConnectionInfoPanel var1, Uf4 var2) {
      this.D = var1;
      this.z = var2;
   }

   @Override
   public void run() {
      ConnectionInfoPanel.I();
      Object var4 = 180038062700866876L;
      Object var10002 = Ref.g(180038062700866876L, var4);
      Object var6 = 499316983962981071L;
      Iterator var2 = ((ArrayList)Ref.g(499316983962981071L, var6)).iterator();
      Object var1 = var10002;

      while (var2.hasNext()) {
         Td4 var3 = (Td4)var2.next();
         Object var8 = 455667230271654367L;
         Object[] var10004 = Registry.packArgs(Ref.g(455667230271654367L, var8));
         long var11 = 180521697850994272L;
         Object[] var10 = var10004;
         Ref.h(180521697850994272L, var10, var11);

         try {
            ;
         } catch (InvocationTargetException var12) {
            throw new RuntimeException(var12.getTargetException());
         }

         if (var1 == null) {
            break;
         }
      }
   }
}





