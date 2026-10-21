package com.finalshell.core;

import com.finalshell.connection.Connection12;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.DownloadDialog;
import com.finalshell.ui.panel.Address;
import java.lang.reflect.InvocationTargetException;

public class Mn2 implements Cq2 {
   public final Connection12 S;
   public final String C;
   public final String w;
   public final DownloadDialog P;

   public Mn2(DownloadDialog var1, Connection12 var2, String var3, String var4) {
      this.P = var1;
      this.S = var2;
      this.C = var3;
      this.w = var4;
   }

   @Override
   public void u(VO var1) {
      boolean var2 = Address.i();

      label50: {
         try {
            if (!var2) {
               break label50;
            }

            Object[] var10001 = Registry.emptyArgs();
            long var5 = 178857963789314984L;
            Object[] var4 = var10001;
            var10001 = Ref.h(178857963789314984L, var4, var5);

            try {
               var29 = (Integer)var10001;
            } catch (InvocationTargetException var26) {
               throw var26.getTargetException();
            }

            if (var29 != Registry.lookupField(242649790291880610L).getInt(null)) {
               return;
            }
         } catch (Exception var27) {
            throw a(var27);
         }

         try {
            Object var6 = 140538463457516322L;
            Ref.g(140538463457516322L, var6);
            Object var8 = 127529234865039930L;
            Ref.g(127529234865039930L, var8);
            Object var10 = 543246570144301620L;
            Object[] var10005 = Registry.packArgs(Ref.g(543246570144301620L, var10));
            long var13 = 596624758422184723L;
            Object[] var12 = var10005;
            Ref.h(596624758422184723L, var12, var13);

            try {
               ;
            } catch (InvocationTargetException var24) {
               throw var24.getTargetException();
            }
         } catch (Exception var25) {
            var25.printStackTrace();
         }
      }

      Object var14 = 127529234865039930L;
      Registry.lookupField(525973064303548535L).setLong(Ref.g(127529234865039930L, var14), System.currentTimeMillis());

      try {
         Object var16 = 139735919125773440L;
         Ref.g(139735919125773440L, var16);
         Object var18 = 461570582865979606L;
         Registry.packArgs(this, Ref.g(461570582865979606L, var18), false);
         long var20 = 197468530930532747L;
         Ref.h2(197468530930532747L, var20);

         try {
            ;
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }
      } catch (Exception var23) {
         var23.printStackTrace();
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }
}





