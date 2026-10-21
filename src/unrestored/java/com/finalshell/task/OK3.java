package com.finalshell.task;

import com.finalshell.core.TQ3;
import com.finalshell.core.Ty4;
import com.finalshell.core.Vn2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.QuickConnectPanel;
import java.lang.reflect.InvocationTargetException;

public class OK3 implements Runnable {
   public final Ty4 q;
   public final QuickConnectPanel S;

   public OK3(QuickConnectPanel var1, Ty4 var2) {
      this.S = var1;
      this.q = var2;
   }

   @Override
   public void run() {
      Integer var26;
      label52: {
         String var1 = Vn2.C();
         Object var3 = 288985563586479085L;
         OK3 var10001 = Ref.g(288985563586479085L, var3) instanceof TQ3;
         if (var1 == null) {
            if (var10001 == null) {
               Object var5 = 481242388329627461L;
               Ref.g(481242388329627461L, var5);
               Object[] var10003 = Registry.emptyArgs();
               long var8 = 417567863675886752L;
               Object[] var7 = var10003;
               Ref.h(417567863675886752L, var7, var8);

               try {
                  ;
               } catch (InvocationTargetException var21) {
                  throw var21.getTargetException();
               }

               if (var1 == null) {
                  return;
               }
            }

            var10001 = this;
            Object var9 = 288985563586479085L;
            Ty4 var10002 = (Ty4)Ref.g(288985563586479085L, var9);
            if (var1 != null) {
               break label52;
            }

            boolean var22 = var10002 instanceof Ty4;
         }

         if (var10001 == null) {
            return;
         }

         Object var11 = 288985563586479085L;
         Ty4 var23 = (Ty4)Ref.g(288985563586479085L, var11);
      }

      Object var24 = Registry.emptyArgs();
      long var14 = 542590257020999358L;
      Object var13 = var24;
      var24 = Ref.h(542590257020999358L, var13, var14);

      try {
         var26 = (Integer)var24;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      if (var26 == Registry.lookupField(614101277846852824L).getInt(null)) {
         Object var15 = 481242388329627461L;
         Ref.g(481242388329627461L, var15);
         Object[] var10005 = Registry.emptyArgs();
         long var18 = 417567863675886752L;
         Object[] var17 = var10005;
         Ref.h(417567863675886752L, var17, var18);

         try {
            ;
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }
      }
   }
}





