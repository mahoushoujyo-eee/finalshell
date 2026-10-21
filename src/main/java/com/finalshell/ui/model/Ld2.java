package com.finalshell.ui.model;

import com.finalshell.core.L1;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.Vc2;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class Ld2 implements Comparator {
   final Vc2 O;

   Ld2(Vc2 var1) {
      this.O = var1;
   }

   public int V(L1 var1, L1 var2) {
      AppendCarriageReturnCRPanel.Y();
      Object[] var10002 = Registry.emptyArgs();
      long var14 = 608348398594129275L;
      Object[] var13 = var10002;
      var10002 = Ref.h(608348398594129275L, var13, var14);

      try {
         var26 = (Integer)var10002;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      double var4 = (double)var26;
      Object[] var10003 = Registry.emptyArgs();
      long var16 = 608348398594129275L;
      Object[] var15 = var10003;
      var10003 = Ref.h(608348398594129275L, var15, var16);

      try {
         var28 = (Integer)var10003;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      double var6 = (double)var28;
      Object[] var10004 = Registry.emptyArgs();
      long var18 = 236277018693765536L;
      Object[] var17 = var10004;
      var10004 = Ref.h(236277018693765536L, var17, var18);

      try {
         var30 = (Integer)var10004;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      double var8 = (double)var30;
      var10004 = Registry.emptyArgs();
      long var20 = 236277018693765536L;
      Object[] var19 = var10004;
      var10004 = Ref.h(236277018693765536L, var19, var20);

      try {
         var33 = (Integer)var10004;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      double var10 = (double)var33;
      byte var12 = 0;
      double var35;
      int var34 = (var35 = var4 - var6) == 0.0 ? 0 : (var35 < 0.0 ? -1 : 1);
      if (var1 == null) {
         if (var34 > 0) {
            var12 = -1;
            if (var1 == null) {
               return var12;
            }
         }

         double var36;
         var34 = (var36 = var6 - var4) == 0.0 ? 0 : (var36 < 0.0 ? -1 : 1);
      }

      if (var1 == null) {
         if (var34 > 0) {
            var12 = 1;
            if (var1 == null) {
               return var12;
            }
         }

         double var37;
         var34 = (var37 = var8 - var10) == 0.0 ? 0 : (var37 < 0.0 ? -1 : 1);
      }

      if (var1 == null) {
         if (var34 > 0) {
            var12 = 1;
            if (var1 == null) {
               return var12;
            }
         }

         double var38;
         var34 = (var38 = var10 - var8) == 0.0 ? 0 : (var38 < 0.0 ? -1 : 1);
      }

      if (var1 != null) {
         return var34;
      } else {
         if (var34 > 0) {
            var12 = -1;
         }

         return var12;
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      Object[] var10001 = Registry.packArgs((L1)var1, (L1)var2);
      long var4 = 417293533616605001L;
      Object[] var3 = var10001;
      var10001 = Ref.h(417293533616605001L, var3, var4);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }
}





