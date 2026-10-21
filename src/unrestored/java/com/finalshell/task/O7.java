package com.finalshell.task;

import com.finalshell.core.PG_2;
import com.finalshell.core.Qh2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.MainFrame;
import com.finalshell.ui.panel.F8;
import java.lang.reflect.InvocationTargetException;

public class O7 implements Runnable {
   public final Qh2 A;
   public final MainFrame E;
   public static long a;

   public O7(MainFrame var1, Qh2 var2) {
      this.E = var1;
      this.A = var2;
   }

   @Override
   public void run() {
      String[] var1 = F8.y();

      while (true) {
         Registry.emptyArgs();
         long var3 = 270389152141252877L;
         Ref.h2(270389152141252877L, var3);
         PG_2 var10002 = (PG_2)(Registry.emptyArgs());
         long var6 = 296847891750502060L;
         Object var5 = var10002;
         var10002 = Ref.h(296847891750502060L, var5, var6);

         try {
            var10002 = (PG_2)var10002;
         } catch (InvocationTargetException var16) {
            throw new RuntimeException(var16.getTargetException());
         }

         label43:
         if (var10002 == null) {
            try {
               Thread.sleep(a);
            } catch (InterruptedException var17) {
               var17.printStackTrace();
               if (var1 == null) {
                  continue;
               }
               break label43;
            }

            if (var1 == null) {
               continue;
            }
            break;
         }

         Registry.emptyArgs();
         long var7 = 270389152141252877L;
         Ref.h2(270389152141252877L, var7);
         Object[] var10004 = Registry.emptyArgs();
         long var10 = 296847891750502060L;
         Object[] var9 = var10004;
         Ref.h(296847891750502060L, var9, var10);
         Object var11 = 613453992252475315L;
         Object[] var10006 = Registry.packArgs(Ref.g(613453992252475315L, var11));
         long var14 = 575690921154627974L;
         Object[] var13 = var10006;
         Ref.h(575690921154627974L, var13, var14);

         try {
            break;
         } catch (InvocationTargetException var15) {
            throw new RuntimeException(var15.getTargetException());
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 2117471273568922787L;
      long var10002 = 2117471273568922784L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





