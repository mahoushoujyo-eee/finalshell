package com.finalshell.ui.listener;

import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

public class WN extends MouseAdapter {
   public final Uo2 w;

   public WN(Uo2 var1) {
      this.w = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Object var6 = 178668013303736722L;
      Object var3 = ((Uo2)Ref.g(178668013303736722L, var6)).columnAtPoint(var1.getPoint());
      Uo2.i();
      Object var8 = 178668013303736722L;
      String var4 = ((Uo2)Ref.g(178668013303736722L, var8)).getColumnName((int)var3);
      Registry.emptyArgs();
      long var10 = 270389152141252877L;
      Ref.h2(270389152141252877L, var10);
      Object[] var10004 = Registry.emptyArgs();
      long var13 = 634817973682994708L;
      Object[] var12 = var10004;
      Ref.h(634817973682994708L, var12, var13);
      Object[] var10005 = Registry.emptyArgs();
      long var15 = 240567170779145617L;
      Object[] var14 = var10005;
      Ref.h(240567170779145617L, var14, var15);
      Object[] var10006 = Registry.emptyArgs();
      long var17 = 226341449505323490L;
      Object[] var16 = var10006;
      Ref.h(226341449505323490L, var16, var17);
      Object[] var10007 = Registry.emptyArgs();
      long var19 = 153346140499032202L;
      Object[] var18 = var10007;
      Ref.h(153346140499032202L, var18, var19);
      Object[] var10008 = Registry.emptyArgs();
      long var21 = 588059759001940511L;
      Object[] var20 = var10008;
      Ref.h(588059759001940511L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      WN var33 = (WN)var3;
      int var10009 = 2;
      if (this == null) {
         if (var3 == null) {
            Object var22 = 178668013303736722L;
            if (Registry.lookupField(532627492453842802L).getInt(Ref.g(178668013303736722L, var22)) == 2) {
               return;
            }

            Object[] var10010 = Registry.packArgs(Registry.lookupField(189389645615350517L).getInt(null));
            long var25 = 294889698174931697L;
            Object[] var24 = var10010;
            Ref.h(294889698174931697L, var24, var25);

            try {
               ;
            } catch (InvocationTargetException var31) {
               throw var31.getTargetException();
            }

            if (this == null) {
               return;
            }
         }

         var33 = (WN)var3;
         var10009 = 3;
      }

      if (this == null) {
         if (var33 != var10009) {
            return;
         }

         var33 = this;
         Object var26 = 178668013303736722L;
         var10009 = Registry.lookupField(532627492453842802L).getInt(Ref.g(178668013303736722L, var26));
         byte var35 = 3;
      }

      if (var33 != var10009) {
         Object[] var34 = Registry.packArgs(Registry.lookupField(149407827136588388L).getInt(null));
         long var29 = 294889698174931697L;
         Object[] var28 = var34;
         Ref.h(294889698174931697L, var28, var29);

         try {
            ;
         } catch (InvocationTargetException var30) {
            throw var30.getTargetException();
         }
      }
   }
}





