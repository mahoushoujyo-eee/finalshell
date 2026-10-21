package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.EffectPreview;
import com.finalshell.ui.panel.EnableBackgroundImage;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class C52 implements ListSelectionListener {
   public final EffectPreview N;

   public C52(EffectPreview var1) {
      this.N = var1;
   }

   @Override
   public void valueChanged(ListSelectionEvent var1) {
      EnableBackgroundImage.I();
      Object var6 = 367178606097325528L;
      Object var10002 = Ref.g(367178606097325528L, var6);
      Object var8 = 581380630510889882L;
      Object var3 = ((JTable)Ref.g(581380630510889882L, var8)).getSelectedRow();
      Object var2 = var10002;
      var10002 = var3;
      if (var2 != null) {
         if (!(var3 > -1)) {
            return;
         }

         var10002 = this;
         Object var10 = 367178606097325528L;
         Ref.g(367178606097325528L, var10);
         Object var12 = 581380630510889882L;
         ((JTable)Ref.g(581380630510889882L, var12)).convertRowIndexToModel((int)var3);
      }

      C52 var4 = (C52)var10002;
      Object var14 = 367178606097325528L;
      Ref.g(367178606097325528L, var14);
      Object var16 = 636070429409312733L;
      Ref.g(636070429409312733L, var16);
      Object[] var10005 = Registry.packArgs((int)var4, 0);
      long var19 = 264813943573651232L;
      Object[] var18 = var10005;
      String var5 = (String)Ref.h(264813943573651232L, var18, var19);
      Object var20 = 367178606097325528L;
      Ref.g(367178606097325528L, var20);
      Object[] var10007 = Registry.packArgs(var5);
      long var23 = 363947850905951070L;
      Object[] var22 = var10007;
      Ref.h(363947850905951070L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }
   }
}





