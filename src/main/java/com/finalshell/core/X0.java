package com.finalshell.core;

import com.finalshell.ui.listener.GJ;
import com.finalshell.ui.panel.Ky4;
import java.awt.Component;
import javax.swing.JTextField;

public class X0 {
   public static long a;

   public void B(int var1, String var2, Component var3, T5 var4) {
      JTextField var6 = this.k();
      var6.setOpaque(false);
      var6.setDocument(new Ke4((int)a));
      String[] var10000 = com.finalshell.ui.panel.Cn2.Q$arrString();
      var6.setText(var2);
      GJ var7 = new GJ(this, var1, var3, var6, var4);
      var6.addFocusListener(var7);
      String[] var5 = var10000;
      var6.addKeyListener(new com.finalshell.ui.listener.Xq2(this, var6, var7, var1, var3, var4));
      var4.S(var6);
      var6.requestFocus();
      var6.selectAll();
      if (var5 == null) {
         Ky4.K(new String[2]);
      }
   }

   protected JTextField k() {
      return new JTextField();
   }

   public static void R(int var0, Component var1, String var2, T5 var3) {
      String[] var4 = com.finalshell.ui.panel.Cn2.Q$arrString();
      if (var4 != null) {
         if (var2 != null) {
            var3.Z(var0, var2);
         }

         var3.S(var1);
      }
   }

   static void k(int var0, Component var1, String var2, T5 var3) {
      R(var0, var1, var2, var3);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 3634551773197181529L;
      long var10002 = -3837181396025138581L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





