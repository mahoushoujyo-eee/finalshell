package com.finalshell.core;

import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.ListUI;

public class Ii4 implements ListCellRenderer {
   public Map V = new HashMap();
   public static String a;

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      String var6;
      Uv2 var7;
      Ui2 var8;
      Ui2 var11;
      Color var13;
      label33: {
         var7 = (Uv2)var2;
         var8 = this.m(var7);
         String var10000 = com.finalshell.ui.panel.Co2.U$String();
         var8.setFont(var1.getFont());
         var6 = var10000;
         var11 = var8;
         JList var10001 = var1;
         if (var6 != null) {
            var8.setEnabled(var1.isEnabled());
            var11 = var8;
            if (var4) {
               var13 = var1.getSelectionForeground();
               break label33;
            }

            var10001 = var1;
         }

         var13 = var10001.getForeground();
      }

      label27: {
         var11.setForeground(var13);
         var13 = (Color)var7.g();
         if (var6 != null) {
            if (var13 == null) {
               var15 = "";
               break label27;
            }

            var13 = (Color)var7.g();
         }

         var15 = var13.toString();
      }

      var8.setText(var15);
      ListUI var9 = var1.getUI();
      int var12 = (var9 instanceof Yc2_2) ? 1 : 0;
      if (var6 != null) {
         var12 = var12 != 0 ? ((Yc2_2)var9).y() : Wx4.y;
      }

      int var10 = var12;
      var8.f(var10 + 2, var10 + 2, var10 + 2, var10 + 4);
      var8.setComponentOrientation(var1.getComponentOrientation());
      return var8;
   }

   public Ui2 m(Uv2 var1) {
      String var10000 = com.finalshell.ui.panel.Co2.U$String();
      String var3 = var1.o();
      String var2 = var10000;
      Map var6 = this.V;
      String var10001 = var3;
      if (var2 != null) {
         if (!this.V.containsKey(var3)) {
            Ui2 var5 = new Ui2();
            var5.setName(a);
            var5.M(var1.Z(), false);
            this.V.put(var3, var5);
            return var5;
         }

         var6 = this.V;
         var10001 = var3;
      }

      Ui2 var4 = (Ui2)var6.get(var10001);
      var4.M(var1.Z(), C_Q.v);
      return var4;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0012eyCs#S2`XR3$S,ix".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 92;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 92;
         var10006 = var0;
      } else {
         var6 = 92;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 92;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 2;
               break;
            case 1:
               var23 = 80;
               break;
            case 2:
               var23 = 86;
               break;
            case 3:
               var23 = 107;
               break;
            case 4:
               var23 = 1;
               break;
            case 5:
               var23 = 28;
               break;
            default:
               var23 = 106;
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
   private static Object var15;
}





