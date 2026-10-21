package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Address;
import java.lang.reflect.InvocationTargetException;

public class CR implements Cq2 {
   public final YI C;
   public final String m;
   public final Address I;

   public CR(Address var1, YI var2, String var3) {
      this.I = var1;
      this.C = var2;
      this.m = var3;
   }

   @Override
   public void u(VO var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var3 = 178857963789314984L;
      Object[] var2 = var10001;
      var10001 = Ref.h(178857963789314984L, var2, var3);

      try {
         var15 = (Integer)var10001;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      if (var15 == Registry.lookupField(242649790291880610L).getInt(null)) {
         Object var4 = 632844740712008035L;
         Ref.g(632844740712008035L, var4);
         Object var6 = 379104353760710404L;
         Ref.g(379104353760710404L, var6);
         Object var8 = 141303724457314099L;
         Object[] var10005 = Registry.packArgs(this, Ref.g(141303724457314099L, var8));
         long var11 = 263637764923912958L;
         Object[] var10 = var10005;
         Ref.h(263637764923912958L, var10, var11);

         try {
            ;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }
      }
   }
}





