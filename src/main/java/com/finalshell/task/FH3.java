package com.finalshell.task;

import com.finalshell.core.D82_2;
import com.finalshell.core.DX3_2;
import com.finalshell.core.GH_2;
import com.finalshell.core.XQ_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class FH3 implements Runnable {
   public final DX3_2 h;
   public static long a;

   public FH3(DX3_2 var1) {
      this.h = var1;
   }

   @Override
   public void run() {
      try {
         InetAddress var1 = InetAddress.getByName(this.h.B);
         D82_2 var10001 = XQ_2.x;
         GH_2 var10002 = (GH_2)(Registry.packArgs(new Qt2(this, var1), (int)a));
         long var4 = 201859364639460244L;
         Object var3 = var10002;
         var10002 = Ref.h(201859364639460244L, var3, var4);

         try {
            var10002 = (GH_2)var10002;
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var10001.G = var10002;
      } catch (UnknownHostException var6) {
         var6.printStackTrace();
      }
   }

   public static DX3_2 P(FH3 var0) {
      return var0.h;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3148035430290545526L;
      long var10002 = 915072209294186654L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





