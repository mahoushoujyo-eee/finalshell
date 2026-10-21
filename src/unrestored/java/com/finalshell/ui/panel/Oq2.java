package com.finalshell.ui.panel;

import com.finalshell.core.Wx4;
import com.finalshell.core.Yc2_2;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.ListUI;

public class Oq2 extends OS implements ListCellRenderer {
   public static String c;

   public Oq2() {
      this.setName(c);
   }

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      String[] var6;
      Oq2 var9;
      Color var11;
      label52: {
         String[] var10000 = CI.c();
         this.setFont(var1.getFont());
         var6 = var10000;
         var9 = this;
         JList var10001 = var1;
         if (var6 == null) {
            this.setEnabled(var1.isEnabled());
            var9 = this;
            if (var4) {
               var11 = var1.getSelectionForeground();
               break label52;
            }

            var10001 = var1;
         }

         var11 = var10001.getForeground();
      }

      label55: {
         var9.setForeground(var11);
         if (var6 == null) {
            if (var2 instanceof Icon) {
               this.setIcon((Icon)var2);
               this.setText("");
               if (var6 == null) {
                  break label55;
               }

               Ky4.K(new String[2]);
            }

            this.setIcon(null);
         }

         label38: {
            var11 = (Color)var2;
            if (var6 == null) {
               if (var2 == null) {
                  var13 = "";
                  break label38;
               }

               var11 = (Color)var2;
            }

            var13 = var11.toString();
         }

         this.setText(var13);
      }

      ListUI var7 = var1.getUI();
      int var10 = (var7 instanceof Yc2_2) ? 1 : 0;
      if (var6 == null) {
         var10 = var10 != 0 ? ((Yc2_2)var7).y() : Wx4.y;
      }

      int var8 = var10;
      this.G(var8 + 2, var8 + (this.getIcon() != null ? 2 : 4), var8 + 2, var8 + 4);
      this.setComponentOrientation(var1.getComponentOrientation());
      return this;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "<U\u0017N\u001aH?\u001cP6_ZO?\u0002Y\u0016".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 95;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 95;
         var10006 = var0;
      } else {
         var6 = 95;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            c = var9;
            return;
         }

         var10005 = var10003;
         var10 = 95;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 47;
               break;
            case 1:
               var23 = 99;
               break;
            case 2:
               var23 = 59;
               break;
            case 3:
               var23 = 101;
               break;
            case 4:
               var23 = 107;
               break;
            case 5:
               var23 = 116;
               break;
            default:
               var23 = 5;
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
               c = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
   private static Object var13;
}





