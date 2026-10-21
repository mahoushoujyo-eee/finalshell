package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.EnableBackgroundImage;
import com.finalshell.ui.panel.Ky4;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;

public class Fd2 implements ItemListener {
   final EnableBackgroundImage L;

   Fd2(EnableBackgroundImage var1) {
      this.L = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      Ky4[] var2 = EnableBackgroundImage.I();
      int var10000 = var1.getStateChange();
      if (var2 != null) {
         if (var10000 != 1) {
            return;
         }

         var10000 = (Integer)var1.getItem();
      }

      int var3 = var10000;
      if (var2 != null) {
         Registry.emptyArgs();
         long var4 = 270389152141252877L;
         Ref.h2(270389152141252877L, var4);
         Object[] var10003 = Registry.emptyArgs();
         long var7 = 306266403902896148L;
         Object[] var6 = var10003;
         var10003 = Ref.h(306266403902896148L, var6, var7);
         Object[] var10004 = Registry.emptyArgs();
         long var9 = 358544030666779924L;
         Object[] var8 = var10004;
         var10004 = Ref.h(358544030666779924L, var8, var9);

         try {
            var36 = (Integer)var10004;
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }

         if (var10003 == var36) {
            return;
         }

         Registry.emptyArgs();
         long var10 = 270389152141252877L;
         Ref.h2(270389152141252877L, var10);
         Object[] var10005 = Registry.emptyArgs();
         long var13 = 306266403902896148L;
         Object[] var12 = var10005;
         Ref.h(306266403902896148L, var12, var13);
         Object[] var10006 = Registry.packArgs(var3);
         long var15 = 436701467796083090L;
         Object[] var14 = var10006;
         Ref.h(436701467796083090L, var14, var15);

         try {
            ;
         } catch (InvocationTargetException var32) {
            throw var32.getTargetException();
         }

         Registry.emptyArgs();
         long var16 = 270389152141252877L;
         Ref.h2(270389152141252877L, var16);
         Object[] var10008 = Registry.emptyArgs();
         long var19 = 578864097947885485L;
         Object[] var18 = var10008;
         Ref.h(578864097947885485L, var18, var19);

         try {
            ;
         } catch (InvocationTargetException var31) {
            throw var31.getTargetException();
         }
      }

      Object var20 = 544489746922325447L;
      Ref.g(544489746922325447L, var20);
      Registry.emptyArgs();
      long var22 = 270389152141252877L;
      Ref.h2(270389152141252877L, var22);
      Object[] var37 = Registry.emptyArgs();
      long var25 = 306266403902896148L;
      Object[] var24 = var37;
      Ref.h(306266403902896148L, var24, var25);
      Object[] var38 = Registry.emptyArgs();
      long var27 = 338793095438116620L;
      Object[] var26 = var38;
      var38 = Registry.packArgs(Ref.h(338793095438116620L, var26, var27));
      long var29 = 138118316736819193L;
      Object[] var28 = var38;
      Ref.h(138118316736819193L, var28, var29);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }
   }
}





