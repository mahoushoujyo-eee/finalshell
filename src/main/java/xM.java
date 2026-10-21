import java.awt.Color;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class xM extends DefaultTableCellRenderer {
   Border y;
   SimpleDateFormat T;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   public xM() {
      com.c.c(586554244716968663L).set(this, BorderFactory.createEmptyBorder(4, a(10704, 2691857988118825440L), 4, 2));
      com.c.c(232231290479078586L).set(this, new SimpleDateFormat(a));
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      String[] var10000 = zK.B();
      Component var8 = super.getTableCellRendererComponent(var1, var2, (boolean)var3, var4, var5, var6);
      JLabel var9 = (JLabel)var8;
      byte var10 = 2;
      String[] var7 = var10000;
      int var11 = var1.convertColumnIndexToModel(var6);
      int var21 = var2.getClass().equals(zG.class);
      if (var7 != null) {
         if (var21 != 0) {
            zG var12 = (zG)var2;
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(546345160214988812L);
            Object[] var10002 = var10001;
            zG var31 = var12;
            Method var22 = var10003;

            try {
               var23 = (KeyStroke)var22.invoke(var31, var10002);
            } catch (InvocationTargetException var19) {
               throw var19.getTargetException();
            }

            KeyStroke var13 = var23;
            String var14 = "";
            var10001 = com.c.f();
            var10003 = com.c.d(468069908955066583L);
            var10002 = var10001;
            zG var33 = var12;
            Method var24 = var10003;

            try {
               var24.invoke(var33, var10002);
            } catch (InvocationTargetException var18) {
               throw var18.getTargetException();
            }

            label78: {
               int var25 = var11;
               if (var7 != null) {
                  if (var11 == 0) {
                     var10001 = com.c.f();
                     var10003 = com.c.d(540131728661869699L);
                     var10002 = var10001;
                     zG var35 = var12;
                     Method var26 = var10003;

                     try {
                        var10000 = (String)var26.invoke(var35, var10002);
                     } catch (InvocationTargetException var17) {
                        throw var17.getTargetException();
                     }

                     var14 = var10000;
                     if (var7 != null) {
                        break label78;
                     }
                  }

                  var25 = var11;
               }

               if (var25 == 1) {
                  Object[] var28 = com.c.a(var13);
                  Method var29 = com.c.d(214304962730069281L);
                  var10002 = var28;
                  var10001 = null;

                  try {
                     var10000 = (String)var29.invoke(var10001, var10002);
                  } catch (InvocationTargetException var16) {
                     throw var16.getTargetException();
                  }

                  var14 = var10000;
               }
            }

            var9.setText(var14);
         }

         var9.setHorizontalAlignment(var10);
         var9.setBorder((Border)com.c.c(586554244716968663L).get(this));
         var9.setForeground(new Color(a(11096, 4778359838269262697L), a(6685, 1667148110687894059L), a(6685, 1667148110687894059L)));
         var21 = var3;
      }

      if (var7 != null) {
         if (var21 != 0) {
            var9.setOpaque(true);
            if (var7 != null) {
               return var8;
            }
         }

         var21 = var5 % 2;
      }

      int var20 = var21;
      if (var7 != null) {
         if (var20 == 0) {
            var9.setOpaque(true);
            var9.setBackground(new Color(a(17820, 4325960600750597551L), a(26418, 427748747234838272L), a(26418, 427748747234838272L), 2));
            if (var7 != null) {
               return var8;
            }
         }

         var9.setOpaque(true);
      }

      var9.setBackground(new Color(a(26418, 427748747234838272L), a(26418, 427748747234838272L), a(26418, 427748747234838272L), a(20505, 3146127595539148846L)));
      return var8;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u000f\nOJ\u001bE\u0010Y\u0017R\u0013|@g\u001b\u001e".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 3;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 3;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 117;
               break;
            case 1:
               var50 = 112;
               break;
            case 2:
               var50 = 53;
               break;
            case 3:
               var50 = 48;
               break;
            case 4:
               var50 = 55;
               break;
            case 5:
               var50 = 11;
               break;
            default:
               var50 = 94;
         }
      } else {
         var34 = 3;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 1561109702469855848L;
            long[] var14 = new long[6];
            int var11 = 0;
            String var12 = "\u009bÅ\u008c ó,\u00adZ|*=5Ï2\u008fõå °\u0005(¿c\u0082³&\r\u009a\u0016)á\u001f";
            int var13 = "\u009bÅ\u008c ó,\u00adZ|*=5Ï2\u008fõå °\u0005(¿c\u0082³&\r\u009a\u0016)á\u001f".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           b = var14;
                           c = new Integer[6];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u0080\u0004jôz¢P] Þ-4Á\u000b\u009a@";
                        var13 = "\u0080\u0004jôz¢P] Þ-4Á\u000b\u009a@".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 3;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 117;
               break;
            case 1:
               var50 = 112;
               break;
            case 2:
               var50 = 53;
               break;
            case 3:
               var50 = 48;
               break;
            case 4:
               var50 = 55;
               break;
            case 5:
               var50 = 11;
               break;
            default:
               var50 = 94;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 117;
                  break;
               case 1:
                  var50 = 112;
                  break;
               case 2:
                  var50 = 53;
                  break;
               case 3:
                  var50 = 48;
                  break;
               case 4:
                  var50 = 55;
                  break;
               case 5:
                  var50 = 11;
                  break;
               default:
                  var50 = 94;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 1561109702469855848L;
               long[] var6 = new long[6];
               int var3 = 0;
               String var4 = "\u009bÅ\u008c ó,\u00adZ|*=5Ï2\u008fõå °\u0005(¿c\u0082³&\r\u009a\u0016)á\u001f";
               int var5 = "\u009bÅ\u008c ó,\u00adZ|*=5Ï2\u008fõå °\u0005(¿c\u0082³&\r\u009a\u0016)á\u001f".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[6];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u0080\u0004jôz¢P] Þ-4Á\u000b\u009a@";
                           var5 = "\u0080\u0004jôz¢P] Þ-4Á\u000b\u009a@".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 117;
                  break;
               case 1:
                  var50 = 112;
                  break;
               case 2:
                  var50 = 53;
                  break;
               case 3:
                  var50 = 48;
                  break;
               case 4:
                  var50 = 55;
                  break;
               case 5:
                  var50 = 11;
                  break;
               default:
                  var50 = 94;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24626;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





