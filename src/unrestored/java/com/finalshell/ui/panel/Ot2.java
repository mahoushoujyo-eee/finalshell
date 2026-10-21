package com.finalshell.ui.panel;

import com.finalshell.core.FN;
import com.finalshell.core.N1;
import com.finalshell.task.PJ;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Ot2 extends Om2 {
   public static ImageIcon s;
   public AWTEventListener h = null;
   public static long a;

   public Ot2() {
      this.setIcon(s);
      this.h = new N1(this);
      Toolkit.getDefaultToolkit().addAWTEventListener(this.h, a);
   }

   public void S(MouseEvent var1) {
      FN.p(new PJ(this, var1));
   }

   public static void s(Ot2 var0, MouseEvent var1) {
      var0.S(var1);
   }

   public static AWTEventListener a(Ot2 var0) {
      return var0.h;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0018'5\u007fq##\u00046)~p\"0\u001f#".toCharArray();
      int var10004 = var10003.length;
      int var3 = 0;
      byte var15 = 54;
      char[] var10002 = var10003;
      int var6 = var10004;
      char[] var19;
      byte var23;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var19 = var10003;
         var10005 = var3;
         char var10008 = var10003[var3];
         var10007 = 54;
         var10006 = var10008;
         switch (var3 % 7) {
            case 0:
               var23 = 71;
               break;
            case 1:
               var23 = 114;
               break;
            case 2:
               var23 = 108;
               break;
            case 3:
               var23 = 39;
               break;
            case 4:
               var23 = 52;
               break;
            case 5:
               var23 = 58;
               break;
            default:
               var23 = 118;
         }
      } else {
         var15 = 54;
         var6 = var10004;
         if (var10004 <= var3) {
            String var18 = new String(var10003).intern();
            byte var10 = -1;
            String var5 = var18;
            long var4 = 2591893747437425493L;
            long var14 = 2591893747437425477L ^ var4;
            var10 = -1;
            a = var14;
            s = new ImageIcon(Ot2.class.getResource(var5));
            return;
         }

         var19 = var10003;
         var10005 = var3;
         char var24 = var10003[var3];
         var10007 = 54;
         var10006 = var24;
         switch (var3 % 7) {
            case 0:
               var23 = 71;
               break;
            case 1:
               var23 = 114;
               break;
            case 2:
               var23 = 108;
               break;
            case 3:
               var23 = 39;
               break;
            case 4:
               var23 = 52;
               break;
            case 5:
               var23 = 58;
               break;
            default:
               var23 = 118;
         }
      }

      while (true) {
         var19[var10005] = (char)(var10006 ^ var10007 ^ var23);
         var3++;
         if (var15 == 0) {
            var19 = var10002;
            var10005 = var15;
            char var26 = var10002[var15];
            var10007 = var15;
            var10006 = var26;
            switch (var3 % 7) {
               case 0:
                  var23 = 71;
                  break;
               case 1:
                  var23 = 114;
                  break;
               case 2:
                  var23 = 108;
                  break;
               case 3:
                  var23 = 39;
                  break;
               case 4:
                  var23 = 52;
                  break;
               case 5:
                  var23 = 58;
                  break;
               default:
                  var23 = 118;
            }
         } else {
            if (var6 <= var3) {
               String var17 = new String(var10002).intern();
               byte var8 = -1;
               String var2 = var17;
               long var0 = 2591893747437425493L;
               long var13 = 2591893747437425477L ^ var0;
               var8 = -1;
               a = var13;
               s = new ImageIcon(Ot2.class.getResource(var2));
               return;
            }

            var19 = var10002;
            var10005 = var3;
            char var25 = var10002[var3];
            var10007 = var15;
            var10006 = var25;
            switch (var3 % 7) {
               case 0:
                  var23 = 71;
                  break;
               case 1:
                  var23 = 114;
                  break;
               case 2:
                  var23 = 108;
                  break;
               case 3:
                  var23 = 39;
                  break;
               case 4:
                  var23 = 52;
                  break;
               case 5:
                  var23 = 58;
                  break;
               default:
                  var23 = 118;
            }
         }
      }
   }
}





