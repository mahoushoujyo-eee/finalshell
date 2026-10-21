import java.awt.Toolkit;
import javax.swing.JDialog;

public class u7_2 extends JDialog {
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public u7_2() {
      this.setModal(true);
      gg_2 var1 = new gg_2();
      this.setContentPane(var1);
      this.setIconImage(Toolkit.getDefaultToolkit().getImage(a));
   }

   public void U() {
      this.setSize(a(30676, 7368661948799879176L), a(28680, 5160522776274145237L));
      this.setLocationRelativeTo(null);
      this.setVisible(true);
   }

   public void v() {
      this.setVisible(false);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "wW%o\u0016\u0005\u00116\u001f#,\u0001D\u001a".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var25 = 53;
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
         var10007 = 53;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var37 = 108;
               break;
            case 1:
               var37 = 77;
               break;
            case 2:
               var37 = 121;
               break;
            case 3:
               var37 = 55;
               break;
            case 4:
               var37 = 68;
               break;
            case 5:
               var37 = 31;
               break;
            default:
               var37 = 72;
         }
      } else {
         var25 = 53;
         var16 = var10004;
         if (var10004 <= var8) {
            String var29 = new String(var10003).intern();
            int var21 = -1;
            a = var29;
            long var9 = 4343560443751103786L;
            long[] var14 = new long[2];
            int var11 = 0;
            String var12 = "/Òà¿¶\u001ft\u000eÙ'\u009f<I\u001aòi";
            int var13 = "/Òà¿¶\u001ft\u000eÙ'\u009f<I\u001aòi".length();
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
         var10007 = 53;
         var10006 = var38;
         switch (var8 % 7) {
            case 0:
               var37 = 108;
               break;
            case 1:
               var37 = 77;
               break;
            case 2:
               var37 = 121;
               break;
            case 3:
               var37 = 55;
               break;
            case 4:
               var37 = 68;
               break;
            case 5:
               var37 = 31;
               break;
            default:
               var37 = 72;
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
                  var37 = 108;
                  break;
               case 1:
                  var37 = 77;
                  break;
               case 2:
                  var37 = 121;
                  break;
               case 3:
                  var37 = 55;
                  break;
               case 4:
                  var37 = 68;
                  break;
               case 5:
                  var37 = 31;
                  break;
               default:
                  var37 = 72;
            }
         } else {
            if (var16 <= var8) {
               String var27 = new String(var10002).intern();
               int var18 = -1;
               a = var27;
               long var0 = 4343560443751103786L;
               long[] var6 = new long[2];
               int var3 = 0;
               String var4 = "/Òà¿¶\u001ft\u000eÙ'\u009f<I\u001aòi";
               int var5 = "/Òà¿¶\u001ft\u000eÙ'\u009f<I\u001aòi".length();
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
                  var37 = 108;
                  break;
               case 1:
                  var37 = 77;
                  break;
               case 2:
                  var37 = 121;
                  break;
               case 3:
                  var37 = 55;
                  break;
               case 4:
                  var37 = 68;
                  break;
               case 5:
                  var37 = 31;
                  break;
               default:
                  var37 = 72;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32732;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





