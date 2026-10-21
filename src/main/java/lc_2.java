import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class Lc_2 extends DefaultTableCellRenderer {
   Border e;
   SimpleDateFormat t;
   cU_3 n;
   Color Q;
   Color Y;
   Color C;
   private static final String a;
   private static final long[] b;
   private static final Integer[] c;

   Lc_2() {
      com.c.c(200208962451721363L).set(this, BorderFactory.createEmptyBorder(0, 2, 0, 2));
      com.c.c(285934017868093004L).set(this, new SimpleDateFormat(a));
      com.c.c(373423938147119446L).set(this, new cU_3());
      com.c.c(509096267464603114L).set(this, new Color(a(22521, 4040131510210101557L), a(11527, 2377333170343508941L), a(25769, 4580192591336813156L)));
      com.c.c(342557005981513554L).set(this, new Color(a(12485, 5722945380884112903L), a(22521, 4040131510210101557L), a(20106, 4037014425940564035L)));
      com.c.c(477270666069945140L).set(this, new Color(a(22319, 8278112003377529319L), a(30090, 1656303879778509633L), a(30090, 1656303879778509633L)));
      ((cU_3)com.c.c(373423938147119446L).get(this)).setFont((Font)com.c.c(593752358540399204L).get(null));
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      cU_3 var8 = (cU_3)com.c.c(373423938147119446L).get(this);
      Object var9 = null;
      Object var10 = null;
      com.ky_4[] var10000 = kA_3.y();
      byte var11 = 2;
      boolean var12 = false;
      JR var13 = (JR)var1;
      int var14 = var1.convertColumnIndexToModel(var6);
      var8.setAlignmentX((float)var11);
      var8.setHorizontalAlignment(2);
      lI_3 var15 = null;
      Object[] var10002 = com.c.a(false);
      Method var10004 = com.c.d(277230421274009311L);
      Object[] var10003 = var10002;
      cU_3 var92 = var8;
      Method var10001 = var10004;

      try {
         var10001.invoke(var92, var10003);
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      var10002 = com.c.a(false);
      var10004 = com.c.d(470566827426873505L);
      var10003 = var10002;
      cU_3 var94 = var8;
      var10001 = var10004;

      try {
         var10001.invoke(var94, var10003);
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      var10002 = com.c.a(false);
      var10004 = com.c.d(300077136152019384L);
      var10003 = var10002;
      cU_3 var96 = var8;
      var10001 = var10004;

      try {
         var10001.invoke(var96, var10003);
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      var10002 = com.c.a(var15);
      var10004 = com.c.d(246302729129552507L);
      var10003 = var10002;
      cU_3 var98 = var8;
      var10001 = var10004;

      try {
         var10001.invoke(var98, var10003);
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      com.ky_4[] var7;
      label251: {
         var8.setOpaque(true);
         var7 = var10000;
         var10000 = (com.ky_4[])var2;
         if (var7 == null) {
            if (var2 == null) {
               break label251;
            }

            var10000 = (com.ky_4[])var2;
         }

         var10000 = var10000.getClass();
         if (var7 == null) {
            if (!var10000.equals(lI_3.class)) {
               break label251;
            }

            var10000 = (com.ky_4[])var2;
         }

         var15 = (lI_3)var10000;
         Object[] var61 = com.c.f();
         Method var122 = com.c.d(382054480216091309L);
         var10002 = var61;
         lI_3 var62 = var15;
         Method var39 = var122;

         try {
            var40 = (u8_2)var39.invoke(var62, var10002);
         } catch (InvocationTargetException var31) {
            throw var31.getTargetException();
         }

         String var17;
         label252: {
            u8_2 var16 = var40;
            var17 = "";
            int var41 = var14;
            if (var7 == null) {
               if (var14 == 0) {
                  StringBuilder var42 = new StringBuilder();
                  var10002 = com.c.f();
                  var10004 = com.c.d(225195147661966806L);
                  var10003 = var10002;
                  lI_3 var101 = var15;
                  var10001 = var10004;

                  try {
                     var64 = (Long)var10001.invoke(var101, var10003);
                  } catch (InvocationTargetException var30) {
                     throw var30.getTargetException();
                  }

                  Object[] var65 = com.c.e(var64);
                  var10001 = com.c.d(148259110884974759L);
                  var10003 = var65;
                  var10002 = null;

                  try {
                     var67 = (String)var10001.invoke(var10002, var10003);
                  } catch (InvocationTargetException var29) {
                     throw var29.getTargetException();
                  }

                  var17 = var42.append(var67).append(" ").toString();
                  Object[] var68 = com.c.a(true);
                  Method var126 = com.c.d(470566827426873505L);
                  var10002 = var68;
                  cU_3 var69 = var8;
                  Method var43 = var126;

                  try {
                     var43.invoke(var69, var10002);
                  } catch (InvocationTargetException var28) {
                     throw var28.getTargetException();
                  }

                  var8.setHorizontalAlignment(4);
                  if (var7 == null) {
                     break label252;
                  }
               }

               var41 = var14;
            }

            byte var70 = 1;
            if (var7 == null) {
               if (var41 == 1) {
                  StringBuilder var44 = new StringBuilder();
                  var10002 = com.c.f();
                  var10004 = com.c.d(218205101142805647L);
                  var10003 = var10002;
                  lI_3 var106 = var15;
                  var10001 = var10004;

                  try {
                     var72 = (Float)var10001.invoke(var106, var10003);
                  } catch (InvocationTargetException var27) {
                     throw var27.getTargetException();
                  }

                  Object[] var73 = com.c.a(var72);
                  var10001 = com.c.d(122164552401629502L);
                  var10003 = var73;
                  var10002 = null;

                  try {
                     var75 = (String)var10001.invoke(var10002, var10003);
                  } catch (InvocationTargetException var26) {
                     throw var26.getTargetException();
                  }

                  var17 = var44.append(var75).append("").toString();
                  Object[] var76 = com.c.a(true);
                  Method var130 = com.c.d(277230421274009311L);
                  var10002 = var76;
                  cU_3 var77 = var8;
                  Method var45 = var130;

                  try {
                     var45.invoke(var77, var10002);
                  } catch (InvocationTargetException var25) {
                     throw var25.getTargetException();
                  }

                  var8.setHorizontalAlignment(4);
                  if (var7 == null) {
                     break label252;
                  }
               }

               var41 = var14;
               var70 = 2;
            }

            if (var7 == null) {
               if (var41 == var70) {
                  Object[] var78 = com.c.f();
                  Method var131 = com.c.d(505915899939017355L);
                  var10002 = var78;
                  lI_3 var79 = var15;
                  Method var46 = var131;

                  try {
                     var47 = (String)var46.invoke(var79, var10002);
                  } catch (InvocationTargetException var24) {
                     throw var24.getTargetException();
                  }

                  var17 = var47;
                  if (var7 == null) {
                     if (var16 != null) {
                        Object[] var80 = com.c.f();
                        Method var132 = com.c.d(505915899939017355L);
                        var10002 = var80;
                        lI_3 var81 = var15;
                        Method var48 = var132;

                        try {
                           var49 = (String)var48.invoke(var81, var10002);
                        } catch (InvocationTargetException var23) {
                           throw var23.getTargetException();
                        }

                        var17 = var49;
                     }

                     var17 = var17.trim();
                  }

                  String var50 = var17;
                  if (var7 == null) {
                     var10002 = com.c.f();
                     var10004 = com.c.d(505915899939017355L);
                     var10003 = var10002;
                     lI_3 var113 = var15;
                     var10001 = var10004;

                     try {
                        var83 = (String)var10001.invoke(var113, var10003);
                     } catch (InvocationTargetException var22) {
                        throw var22.getTargetException();
                     }

                     if (var17.equals(var83)) {
                        break label252;
                     }

                     StringBuilder var51 = new StringBuilder();
                     var10002 = com.c.f();
                     var10004 = com.c.d(505915899939017355L);
                     var10003 = var10002;
                     lI_3 var115 = var15;
                     var10001 = var10004;

                     try {
                        var85 = (String)var10001.invoke(var115, var10003);
                     } catch (InvocationTargetException var21) {
                        throw var21.getTargetException();
                     }

                     var50 = var51.append(var85).append("┋").append(var17).toString();
                  }

                  var17 = var50;
                  if (var7 == null) {
                     break label252;
                  }
               }

               var41 = var14;
               var70 = 5;
            }

            label211:
            if (var41 == var70) {
               u8_2 var52 = var16;
               if (var7 == null) {
                  if (var16 == null) {
                     break label211;
                  }

                  var52 = var16;
               }

               Object[] var86 = com.c.f();
               Method var135 = com.c.d(577747074549625554L);
               var10002 = var86;
               u8_2 var87 = var52;
               Method var53 = var135;

               try {
                  var54 = (String)var53.invoke(var87, var10002);
               } catch (InvocationTargetException var20) {
                  throw var20.getTargetException();
               }

               if (var7 == null) {
                  if (var54 == null) {
                     break label211;
                  }

                  Object[] var88 = com.c.f();
                  Method var136 = com.c.d(577747074549625554L);
                  var10002 = var88;
                  u8_2 var89 = var16;
                  Method var55 = var136;

                  try {
                     var54 = (String)var55.invoke(var89, var10002);
                  } catch (InvocationTargetException var19) {
                     throw var19.getTargetException();
                  }
               }

               var17 = var54;
            }
         }

         var8.setText(var17);
      }

      var8.setBorder((Border)com.c.c(200208962451721363L).get(this));
      Object[] var90 = com.c.a(var15);
      Method var137 = com.c.d(160445587339969154L);
      var10002 = var90;
      cU_3 var91 = var8;
      Method var56 = var137;

      try {
         var56.invoke(var91, var10002);
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      label198: {
         label197: {
            int var36 = var5 % 2;
            if (var7 == null) {
               if (var36 != 0) {
                  break label197;
               }

               var8.setBackground((Color)com.c.c(509096267464603114L).get(this));
            }

            if (var7 == null) {
               break label198;
            }
         }

         var8.setBackground((Color)com.c.c(342557005981513554L).get(this));
      }

      cU_3 var57 = var8;
      if (var7 == null) {
         var8.setForeground((Color)com.c.c(477270666069945140L).get(this));
         if (var2 == null) {
            var8.setText("");
            var8.setBackground(new Color(a(31857, 8904999680057125567L), a(2895, 3760025786835852672L), a(22521, 4040131510210101557L)));
         }

         var57 = var8;
      }

      return var57;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "f%\u0004G?\u001eT08\u0019\u001eX\u001b#r1".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 33;
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
         var10007 = 33;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 62;
               break;
            case 1:
               var50 = 125;
               break;
            case 2:
               var50 = 92;
               break;
            case 3:
               var50 = 31;
               break;
            case 4:
               var50 = 49;
               break;
            case 5:
               var50 = 114;
               break;
            default:
               var50 = 56;
         }
      } else {
         var34 = 33;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            a = var39;
            long var9 = 3800560510689456704L;
            long[] var14 = new long[9];
            int var11 = 0;
            String var12 = "Â¾mbÈ\u0016Ip\u0014\u0006}[\u0099I\u00113ß´f\u0092\u000f2³\u0095j\u008c§*ÈU*ù5¶ajÍÀ\u0018\nfìD¬é\u00ado:§DóE\u0004ê3\u0080";
            int var13 = "Â¾mbÈ\u0016Ip\u0014\u0006}[\u0099I\u00113ß´f\u0092\u000f2³\u0095j\u008c§*ÈU*ù5¶ajÍÀ\u0018\nfìD¬é\u00ado:§DóE\u0004ê3\u0080".length();
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
                           c = new Integer[9];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "\u0092\u0093\u0098Åê\u0084\u0000ÛÍx<\u0095S\u008aÔ¡";
                        var13 = "\u0092\u0093\u0098Åê\u0084\u0000ÛÍx<\u0095S\u008aÔ¡".length();
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
         var10007 = 33;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 62;
               break;
            case 1:
               var50 = 125;
               break;
            case 2:
               var50 = 92;
               break;
            case 3:
               var50 = 31;
               break;
            case 4:
               var50 = 49;
               break;
            case 5:
               var50 = 114;
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
                  var50 = 62;
                  break;
               case 1:
                  var50 = 125;
                  break;
               case 2:
                  var50 = 92;
                  break;
               case 3:
                  var50 = 31;
                  break;
               case 4:
                  var50 = 49;
                  break;
               case 5:
                  var50 = 114;
                  break;
               default:
                  var50 = 56;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               a = var36;
               long var0 = 3800560510689456704L;
               long[] var6 = new long[9];
               int var3 = 0;
               String var4 = "Â¾mbÈ\u0016Ip\u0014\u0006}[\u0099I\u00113ß´f\u0092\u000f2³\u0095j\u008c§*ÈU*ù5¶ajÍÀ\u0018\nfìD¬é\u00ado:§DóE\u0004ê3\u0080";
               int var5 = "Â¾mbÈ\u0016Ip\u0014\u0006}[\u0099I\u00113ß´f\u0092\u000f2³\u0095j\u008c§*ÈU*ù5¶ajÍÀ\u0018\nfìD¬é\u00ado:§DóE\u0004ê3\u0080".length();
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
                              c = new Integer[9];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "\u0092\u0093\u0098Åê\u0084\u0000ÛÍx<\u0095S\u008aÔ¡";
                           var5 = "\u0092\u0093\u0098Åê\u0084\u0000ÛÍx<\u0095S\u008aÔ¡".length();
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
                  var50 = 62;
                  break;
               case 1:
                  var50 = 125;
                  break;
               case 2:
                  var50 = 92;
                  break;
               case 3:
                  var50 = 31;
                  break;
               case 4:
                  var50 = 49;
                  break;
               case 5:
                  var50 = 114;
                  break;
               default:
                  var50 = 56;
            }
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22218;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





