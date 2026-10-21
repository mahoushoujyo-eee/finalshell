package com.finalshell.ui.panel;

import com.finalshell.core.FN;
import com.finalshell.ui.listener.EU3;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class M2 extends JComponent {
   public static ImageIcon O;
   public static Dimension h;

   public M2() {
      FN.Y(this);
      this.setCursor(Cursor.getPredefinedCursor(5));
      EU3.x(this, 4);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      var1.drawImage(O.getImage(), this.getWidth() - O.getIconWidth(), this.getHeight() - O.getIconHeight(), null);
   }

   @Override
   public Dimension getPreferredSize() {
      return h;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "-)?O,,T+8>D--G*-".toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      byte var8 = 79;
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
         var10007 = 79;
         var10006 = var10008;
         switch (var1 % 7) {
            case 0:
               var16 = 11;
               break;
            case 1:
               var16 = 5;
               break;
            case 2:
               var16 = 31;
               break;
            case 3:
               var16 = 110;
               break;
            case 4:
               var16 = 16;
               break;
            case 5:
               var16 = 76;
               break;
            default:
               var16 = 120;
         }
      } else {
         var8 = 79;
         var3 = var10004;
         if (var10004 <= var1) {
            String var11 = new String(var10003).intern();
            byte var6 = -1;
            String var2 = var11;
            O = new ImageIcon(M2.class.getResource(var2));
            h = new Dimension(O.getIconWidth(), O.getIconHeight());
            return;
         }

         var12 = var10003;
         var10005 = var1;
         char var17 = var10003[var1];
         var10007 = 79;
         var10006 = var17;
         switch (var1 % 7) {
            case 0:
               var16 = 11;
               break;
            case 1:
               var16 = 5;
               break;
            case 2:
               var16 = 31;
               break;
            case 3:
               var16 = 110;
               break;
            case 4:
               var16 = 16;
               break;
            case 5:
               var16 = 76;
               break;
            default:
               var16 = 120;
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
                  var16 = 11;
                  break;
               case 1:
                  var16 = 5;
                  break;
               case 2:
                  var16 = 31;
                  break;
               case 3:
                  var16 = 110;
                  break;
               case 4:
                  var16 = 16;
                  break;
               case 5:
                  var16 = 76;
                  break;
               default:
                  var16 = 120;
            }
         } else {
            if (var3 <= var1) {
               String var10 = new String(var10002).intern();
               byte var5 = -1;
               String var0 = var10;
               O = new ImageIcon(M2.class.getResource(var0));
               h = new Dimension(O.getIconWidth(), O.getIconHeight());
               return;
            }

            var12 = var10002;
            var10005 = var1;
            char var18 = var10002[var1];
            var10007 = var8;
            var10006 = var18;
            switch (var1 % 7) {
               case 0:
                  var16 = 11;
                  break;
               case 1:
                  var16 = 5;
                  break;
               case 2:
                  var16 = 31;
                  break;
               case 3:
                  var16 = 110;
                  break;
               case 4:
                  var16 = 16;
                  break;
               case 5:
                  var16 = 76;
                  break;
               default:
                  var16 = 120;
            }
         }
      }
   }
}





