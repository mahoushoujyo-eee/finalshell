package com.finalshell.ui.listener;

import com.finalshell.core.Lv4_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.frame.SpeedTestFrame;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.CustomAcceleratePanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Kg4 implements ActionListener {
   final com.finalshell.ui.dialog.C5 e;
   final CustomAcceleratePanel C;

   Kg4(CustomAcceleratePanel var1, com.finalshell.ui.dialog.C5 var2) {
      this.C = var1;
      this.e = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      CustomAcceleratePanel.N();
      Registry.emptyArgs();
      long var8 = 270389152141252877L;
      Ref.h2(270389152141252877L, var8);
      Object[] var10003 = Registry.emptyArgs();
      long var11 = 634817973682994708L;
      Object[] var10 = var10003;
      Ref.h(634817973682994708L, var10, var11);
      Object[] var10004 = Registry.emptyArgs();
      long var13 = 240567170779145617L;
      Object[] var12 = var10004;
      var10004 = Ref.h(240567170779145617L, var12, var13);
      ConnectionProperty var10005 = Registry.emptyArgs();
      long var15 = 226341449505323490L;
      Object[] var14 = var10005;
      var10005 = Ref.h(226341449505323490L, var14, var15);

      try {
         var10005 = (com.finalshell.ui.frame.U)var10005;
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      com.finalshell.ui.frame.U var3 = var10005;
      Object var2 = var10004;
      var10005 = Registry.emptyArgs();
      long var17 = 179934491990092343L;
      Object[] var16 = var10005;
      var10005 = Ref.h(179934491990092343L, var16, var17);

      try {
         var10005 = (ConnectionProperty)var10005;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      ConnectionProperty var4 = var10005;
      if (var3 != null) {
         var10005 = var4;
         if (var2 != null) {
            if (var4 == null) {
               return;
            }

            var10005 = var3;
            Object[] var10006 = Registry.emptyArgs();
            long var19 = 179934491990092343L;
            Object[] var18 = var10006;
            Ref.h(179934491990092343L, var18, var19);

            try {
               ;
            } catch (InvocationTargetException var25) {
               throw var25.getTargetException();
            }
         }

         Lv4_2 var5 = var10005.a();
         if (var2 == null || var5 != null) {
            Object[] var35 = Registry.emptyArgs();
            long var21 = 380415140795833934L;
            Object[] var20 = var35;
            Ref.h(380415140795833934L, var20, var21);

            try {
               ;
            } catch (InvocationTargetException var24) {
               throw var24.getTargetException();
            }

            new SpeedTestFrame(var5, var3);
            Object var22 = 355245715027756284L;
            ((com.finalshell.ui.dialog.C5)Ref.g(355245715027756284L, var22)).setVisible(false);
         }
      }
   }
}





