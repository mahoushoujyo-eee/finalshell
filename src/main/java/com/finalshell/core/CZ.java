package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.FileBrowserAddressBar;
import java.lang.reflect.InvocationTargetException;

public class CZ implements Cq2 {
   public final YI J;
   public final String W;
   public final Ca4 i;

   public CZ(Ca4 var1, YI var2, String var3) {
      this.i = var1;
      this.J = var2;
      this.W = var3;
   }

   @Override
   public void u(VO var1) {
      Integer var24;
      boolean var2 = FileBrowserAddressBar.g();
      Object var10001 = Registry.emptyArgs();
      long var4 = 178857963789314984L;
      Object var3 = var10001;
      var10001 = Ref.h(178857963789314984L, var3, var4);

      try {
         var24 = (Integer)var10001;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      if (var24 == Registry.lookupField(242649790291880610L).getInt(null)) {
         Object var5 = 225021371275606830L;
         Ref.g(225021371275606830L, var5);
         FileBrowserAddressBar var10003 = (FileBrowserAddressBar)(Registry.emptyArgs());
         long var8 = 140337426392269953L;
         Object var7 = var10003;
         var10003 = Ref.h(140337426392269953L, var7, var8);

         try {
            var10003 = (FileBrowserAddressBar)var10003;
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }

         if (!var2) {
            if (var10003 == null) {
               return;
            }

            Object var9 = 225021371275606830L;
            Ref.g(225021371275606830L, var9);
            Object[] var10005 = Registry.emptyArgs();
            long var12 = 140337426392269953L;
            Object[] var11 = var10005;
            Ref.h(140337426392269953L, var11, var12);

            try {
               ;
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }
         }

         Object var13 = 225021371275606830L;
         Ref.g(225021371275606830L, var13);
         Object var15 = 395548631722221050L;
         Object[] var10006 = Registry.packArgs(this, Ref.g(395548631722221050L, var15));
         long var18 = 263637764923912958L;
         Object[] var17 = var10006;
         Ref.h(263637764923912958L, var17, var18);

         try {
            ;
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }
      }
   }
}





