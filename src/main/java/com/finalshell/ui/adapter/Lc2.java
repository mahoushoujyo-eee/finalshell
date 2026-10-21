package com.finalshell.ui.adapter;

import com.finalshell.core.JR;
import com.finalshell.core.LI3_2;
import com.finalshell.core.U82;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CU3;
import com.finalshell.ui.panel.KA_3;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class Lc2 extends DefaultTableCellRenderer {
   public Border e;
   public SimpleDateFormat t;
   public CU3 n;
   public Color Q;
   public Color Y;
   public Color C;
   public static String a;
   public static long[] b;
   public static Integer[] c;

   public Lc2() {
      Border var10001 = BorderFactory.createEmptyBorder(0, 2, 0, 2);
      long var2 = 200208962451721363L;
      Border var1 = var10001;
      Ref.s(200208962451721363L, var1, var2);
      SimpleDateFormat var10002 = new SimpleDateFormat(a);
      long var4 = 285934017868093004L;
      SimpleDateFormat var3 = var10002;
      Ref.s(285934017868093004L, var3, var4);
      CU3 var10003 = new CU3();
      long var6 = 373423938147119446L;
      CU3 var5 = var10003;
      Ref.s(373423938147119446L, var5, var6);
      Color var10004 = new Color(a(22521, 4040131510210101557L), a(11527, 2377333170343508941L), a(25769, 4580192591336813156L));
      long var8 = 509096267464603114L;
      Color var7 = var10004;
      Ref.s(509096267464603114L, var7, var8);
      Color var10005 = new Color(a(12485, 5722945380884112903L), a(22521, 4040131510210101557L), a(20106, 4037014425940564035L));
      long var10 = 342557005981513554L;
      Color var9 = var10005;
      Ref.s(342557005981513554L, var9, var10);
      Color var10006 = new Color(a(22319, 8278112003377529319L), a(30090, 1656303879778509633L), a(30090, 1656303879778509633L));
      long var12 = 477270666069945140L;
      Color var11 = var10006;
      Ref.s(477270666069945140L, var11, var12);
      Object var13 = 373423938147119446L;
      ((CU3)Ref.g(373423938147119446L, var13)).setFont((Font)Registry.lookupField(593752358540399204L).get(null));
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      Object var18 = 373423938147119446L;
      CU3 var8 = (CU3)Ref.g(373423938147119446L, var18);
      Object var9 = null;
      Object var10 = null;
      KA_3.y$arrky_4();
      byte var11 = 2;
      boolean var12 = false;
      JR var13 = (JR)var1;
      int var14 = var1.convertColumnIndexToModel(var6);
      var8.setAlignmentX((float)var11);
      var8.setHorizontalAlignment(2);
      LI3_2 var15 = null;
      Object[] var10003 = Registry.packArgs(false);
      long var21 = 277230421274009311L;
      Object[] var20 = var10003;
      Ref.h(277230421274009311L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var81) {
         throw var81.getTargetException();
      }

      Object[] var10004 = Registry.packArgs(false);
      long var23 = 470566827426873505L;
      Object[] var22 = var10004;
      Ref.h(470566827426873505L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var80) {
         throw var80.getTargetException();
      }

      Object[] var10005 = Registry.packArgs(false);
      long var25 = 300077136152019384L;
      Object[] var24 = var10005;
      Ref.h(300077136152019384L, var24, var25);

      try {
         ;
      } catch (InvocationTargetException var79) {
         throw var79.getTargetException();
      }

      Object[] var10006 = Registry.packArgs(var15);
      long var27 = 246302729129552507L;
      Object[] var26 = var10006;
      Ref.h(246302729129552507L, var26, var27);

      try {
         ;
      } catch (InvocationTargetException var78) {
         throw var78.getTargetException();
      }

      label251: {
         var8.setOpaque(true);
         var10005 = (Object[])var2;
         if (var8 == null) {
            if (var2 == null) {
               break label251;
            }

            var10005 = (Object[])var2;
         }

         var10005 = var10005.getClass();
         if (var8 == null) {
            if (!var10005.equals(LI3_2.class)) {
               break label251;
            }

            var10005 = (Object[])var2;
         }

         var15 = (LI3_2)var10005;
         var10006 = Registry.emptyArgs();
         long var29 = 382054480216091309L;
         Object[] var28 = var10006;
         var10006 = Ref.h(382054480216091309L, var28, var29);

         try {
            var10006 = (U82)var10006;
         } catch (InvocationTargetException var77) {
            throw var77.getTargetException();
         }

         Object var17;
         label252: {
            U82 var16 = var10006;
            var17 = "";
            int var88 = var14;
            if (var8 == null) {
               if (var14 == 0) {
                  new StringBuilder();
                  Object[] var10008 = Registry.emptyArgs();
                  long var31 = 225195147661966806L;
                  Object[] var30 = var10008;
                  var10008 = Ref.h(225195147661966806L, var30, var31);

                  try {
                     var96 = (Long)var10008;
                  } catch (InvocationTargetException var76) {
                     throw var76.getTargetException();
                  }

                  var10008 = Registry.e(var96);
                  long var32 = 148259110884974759L;
                  Object var10009 = Ref.h2(148259110884974759L, var32);

                  try {
                     var10009 = (String)var10009;
                  } catch (InvocationTargetException var75) {
                     throw var75.getTargetException();
                  }

                  var17 = var10008.append((String)var10009).append(" ").toString();
                  var10009 = Registry.packArgs(true);
                  long var35 = 470566827426873505L;
                  Object[] var34 = (Object[])var10009;
                  Ref.h(470566827426873505L, var34, var35);

                  try {
                     ;
                  } catch (InvocationTargetException var74) {
                     throw var74.getTargetException();
                  }

                  var8.setHorizontalAlignment(4);
                  if (var8 == null) {
                     break label252;
                  }
               }

               var88 = var14;
            }

            byte var10007 = 1;
            if (var8 == null) {
               if (var88 == 1) {
                  new StringBuilder();
                  Object[] var98 = Registry.emptyArgs();
                  long var37 = 218205101142805647L;
                  Object[] var36 = var98;
                  var98 = Ref.h(218205101142805647L, var36, var37);

                  try {
                     var100 = (Float)var98;
                  } catch (InvocationTargetException var73) {
                     throw var73.getTargetException();
                  }

                  var98 = Registry.packArgs(var100);
                  long var38 = 122164552401629502L;
                  Object var109 = Ref.h2(122164552401629502L, var38);

                  try {
                     var109 = (String)var109;
                  } catch (InvocationTargetException var72) {
                     throw var72.getTargetException();
                  }

                  var17 = var98.append((String)var109).append("").toString();
                  var109 = Registry.packArgs(true);
                  long var41 = 277230421274009311L;
                  Object[] var40 = (Object[])var109;
                  Ref.h(277230421274009311L, var40, var41);

                  try {
                     ;
                  } catch (InvocationTargetException var71) {
                     throw var71.getTargetException();
                  }

                  var8.setHorizontalAlignment(4);
                  if (var8 == null) {
                     break label252;
                  }
               }

               var88 = var14;
               var10007 = 2;
            }

            if (var8 == null) {
               if (var88 == var10007) {
                  Object[] var89 = Registry.emptyArgs();
                  long var43 = 505915899939017355L;
                  Object[] var42 = var89;
                  Object var90 = Ref.h(505915899939017355L, var42, var43);

                  try {
                     var91 = (String)var90;
                  } catch (InvocationTargetException var70) {
                     throw var70.getTargetException();
                  }

                  var17 = var91;
                  if (var8 == null) {
                     if (var16 != null) {
                        String var102 = (String)(Registry.emptyArgs());
                        long var45 = 505915899939017355L;
                        Object[] var44 = var102;
                        var102 = Ref.h(505915899939017355L, var44, var45);

                        try {
                           var102 = (String)var102;
                        } catch (InvocationTargetException var69) {
                           throw var69.getTargetException();
                        }

                        var17 = var102;
                     }

                     var17 = var17.trim();
                  }

                  if (var8 == null) {
                     String var112 = (String)(Registry.emptyArgs());
                     long var47 = 505915899939017355L;
                     Object[] var46 = var112;
                     var112 = Ref.h(505915899939017355L, var46, var47);

                     try {
                        var112 = (String)var112;
                     } catch (InvocationTargetException var68) {
                        throw var68.getTargetException();
                     }

                     if (var15.equals(var112)) {
                        break label252;
                     }

                     new StringBuilder();
                     String var10010 = (String)(Registry.emptyArgs());
                     long var49 = 505915899939017355L;
                     Object[] var48 = var10010;
                     var10010 = Ref.h(505915899939017355L, var48, var49);

                     try {
                        var10010 = (String)var10010;
                     } catch (InvocationTargetException var67) {
                        throw var67.getTargetException();
                     }

                     var15.append((String)var10010).append("┋").append((String)var17).toString();
                  }

                  var17 = var17;
                  if (var8 == null) {
                     break label252;
                  }
               }

               var88 = var14;
               var10007 = 5;
            }

            label211:
            if (var88 == var10007 && (var8 != null || var16 != null)) {
               Object[] var92 = Registry.emptyArgs();
               long var51 = 577747074549625554L;
               Object[] var50 = var92;
               Object var93 = Ref.h(577747074549625554L, var50, var51);

               try {
                  var94 = (String)var93;
               } catch (InvocationTargetException var66) {
                  throw var66.getTargetException();
               }

               if (var8 == null) {
                  if (var94 == null) {
      U82 var94;
      U82 var94;
                     break label211;
                  }

                  var94 = var16;
                  Object[] var105 = Registry.emptyArgs();
                  long var53 = 577747074549625554L;
                  Object[] var52 = var105;
                  Ref.h(577747074549625554L, var52, var53);

                  try {
                     ;
                  } catch (InvocationTargetException var65) {
                     throw var65.getTargetException();
                  }
               }

               var17 = var94;
            }
         }

         var8.setText((String)var17);
      }

      Object var54 = 200208962451721363L;
      this.setBorder((Border)Ref.g(200208962451721363L, var54));
      Object[] var106 = Registry.packArgs(var15);
      long var57 = 160445587339969154L;
      Object[] var56 = var106;
      Ref.h(160445587339969154L, var56, var57);

      try {
         ;
      } catch (InvocationTargetException var64) {
         throw var64.getTargetException();
      }

      label198: {
         label197: {
            int var82 = var5 % 2;
            if (var8 == null) {
               if (var82 != 0) {
                  break label197;
               }

               Object var58 = 509096267464603114L;
               this.setBackground((Color)Ref.g(509096267464603114L, var58));
            }

            if (var8 == null) {
               break label198;
            }
         }

         Object var60 = 342557005981513554L;
         this.setBackground((Color)Ref.g(342557005981513554L, var60));
      }

      if (var8 == null) {
         Object var62 = 477270666069945140L;
         this.setForeground((Color)Ref.g(477270666069945140L, var62));
         if (var2 == null) {
            var8.setText("");
            var8.setBackground(new Color(a(31857, 8904999680057125567L), a(2895, 3760025786835852672L), a(22521, 4040131510210101557L)));
         }
      }

      return var8;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22218;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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
}






