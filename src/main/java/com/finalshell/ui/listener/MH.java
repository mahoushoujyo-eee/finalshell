package com.finalshell.ui.listener;

import com.finalshell.core.U62;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.EnableBackgroundImage;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBox;

public class MH implements ItemListener {
   public final U62 u;
   public final JCheckBox N;
   public final EnableBackgroundImage C;

   public MH(EnableBackgroundImage var1, U62 var2, JCheckBox var3) {
      this.C = var1;
      this.u = var2;
      this.N = var3;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      EnableBackgroundImage.I();
      Object var3 = 151557336105546584L;
      Ref.g(151557336105546584L, var3);
      Object var5 = 409930710163112468L;
      Object[] var10004 = Registry.packArgs(((JCheckBox)Ref.g(409930710163112468L, var5)).isSelected());
      long var8 = 565903988916625313L;
      Object[] var7 = var10004;
      Ref.h(565903988916625313L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }

      Object[] var10009;
      label76: {
         label77: {
            if (this != null) {
               Object var9 = 409930710163112468L;
               if (((JCheckBox)Ref.g(409930710163112468L, var9)).isSelected()) {
                  Object var11 = 432894934817182720L;
                  EnableBackgroundImage var10005 = (EnableBackgroundImage)Ref.g(432894934817182720L, var11);
                  if (this == null) {
                     break label76;
                  }

                  if (Registry.lookupField(427521949153014927L).getBoolean(var10005)) {
                     break label77;
                  }

                  Object var13 = 432894934817182720L;
                  Ref.g(432894934817182720L, var13);
                  Registry.emptyArgs();
                  long var15 = 270389152141252877L;
                  Ref.h2(270389152141252877L, var15);
                  var10009 = Registry.emptyArgs();
                  long var18 = 306266403902896148L;
                  Object[] var17 = var10009;
                  Ref.h(306266403902896148L, var17, var18);
                  Object[] var10010 = Registry.emptyArgs();
                  long var20 = 338793095438116620L;
                  Object[] var19 = var10010;
                  var10010 = Registry.packArgs(Ref.h(338793095438116620L, var19, var20));
                  long var22 = 138118316736819193L;
                  Object[] var21 = var10010;
                  Ref.h(138118316736819193L, var21, var22);

                  try {
                     ;
                  } catch (InvocationTargetException var37) {
                     throw var37.getTargetException();
                  }

                  if (this != null) {
                     break label77;
                  }
               }

               ConnectionProperty.v$void();
            }

            Registry.emptyArgs();
            long var23 = 270389152141252877L;
            Ref.h2(270389152141252877L, var23);
            Object[] var39 = Registry.emptyArgs();
            long var26 = 634817973682994708L;
            Object[] var25 = var39;
            Ref.h(634817973682994708L, var25, var26);
            Object[] var10006 = Registry.emptyArgs();
            long var28 = 150340994538293048L;
            Object[] var27 = var10006;
            Ref.h(150340994538293048L, var27, var28);

            try {
               ;
            } catch (InvocationTargetException var36) {
               throw var36.getTargetException();
            }
         }

         Registry.emptyArgs();
         long var29 = 270389152141252877L;
         Ref.h2(270389152141252877L, var29);
         Object[] var10008 = Registry.emptyArgs();
         long var32 = 578864097947885485L;
         Object[] var31 = var10008;
         Ref.h(578864097947885485L, var31, var32);

         try {
            ;
         } catch (InvocationTargetException var35) {
            throw var35.getTargetException();
         }

         long var33 = 432894934817182720L;
      }

      Registry.lookupField(427521949153014927L).setBoolean(var10009, false);
   }
}





