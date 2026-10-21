package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.F5;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GU implements Runnable {
   final String y;
   final F5 q;

   GU(F5 var1, String var2) {
      this.q = var1;
      this.y = var2;
   }

   @Override
   public void run() {
      try {
         Object var3 = 354017514645348159L;
         InetAddress var2 = InetAddress.getByName((String)Ref.g(354017514645348159L, var3));
         Object var5 = 358155008855524918L;
         Ref.g(358155008855524918L, var5);
         Object var7 = 474524358810565567L;
         Ref.g(474524358810565567L, var7);
         Object[] var10004 = Registry.packArgs(var2.getHostAddress());
         long var10 = 484159971549207596L;
         Object[] var9 = var10004;
         Ref.h(484159971549207596L, var9, var10);

         try {
            ;
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }

         Registry.packArgs(var2.getHostAddress());
         long var11 = 310988506867275920L;
         Object var10005 = Ref.h2(310988506867275920L, var11);

         try {
            var10005 = (String)var10005;
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }

         String var1 = (String)var10005;
         Object var13 = 358155008855524918L;
         Ref.g(358155008855524918L, var13);
         Object var15 = 474524358810565567L;
         Ref.g(474524358810565567L, var15);
         Object[] var10008 = Registry.packArgs(var1);
         long var18 = 550424599682494568L;
         Object[] var17 = var10008;
         Ref.h(550424599682494568L, var17, var18);

         try {
            ;
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }
      } catch (UnknownHostException var22) {
         var22.printStackTrace();
      }
   }
}





