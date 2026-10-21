import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class Qj_2 {
   JFrame l;
   gh_2 T;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public Qj_2() {
      com.c.c(522450156462328708L).set(this, new JFrame());
      ((JFrame)com.c.c(522450156462328708L).get(this)).setSize(a(6148, 2530760439969728436L), a(31460, 965959573987960149L));
      JPanel var1 = new JPanel();
      var1.setLayout(new MigLayout());
      ((JFrame)com.c.c(522450156462328708L).get(this)).setContentPane(var1);
      com.c.c(198471044337009301L).set(this, new gh_2());
      var1.add((gh_2)com.c.c(198471044337009301L).get(this));
      ((JFrame)com.c.c(522450156462328708L).get(this)).setLocationRelativeTo(null);
      ((JFrame)com.c.c(522450156462328708L).get(this)).setVisible(true);
      ((gh_2)com.c.c(198471044337009301L).get(this)).setText(a);
   }

   public Icon Q(JButton var1, String var2) {
      BufferedImage var4 = null;
      Object var5 = null;
      ((gh_2)com.c.c(198471044337009301L).get(this)).setText(var2);
      int var6 = ((gh_2)com.c.c(198471044337009301L).get(this)).M();
      String[] var10000 = F8.y();
      int var7 = ((gh_2)com.c.c(198471044337009301L).get(this)).m();
      String[] var3 = var10000;
      float var8 = 1.0F;
      var6 = (int)(67.0F * var8);
      var7 = (int)(22.0F * var8);
      int var15 = var6;
      if (var3 == null) {
         if (var6 <= 0) {
            return (Icon)var5;
         }

         var15 = var6;
      }

      Object[] var16 = com.c.a(var15, var7);
      Method var17 = com.c.d(401056956354921780L);
      Object[] var24 = var16;
      Object var21 = null;

      try {
         var18 = (BufferedImage)var17.invoke(var21, var24);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      var4 = var18;
      Graphics2D var9 = (Graphics2D)var4.getGraphics();
      var10000 = (String[])com.c.c(198471044337009301L).get(this);
      var21 = com.c.a(var9);
      Method var10003 = com.c.d(178052568159550143L);
      var24 = (Object[])var21;
      var21 = var10000;
      Method var20 = var10003;

      try {
         var20.invoke(var21, var24);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var9.dispose();
      return new ImageIcon(var4);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24496;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





