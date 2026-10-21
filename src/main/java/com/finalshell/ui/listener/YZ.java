package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.SetExternalEditorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class YZ implements ActionListener {
   public final SetExternalEditorPanel H;

   public YZ(SetExternalEditorPanel var1) {
      this.H = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = com.finalshell.core.Km2.U$String();
      Object var4 = 380371888959224761L;
      SetExternalEditorPanel var10001 = (SetExternalEditorPanel)Ref.g(380371888959224761L, var4);
      if (var2 == null) {
         Object var6 = 450156560726681374L;
         if ((Ck4)Ref.g(450156560726681374L, var6) != null) {
            Object var8 = 380371888959224761L;
            Ref.g(380371888959224761L, var8);
            Object var10 = 450156560726681374L;
            Ref.g(450156560726681374L, var10);
            Object[] var10005 = Registry.emptyArgs();
            long var13 = 605430732347023634L;
            Object[] var12 = var10005;
            Registry.packArgs(Ref.h(605430732347023634L, var12, var13));
            long var14 = 396962080382410298L;
            Ref.h2(396962080382410298L, var14);

            try {
               ;
            } catch (InvocationTargetException var30) {
               throw var30.getTargetException();
            }
         }

         Object var16 = 380371888959224761L;
         SetExternalEditorPanel var10003 = (SetExternalEditorPanel)Ref.g(380371888959224761L, var16);
      }

      Object var18 = 566271456646205392L;
      Tf4 var10002 = (Tf4)Ref.g(566271456646205392L, var18);
      if (var2 == null) {
         if (var10002 == null) {
            return;
         }

         Object var20 = 380371888959224761L;
         Ref.g(380371888959224761L, var20);
         Object var22 = 566271456646205392L;
         Tf4 var10004 = (Tf4)Ref.g(566271456646205392L, var22);
      }

      String var31 = (String)(Registry.emptyArgs());
      long var25 = 498856411508641826L;
      Object[] var24 = var31;
      var31 = Ref.h(498856411508641826L, var24, var25);

      try {
         var31 = (String)var31;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      String var3 = var31;
      var31 = var3;
      label51:
      if (var2 == null) {
         if (!var3.equals("/")) {
            var31 = var3;
            if (var2 != null) {
               break label51;
            }

            if (!var3.endsWith("/")) {
               var3 = var3 + "/";
            }
         }

         var31 = var3;
      }

      Registry.packArgs(var31);
      long var26 = 396962080382410298L;
      Ref.h2(396962080382410298L, var26);

      try {
         ;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }
   }
}





