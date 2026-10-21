package com.finalshell.task;

import com.finalshell.core.Vn2;
import com.finalshell.core.Yf2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.QuickConnectPanel;
import java.lang.reflect.InvocationTargetException;

public class WE implements Runnable {
   final QuickConnectPanel W;
   public static long a;

   WE(QuickConnectPanel var1) {
      this.W = var1;
   }

   @Override
   public void run() {
      String var1 = Vn2.C();

      while (true) {
         try {
            Registry.emptyArgs();
            long var3 = 270389152141252877L;
            Ref.h2(270389152141252877L, var3);
            Yf2 var10002 = (Yf2)(Registry.emptyArgs());
            long var6 = 410905379772103887L;
            Object[] var5 = var10002;
            var10002 = Ref.h(410905379772103887L, var5, var6);

            try {
               var10002 = (Yf2)var10002;
            } catch (InvocationTargetException var19) {
               throw var19.getTargetException();
            }

            if (var10002 != null) {
               Registry.emptyArgs();
               long var7 = 270389152141252877L;
               Ref.h2(270389152141252877L, var7);
               Object[] var10004 = Registry.emptyArgs();
               long var10 = 410905379772103887L;
               Object[] var9 = var10004;
               Ref.h(410905379772103887L, var9, var10);
               Object[] var10005 = Registry.emptyArgs();
               long var12 = 582109538642750681L;
               Object[] var11 = var10005;
               var10005 = Ref.h(582109538642750681L, var11, var12);

               try {
                  var25 = (Boolean)var10005;
               } catch (InvocationTargetException var18) {
                  throw var18.getTargetException();
               }

               if (var25) {
                  break;
               }
            }
         } catch (InterruptedException var21) {
            throw a(var21);
         }

         try {
            Thread.sleep(a);
         } catch (InterruptedException var20) {
            var20.printStackTrace();
            if (var1 != null) {
               break;
            }
         }
      }

      Object var13 = 227767814287181233L;
      Ref.g(227767814287181233L, var13);
      Object[] var10007 = Registry.emptyArgs();
      long var16 = 417567863675886752L;
      Object[] var15 = var10007;
      Ref.h(417567863675886752L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3805953201902328409L;
      long var10002 = 3805953201902328410L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





