package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SetExternalEditorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JCheckBoxMenuItem;

public class Ci2 implements ActionListener {
   public final JCheckBoxMenuItem k;
   public final SetExternalEditorPanel O;

   public Ci2(SetExternalEditorPanel var1, JCheckBoxMenuItem var2) {
      this.O = var1;
      this.k = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var33;
      String var2 = com.finalshell.core.Km2.U$String();
      Registry.emptyArgs();
      long var3 = 270389152141252877L;
      Ref.h2(270389152141252877L, var3);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw new RuntimeException(var30.getTargetException());
      }

      if (var2 == null) {
         Object[] var10002 = Registry.emptyArgs();
         long var6 = 163462326892114024L;
         Object[] var5 = var10002;
         Ref.h(163462326892114024L, var5, var6);
         Object var10003 = Registry.emptyArgs();
         long var8 = 633712494917113170L;
         Object var7 = var10003;
         var10003 = Ref.h(633712494917113170L, var7, var8);

         try {
            var33 = (Boolean)var10003;
         } catch (InvocationTargetException var29) {
            throw new RuntimeException(var29.getTargetException());
         }

         if (!var33) {
            Registry.emptyArgs();
            long var9 = 270389152141252877L;
            Ref.h2(270389152141252877L, var9);
            Object[] var34 = Registry.emptyArgs();
            long var12 = 248890456776257543L;
            Object[] var11 = var34;
            Ref.h(248890456776257543L, var11, var12);

            try {
               return;
            } catch (InvocationTargetException var25) {
               throw new RuntimeException(var25.getTargetException());
            }
         }

         Registry.emptyArgs();
         long var13 = 270389152141252877L;
         Ref.h2(270389152141252877L, var13);
         Object[] var10005 = Registry.emptyArgs();
         long var16 = 306266403902896148L;
         Object[] var15 = var10005;
         Ref.h(306266403902896148L, var15, var16);
         Object var17 = 529240269626246118L;
         Object[] var10007 = Registry.packArgs(((JCheckBoxMenuItem)Ref.g(529240269626246118L, var17)).isSelected());
         long var20 = 522016653675214088L;
         Object[] var19 = var10007;
         Ref.h(522016653675214088L, var19, var20);

         try {
            ;
         } catch (InvocationTargetException var28) {
            throw new RuntimeException(var28.getTargetException());
         }

         Registry.emptyArgs();
         long var21 = 270389152141252877L;
         Ref.h2(270389152141252877L, var21);

         try {
            ;
         } catch (InvocationTargetException var27) {
            throw new RuntimeException(var27.getTargetException());
         }
      }

      Object[] var31 = Registry.emptyArgs();
      long var24 = 578864097947885485L;
      Object[] var23 = var31;
      Ref.h(578864097947885485L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var26) {
         throw new RuntimeException(var26.getTargetException());
      }
   }
}





