package com;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.LookAndFeel;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicEditorPaneUI;
import javax.swing.text.JTextComponent;

public class DU extends BasicEditorPaneUI {
   private static final String a;

   public static ComponentUI createUI(JComponent var0) {
      return new com.DU();
   }

   @Override
   public void installUI(JComponent var1) {
      super.installUI(var1);
      JTextComponent var2 = this.getComponent();
      com.FN.Y(var2);
      LookAndFeel.installProperty(var2, a, Boolean.TRUE);
      var2.setMargin(new Insets(2, 2, 2, 2));
      var2.setFocusable(true);
      var2.setBackground(Color.WHITE);
      var2.setSelectionColor(GO.F4);
      var2.setForeground(Color.BLACK);
      var2.setSelectedTextColor(Color.BLACK);
      var2.setCaretColor(Color.GRAY);
   }

   @Override
   protected void paintSafely(Graphics var1) {
      Object[] var10000 = com.c.a(this.getComponent(), var1);
      Method var6 = com.c.d(135169693674870498L);
      Object[] var9 = var10000;
      Object var8 = null;

      try {
         var10000 = (Graphics)var6.invoke(var8, var9);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var1 = var10000;
      Graphics2D var2 = (Graphics2D)var1;
      Map var3 = com.FN.Y(var2);
      super.paintSafely(var1);
      com.FN.k(var2, var3);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "C\u001a\u0019..S".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 87;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 87;
         var10006 = var0;
      } else {
         var6 = 87;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 87;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 123;
               break;
            case 1:
               var23 = 61;
               break;
            case 2:
               var23 = 47;
               break;
            case 3:
               var23 = 8;
               break;
            case 4:
               var23 = 12;
               break;
            case 5:
               var23 = 97;
               break;
            default:
               var23 = 78;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





