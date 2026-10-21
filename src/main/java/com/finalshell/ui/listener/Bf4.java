package com.finalshell.ui.listener;

import com.finalshell.core.JR;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.KA_3;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

public class Bf4 extends MouseAdapter {
   public final com.finalshell.ui.panel.N22 G;
   public final JR C;

   public Bf4(JR var1, com.finalshell.ui.panel.N22 var2) {
      this.C = var1;
      this.G = var2;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Object var7 = 635938733199465863L;
      int var3 = ((JR)Ref.g(635938733199465863L, var7)).columnAtPoint(var1.getPoint());
      KA_3.y$arrky_4();
      Object var9 = 635938733199465863L;
      int var4 = ((JR)Ref.g(635938733199465863L, var9)).convertColumnIndexToModel(var3);
      Object var11 = 635938733199465863L;
      String var5 = ((JR)Ref.g(635938733199465863L, var11)).getColumnName(var3);
      Object var13 = 319342635679894398L;
      Ref.g(319342635679894398L, var13);
      Object var10005 = Registry.emptyArgs();
      long var16 = 589871071857415373L;
      Object var15 = var10005;
      var10005 = Ref.h(589871071857415373L, var15, var16);

      try {
         var29 = (Integer)var10005;
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      int var6 = var29;
      int var30 = var4;
      if (this == null) {
         if (var4 == 0) {
            if (var6 == Registry.lookupField(189389645615350517L).getInt(null)) {
               return;
            }

            Object var17 = 319342635679894398L;
            Ref.g(319342635679894398L, var17);
            Object[] var10007 = Registry.packArgs(Registry.lookupField(189389645615350517L).getInt(null));
            long var20 = 294889698174931697L;
            Object[] var19 = var10007;
            Ref.h(294889698174931697L, var19, var20);

            try {
               ;
            } catch (InvocationTargetException var26) {
               throw var26.getTargetException();
            }

            if (this == null) {
               return;
            }
         }

         var30 = var4;
      }

      int var10006 = 1;
      if (this == null) {
         if (var30 != 1) {
            return;
         }

         var30 = var6;
         var10006 = Registry.lookupField(149407827136588388L).getInt(null);
      }

      if (var30 != var10006) {
         Object var21 = 319342635679894398L;
         Ref.g(319342635679894398L, var21);
         Object[] var31 = Registry.packArgs(Registry.lookupField(149407827136588388L).getInt(null));
         long var24 = 294889698174931697L;
         Object[] var23 = var31;
         Ref.h(294889698174931697L, var23, var24);

         try {
            ;
         } catch (InvocationTargetException var25) {
            throw var25.getTargetException();
         }
      }
   }
}





