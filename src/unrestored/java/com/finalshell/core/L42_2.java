package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SendSyncMailPanel;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;

public class L42_2 implements Fb2 {
   public final SendSyncMailPanel m;

   public L42_2(SendSyncMailPanel var1) {
      this.m = var1;
   }

   @Override
   public void O(Ty4 var1) {
      SendSyncMailPanel.u();
      Object var10002 = Registry.emptyArgs();
      long var5 = 542590257020999358L;
      Object var4 = var10002;
      var10002 = Ref.h(542590257020999358L, var4, var5);

      try {
         var16 = (Integer)var10002;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      int var3 = var16;
      int var10001 = var3;
      int var17 = Registry.lookupField(372606448848052772L).getInt(null);
      if (var1 != null) {
         if (var3 == var17) {
            Object var6 = 300416987385116995L;
            Ref.g(300416987385116995L, var6);
            Object var8 = 304856760029970283L;
            ((JButton)Ref.g(304856760029970283L, var8)).setEnabled(false);
            if (var1 != null) {
               return;
            }
         }

         var10001 = var3;
         var17 = Registry.lookupField(213416441008748074L).getInt(null);
      }

      if (var10001 == var17) {
         Object var10 = 300416987385116995L;
         Ref.g(300416987385116995L, var10);
         Object var12 = 304856760029970283L;
         ((JButton)Ref.g(304856760029970283L, var12)).setEnabled(true);
      }
   }
   private static Object var16;
}





