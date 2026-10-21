package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class Qj2 {
   public JFrame l;
   public Gh2_2 T;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Qj2() {
      JFrame var10001 = new JFrame();
      long var3 = 522450156462328708L;
      JFrame var2 = var10001;
      Ref.s(522450156462328708L, var2, var3);
      Object var4 = 522450156462328708L;
      ((JFrame)Ref.g(522450156462328708L, var4)).setSize(a(6148, 2530760439969728436L), a(31460, 965959573987960149L));
      JPanel var1 = new JPanel();
      var1.setLayout(new MigLayout());
      Object var6 = 522450156462328708L;
      ((JFrame)Ref.g(522450156462328708L, var6)).setContentPane(var1);
      Gh2_2 var10004 = new Gh2_2();
      long var9 = 198471044337009301L;
      Gh2_2 var8 = var10004;
      Ref.s(198471044337009301L, var8, var9);
      Object var10 = 198471044337009301L;
      this.add((Gh2_2)Ref.g(198471044337009301L, var10));
      Object var12 = 522450156462328708L;
      ((JFrame)Ref.g(522450156462328708L, var12)).setLocationRelativeTo(null);
      Object var14 = 522450156462328708L;
      ((JFrame)Ref.g(522450156462328708L, var14)).setVisible(true);
      Object var16 = 198471044337009301L;
      ((Gh2_2)Ref.g(198471044337009301L, var16)).setText(a);
   }

   public Icon Q(JButton var1, String var2) {
      BufferedImage var4 = null;
      Object var5 = null;
      Object var10 = 198471044337009301L;
      ((Gh2_2)Ref.g(198471044337009301L, var10)).setText(var2);
      Object var12 = 198471044337009301L;
      int var6 = ((Gh2_2)Ref.g(198471044337009301L, var12)).M();
      com.finalshell.ui.panel.F8.y();
      Object var14 = 198471044337009301L;
      int var7 = ((Gh2_2)Ref.g(198471044337009301L, var14)).m();
      float var8 = 1.0F;
      var6 = (int)(67.0F * var8);
      var7 = (int)(22.0F * var8);
      int var10003 = var6;
      if (this == null) {
         if (var6 <= 0) {
            return (Icon)var5;
         }

         var10003 = var6;
      }

      Registry.packArgs(var10003, var7);
      long var16 = 401056956354921780L;
      Object var10004 = Ref.h2(401056956354921780L, var16);

      try {
         var10004 = (BufferedImage)var10004;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      var4 = (BufferedImage)var10004;
      Graphics2D var9 = (Graphics2D)var4.getGraphics();
      Object var18 = 198471044337009301L;
      Ref.g(198471044337009301L, var18);
      Object[] var10006 = Registry.packArgs(var9);
      long var21 = 178052568159550143L;
      Object[] var20 = var10006;
      Ref.h(178052568159550143L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      var9.dispose();
      return new ImageIcon(var4);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24496;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "iR-F\u0013d0iR-F\u0013a5".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 58;
      char[] var10002 = var10003;
      int var16 = var10004;
      char[] var31;
      byte var37;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var31 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 58;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 55;
               break;
            case 1:
               var37 = 12;
               break;
            case 2:
               var37 = 115;
               break;
            case 3:
               var37 = 24;
               break;
            case 4:
               var37 = 77;
               break;
            case 5:
               var37 = 58;
               break;
            default:
               var37 = 110;
         }
      } else {
         var25 = 58;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 3544516012559959008L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "(x\u0005ü\u0089SÅ åÎî\u009fÿ¢§A";
            int var13 = "(x\u0005ü\u0089SÅ åÎî\u009fÿ¢§A".length();
            byte var10 = 0;

            do {
               var21 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var21, var10).getBytes("ISO-8859-1");
               var21 = var11++;
               long var35 = (
                     ((long)var15[0] & 255L) << 56
                        | ((long)var15[1] & 255L) << 48
                        | ((long)var15[2] & 255L) << 40
                        | ((long)var15[3] & 255L) << 32
                        | ((long)var15[4] & 255L) << 24
                        | ((long)var15[5] & 255L) << 16
                        | ((long)var15[6] & 255L) << 8
                        | (long)var15[7] & 255L
                  )
                  ^ var9;
               byte var30 = -1;
               var14[var21] = var35;
            } while (var10 < var13);

            b = var14;
            c = new Integer[2];
            return;
         }

         var31 = var10003;
         var10005 = var8;
         char var38 = var10003[var8];
         var10007 = 58;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 55;
               break;
            case 1:
               var37 = 12;
               break;
            case 2:
               var37 = 115;
               break;
            case 3:
               var37 = 24;
               break;
            case 4:
               var37 = 77;
               break;
            case 5:
               var37 = 58;
               break;
            default:
               var37 = 110;
         }
      }

      while (true) {
         var31[var10005] = (char)(var10006 ^ var10007 ^ var37);
         var8++;
         if (var25 == 0) {
            var31 = var10002;
            var10005 = var25;
            char var40 = var10002[var25];
            var10007 = var25;
            var10006 = var40;
            switch (var8 % 7) {
               case 0:
                  var37 = 55;
                  break;
               case 1:
                  var37 = 12;
                  break;
               case 2:
                  var37 = 115;
                  break;
               case 3:
                  var37 = 24;
                  break;
               case 4:
                  var37 = 77;
                  break;
               case 5:
                  var37 = 58;
                  break;
               default:
                  var37 = 110;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 3544516012559959008L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "(x\u0005ü\u0089SÅ åÎî\u009fÿ¢§A";
               int var5 = "(x\u0005ü\u0089SÅ åÎî\u009fÿ¢§A".length();
               byte var2 = 0;

               do {
                  var18 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var18, var2).getBytes("ISO-8859-1");
                  var18 = var3++;
                  long var34 = (
                        ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L
                     )
                     ^ var0;
                  byte var28 = -1;
                  var6[var18] = var34;
               } while (var2 < var5);

               b = var6;
               c = new Integer[2];
               return;
            }

            var31 = var10002;
            var10005 = var8;
            char var39 = var10002[var8];
            var10007 = var25;
            var10006 = var39;
            switch (var8 % 7) {
               case 0:
                  var37 = 55;
                  break;
               case 1:
                  var37 = 12;
                  break;
               case 2:
                  var37 = 115;
                  break;
               case 3:
                  var37 = 24;
                  break;
               case 4:
                  var37 = 77;
                  break;
               case 5:
                  var37 = 58;
                  break;
               default:
                  var37 = 110;
            }
         }
      }
   }
}





