package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.NO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComboBox;

public class KN3 implements ActionListener {
   public final NO b;

   public KN3(NO var1) {
      this.b = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = com.finalshell.core.Km2.U$String();
      Object var3 = 530654625003956107L;
      NO var10001 = (NO)Ref.g(530654625003956107L, var3);
      Object var5 = 530654625003956107L;
      Object[] var10003 = Registry.packArgs(Ref.g(530654625003956107L, var5));
      long var7 = 134739056112489376L;
      JComboBox var10004 = (JComboBox)Ref.h2(134739056112489376L, var7);

      try {
         var10004 = var10004;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      int var14 = var10004.getSelectedIndex();
      if (var2 == null) {
         var14 = var14 == 2 ? 1 : 0;
      }

      Registry.packArgs(var10003, var14);
      long var9 = 364338532999266861L;
      Ref.h2(364338532999266861L, var9);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }
}





