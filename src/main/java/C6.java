import com.pW_3;
import java.awt.Color;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class C6 extends DefaultTableCellRenderer {
   Border C;
   SimpleDateFormat b;
   private static final String a;
   private static final long[] c;
   private static final Integer[] d;

   public C6() {
      com.c.c(296246120578563253L).set(this, BorderFactory.createEmptyBorder(4, 4, 4, 2));
      com.c.c(496749488938405641L).set(this, new SimpleDateFormat(a));
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      String[] var10000 = Y_.j();
      Component var8 = super.getTableCellRendererComponent(var1, var2, (boolean)var3, var4, var5, var6);
      JLabel var9 = (JLabel)var8;
      String[] var7 = var10000;
      byte var10 = 2;
      int var11 = var1.convertColumnIndexToModel(var6);
      int var21 = var2.getClass().equals(lN_3.class);
      if (var7 != null) {
         if (var21 != 0) {
            lN_3 var12 = (lN_3)var2;
            String var13 = "";
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(589598944901412818L);
            Object[] var10002 = var10001;
            lN_3 var31 = var12;
            Method var22 = var10003;

            try {
               var23 = (pW_3)var22.invoke(var31, var10002);
            } catch (InvocationTargetException var19) {
               throw var19.getTargetException();
            }

            label96: {
               pW_3 var14 = var23;
               boolean var15 = false;
               int var24 = var11;
               if (var7 != null) {
                  if (var11 == 0) {
                     var10001 = com.c.f();
                     var10003 = com.c.d(286931176286176762L);
                     var10002 = var10001;
                     lN_3 var33 = var12;
                     Method var25 = var10003;

                     try {
                        var10000 = (String)var25.invoke(var33, var10002);
                     } catch (InvocationTargetException var18) {
                        throw var18.getTargetException();
                     }

                     var13 = var10000;
                     if (var7 != null) {
                        break label96;
                     }
                  }

                  var24 = var11;
               }

               byte var34 = 1;
               if (var7 != null) {
                  if (var24 == 1) {
                     Object[] var27 = com.c.a(var14.J().y());
                     Method var28 = com.c.d(299675602822729345L);
                     var10002 = var27;
                     var10001 = null;

                     try {
                        var10000 = (String)var28.invoke(var10001, var10002);
                     } catch (InvocationTargetException var17) {
                        throw var17.getTargetException();
                     }

                     var13 = var10000;
                     if (var7 != null) {
                        break label96;
                     }
                  }

                  var24 = var11;
                  var34 = 2;
               }

               if (var24 == var34) {
                  StringBuilder var30 = new StringBuilder();
                  var10001 = com.c.a(var14.J());
                  Method var38 = com.c.d(170223443202070248L);
                  Object[] var47 = var10001;
                  var10002 = null;

                  try {
                     var39 = (Integer)var38.invoke(var10002, var47);
                  } catch (InvocationTargetException var16) {
                     throw var16.getTargetException();
                  }

                  var13 = var30.append(var39).append("").toString();
               }
            }

            var9.setText(var13);
         }

         var9.setHorizontalAlignment(var10);
         var9.setBorder((Border)com.c.c(296246120578563253L).get(this));
         var9.setForeground(new Color(a(2203, 1732309420666866939L), a(1033, 8704645618772656234L), a(1033, 8704645618772656234L)));
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
            var9.setBackground(new Color(a(10234, 3121205797091271576L), a(14095, 5239431937791718249L), a(14095, 5239431937791718249L), 2));
            if (var7 != null) {
               return var8;
            }
         }

         var9.setOpaque(true);
      }

      var9.setBackground(
         new Color(a(14095, 5239431937791718249L), a(14095, 5239431937791718249L), a(14095, 5239431937791718249L), a(30660, 2627616057410892709L))
      );
      return var8;
   }

   public static int i(com.ls_4 var0) {
      return var0.r();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0012;\u0018;Jx1D&\u0005b-}F\u0006/".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 68;
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
         var10007 = 68;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 47;
               break;
            case 1:
               var50 = 6;
               break;
            case 2:
               var50 = 37;
               break;
            case 3:
               var50 = 6;
               break;
            case 4:
               var50 = 33;
               break;
            case 5:
               var50 = 113;
               break;
            default:
               var50 = 56;
         }
      } else {
         var34 = 68;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 389958950445792470L;
            long[] var14 = new long[5];
            int var11 = 0;
            String var12 = "1\u0005]\u0010ØÍß|ËÎ\u00ad\u0016\\Ôü¢(\u008a6\u0006\u0005§p3";
            int var13 = "1\u0005]\u0010ØÍß|ËÎ\u00ad\u0016\\Ôü¢(\u008a6\u0006\u0005§p3".length();
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
                           c = var14;
                           d = new Integer[5];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "1\u008dá5\u0082X\u008fu¥ódf\u001a§O\u008d";
                        var13 = "1\u008dá5\u0082X\u008fu¥ódf\u001a§O\u008d".length();
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
         var10007 = 68;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 47;
               break;
            case 1:
               var50 = 6;
               break;
            case 2:
               var50 = 37;
               break;
            case 3:
               var50 = 6;
               break;
            case 4:
               var50 = 33;
               break;
            case 5:
               var50 = 113;
               break;
            default:
               var50 = 56;
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
                  var50 = 47;
                  break;
               case 1:
                  var50 = 6;
                  break;
               case 2:
                  var50 = 37;
                  break;
               case 3:
                  var50 = 6;
                  break;
               case 4:
                  var50 = 33;
                  break;
               case 5:
                  var50 = 113;
                  break;
               default:
                  var50 = 56;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 389958950445792470L;
               long[] var6 = new long[5];
               int var3 = 0;
               String var4 = "1\u0005]\u0010ØÍß|ËÎ\u00ad\u0016\\Ôü¢(\u008a6\u0006\u0005§p3";
               int var5 = "1\u0005]\u0010ØÍß|ËÎ\u00ad\u0016\\Ôü¢(\u008a6\u0006\u0005§p3".length();
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
                              c = var6;
                              d = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "1\u008dá5\u0082X\u008fu¥ódf\u001a§O\u008d";
                           var5 = "1\u008dá5\u0082X\u008fu¥ódf\u001a§O\u008d".length();
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
                  var50 = 47;
                  break;
               case 1:
                  var50 = 6;
                  break;
               case 2:
                  var50 = 37;
                  break;
               case 3:
                  var50 = 6;
                  break;
               case 4:
                  var50 = 33;
                  break;
               case 5:
                  var50 = 113;
                  break;
               default:
                  var50 = 56;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17506;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





