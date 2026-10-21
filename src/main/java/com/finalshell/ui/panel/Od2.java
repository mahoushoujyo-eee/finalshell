package com.finalshell.ui.panel;

import com.finalshell.core.Xg2;
import com.finalshell.ui.model.CB3;
import java.awt.Component;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.ImageIcon;
import javax.swing.JTree;

public class Od2 extends J3 {
   public static ImageIcon Y;
   public static Map W;

   public static ImageIcon p(ImageIcon var0) {
      String[] var10000 = CB3.C$arrString();
      ImageIcon var2 = (ImageIcon)W.get(var0);
      String[] var1 = var10000;
      ImageIcon var3 = var2;
      if (var1 != null) {
         if (var2 == null) {
            var2 = Xg2.I(new ImageIcon[]{var0, Y});
            W.put(var0, var2);
         }

         var3 = var2;
      }

      return var3;
   }

   @Override
   public G x(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      String[] var8 = CB3.C$arrString();
      Od2 var10000 = this;
      if (var8 != null) {
         super.x(var1, var2, var3, var4, var5, var6, var7);
         if (var2 instanceof CB3) {
            CB3 var9 = (CB3)var2;
            if (var9.d()) {
               this.setIcon(var9.Y());
            }
         }

         var10000 = this;
      }

      return var10000;
   }

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      return this.x(var1, var2, var3, var4, var5, var6, var7);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "~8[\r~\u001apv2X\u0006i\u001bfy<".toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      byte var8 = 18;
      char[] var10002 = var10003;
      int var3 = var10004;
      char[] var12;
      byte var16;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var12 = var10003;
         var10005 = var1;
         char var10008 = var10003[var1];
         var10007 = 18;
         var10006 = var10008;
         switch (var1 % 7) {
            case 0:
               var16 = 5;
               break;
            case 1:
               var16 = 73;
               break;
            case 2:
               var16 = 38;
               break;
            case 3:
               var16 = 113;
               break;
            case 4:
               var16 = 31;
               break;
            case 5:
               var16 = 39;
               break;
            default:
               var16 = 4;
         }
      } else {
         var8 = 18;
         var3 = var10004;
         if (var10004 <= var1) {
            String var11 = new String(var10003).intern();
            byte var6 = -1;
            String var2 = var11;
            Y = new ImageIcon(CB3.class.getResource(var2));
            W = new WeakHashMap(5);
            return;
         }

         var12 = var10003;
         var10005 = var1;
         char var17 = var10003[var1];
         var10007 = 18;
         var10006 = var17;
         switch (var1 % 7) {
            case 0:
               var16 = 5;
               break;
            case 1:
               var16 = 73;
               break;
            case 2:
               var16 = 38;
               break;
            case 3:
               var16 = 113;
               break;
            case 4:
               var16 = 31;
               break;
            case 5:
               var16 = 39;
               break;
            default:
               var16 = 4;
         }
      }

      while (true) {
         var12[var10005] = (char)(var10006 ^ var10007 ^ var16);
         var1++;
         if (var8 == 0) {
            var12 = var10002;
            var10005 = var8;
            char var19 = var10002[var8];
            var10007 = var8;
            var10006 = var19;
            switch (var1 % 7) {
               case 0:
                  var16 = 5;
                  break;
               case 1:
                  var16 = 73;
                  break;
               case 2:
                  var16 = 38;
                  break;
               case 3:
                  var16 = 113;
                  break;
               case 4:
                  var16 = 31;
                  break;
               case 5:
                  var16 = 39;
                  break;
               default:
                  var16 = 4;
            }
         } else {
            if (var3 <= var1) {
               String var10 = new String(var10002).intern();
               byte var5 = -1;
               String var0 = var10;
               Y = new ImageIcon(CB3.class.getResource(var0));
               W = new WeakHashMap(5);
               return;
            }

            var12 = var10002;
            var10005 = var1;
            char var18 = var10002[var1];
            var10007 = var8;
            var10006 = var18;
            switch (var1 % 7) {
               case 0:
                  var16 = 5;
                  break;
               case 1:
                  var16 = 73;
                  break;
               case 2:
                  var16 = 38;
                  break;
               case 3:
                  var16 = 113;
                  break;
               case 4:
                  var16 = 31;
                  break;
               case 5:
                  var16 = 39;
                  break;
               default:
                  var16 = 4;
            }
         }
      }
   }
}





