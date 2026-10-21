package com.finalshell.ui.adapter;

import com.finalshell.core.LN3;
import com.finalshell.core.SshKeyCodec;
import com.finalshell.core.PW3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ImportMenuPanel;
import java.awt.Color;
import java.awt.Component;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class C6 extends DefaultTableCellRenderer {
   public Border C;
   public SimpleDateFormat b;
   public static String a;
   public static long[] c;
   public static Integer[] d;

   public C6() {
      Border var10001 = BorderFactory.createEmptyBorder(4, 4, 4, 2);
      long var2 = 296246120578563253L;
      Border var1 = var10001;
      Ref.s(296246120578563253L, var1, var2);
      SimpleDateFormat var10002 = new SimpleDateFormat(a);
      long var4 = 496749488938405641L;
      SimpleDateFormat var3 = var10002;
      Ref.s(496749488938405641L, var3, var4);
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      String var39;
      Integer var41;
      String[] var10000 = ImportMenuPanel.j();
      Component var8 = super.getTableCellRendererComponent(var1, var2, var3, var4, var5, var6);
      JLabel var9 = (JLabel)var8;
      String[] var7 = var10000;
      byte var10 = 2;
      int var11 = var1.convertColumnIndexToModel(var6);
      JLabel var31 = var2.getClass().equals(LN3.class);
      if (var7 != null) {
         if (var31 == null) {
            LN3 var12 = (LN3)var2;
            String var13 = "";
            PW3 var10001 = (PW3)(Registry.emptyArgs());
            long var17 = 589598944901412818L;
            Object var16 = var10001;
            var10001 = Ref.h(589598944901412818L, var16, var17);

            try {
               var10001 = (PW3)var10001;
            } catch (InvocationTargetException var29) {
               throw var29.getTargetException();
            }

            label96: {
               PW3 var14 = var10001;
               boolean var15 = false;
               int var34 = var11;
               if (var7 != null) {
                  if (var11 == 0) {
                     String var10002 = (String)(Registry.emptyArgs());
                     long var19 = 286931176286176762L;
                     Object var18 = var10002;
                     var10002 = Ref.h(286931176286176762L, var18, var19);

                     try {
                        var10002 = (String)var10002;
                     } catch (InvocationTargetException var28) {
                        throw var28.getTargetException();
                     }

                     var13 = var10002;
                     if (var7 != null) {
                        break label96;
                     }
                  }

                  var34 = var11;
               }

               byte var37 = 1;
               if (var7 != null) {
                  if (var34 == 1) {
                     Registry.packArgs(var14.J().y());
                     long var20 = 299675602822729345L;
                     Object var38 = Ref.h2(299675602822729345L, var20);

                     try {
                        var39 = (String)var38;
                     } catch (InvocationTargetException var27) {
                        throw var27.getTargetException();
                     }

                     var13 = var39;
                     if (var7 != null) {
                        break label96;
                     }
                  }

                  var34 = var11;
                  var37 = 2;
               }

               if (var34 == var37) {
                  new StringBuilder();
                  Object var40 = Registry.packArgs(var14.J());
                  long var22 = 170223443202070248L;
                  Object var10003 = Ref.h2(170223443202070248L, var22);

                  try {
                     var41 = (Integer)var10003;
                  } catch (InvocationTargetException var26) {
                     throw var26.getTargetException();
                  }

                  var13 = var40.append(var41).append("").toString();
               }
            }

            var9.setText(var13);
         }

         var9.setHorizontalAlignment(var10);
         var31 = var9;
         Object var24 = 296246120578563253L;
         this.setBorder((Border)Ref.g(296246120578563253L, var24));
         var9.setForeground(new Color(a(2203, 1732309420666866939L), a(1033, 8704645618772656234L), a(1033, 8704645618772656234L)));
      }

      if (var7 != null) {
         if (var31 == null) {
            var9.setOpaque(true);
            if (var7 != null) {
               return var8;
            }
         }

         var31 = var5 % 2;
      }

      JLabel var30 = var31;
      if (var7 != null) {
         if (var30 == null) {
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

   public static int i(SshKeyCodec var0) {
      return var0.r$int();
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17506;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String var39;
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
            var39 = new String(var10003).intern();
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
}





