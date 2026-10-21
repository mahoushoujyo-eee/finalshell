package com.finalshell.task;

import com.finalshell.core.Km2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.Address;
import java.lang.reflect.InvocationTargetException;

public class De4 implements Runnable {
   public final Tf4 q;
   public final String U;
   public final Address s;

   public De4(Address var1, Tf4 var2, String var3) {
      this.s = var1;
      this.q = var2;
      this.U = var3;
   }

   @Override
   public void run() {
      Object var2 = 119608652076837066L;
      Ref.g(119608652076837066L, var2);
      Object var4 = 150762093507542450L;
      Ref.g(150762093507542450L, var4);
      Object[] var10003 = Registry.emptyArgs();
      long var7 = 565315838989287146L;
      Object[] var6 = var10003;
      Ref.h(565315838989287146L, var6, var7);
      Object var8 = 498144510894008223L;
      Object[] var10005 = Registry.packArgs(Ref.g(498144510894008223L, var8));
      long var11 = 217942201414471271L;
      Object[] var10 = var10005;
      Ref.h(217942201414471271L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      Object var12 = 119608652076837066L;
      Ref.g(119608652076837066L, var12);
      Object var14 = 150762093507542450L;
      Ref.g(150762093507542450L, var14);
      Object var16 = 182760096987117139L;
      Object[] var10009 = Registry.packArgs(Ref.g(182760096987117139L, var16));
      long var19 = 343697430899942544L;
      Object[] var18 = var10009;
      Ref.h(343697430899942544L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      Object var20 = 119608652076837066L;
      Ref.g(119608652076837066L, var20);
      Object var22 = 150762093507542450L;
      int var1 = ((Km2)Ref.g(150762093507542450L, var22)).getSelectedRow();
      if (var1 > -1) {
         Object var24 = 119608652076837066L;
         Ref.g(119608652076837066L, var24);
         Object var26 = 150762093507542450L;
         Ref.g(150762093507542450L, var26);
         Object[] var10014 = Registry.packArgs(var1);
         long var29 = 442091497690345581L;
         Object[] var28 = var10014;
         Ref.h(442091497690345581L, var28, var29);

         try {
            ;
         } catch (InvocationTargetException var30) {
            throw var30.getTargetException();
         }
      }
   }
}





