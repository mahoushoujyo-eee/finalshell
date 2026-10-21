package com.finalshell.ui.model;

import com.finalshell.core.KV;
import com.finalshell.core.Kw4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CE;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class Cd4 extends AbstractTableModel {
   public ArrayList O;
   public static String g;
   public static String Y;
   public static String V;
   public static String d;
   public static String q;
   public static String z;
   public static String a;
   public static String P;
   public static String N;
   public static String C;
   public static String j;
   public static String f;
   public static String I;
   public static String m;
   public static String G;
   public String[] o;
   public boolean v;
   public static long[] b;
   public static Integer[] c;

   public Cd4(boolean var1) {
      ArrayList var10001 = new ArrayList();
      long var3 = 538268784702510566L;
      ArrayList var2 = var10001;
      Ref.s(538268784702510566L, var2, var3);
      Registry.lookupField(336436515373623739L).setBoolean(this, false);
      String[] var10002 = new String[a(9522, 7778887644426868874L)];
      var10002[0] = (String)Registry.lookupField(376768915438230383L).get(null);
      var10002[1] = (String)Registry.lookupField(389386238796712282L).get(null);
      var10002[2] = (String)Registry.lookupField(563850745499369434L).get(null);
      var10002[3] = (String)Registry.lookupField(162665871395615226L).get(null);
      var10002[4] = (String)Registry.lookupField(194216151110375024L).get(null);
      var10002[5] = (String)Registry.lookupField(227453697139208661L).get(null);
      var10002[a(10230, 4749739209174260301L)] = (String)Registry.lookupField(516763931638659925L).get(null);
      var10002[a(3772, 1660604052449768198L)] = (String)Registry.lookupField(459875455081736142L).get(null);
      long var5 = 292315662814622593L;
      String[] var4 = var10002;
      Ref.s(292315662814622593L, var4, var5);
   }

   public String r(int var1) {
      Object var2 = 292315662814622593L;
      return ((String[])Ref.g(292315662814622593L, var2))[var1];
   }

   @Override
   public int getRowCount() {
      Object var1 = 538268784702510566L;
      return ((ArrayList)Ref.g(538268784702510566L, var1)).size();
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 292315662814622593L;
      return ((String[])Ref.g(292315662814622593L, var2))[var1];
   }

   @Override
   public int getColumnCount() {
      Object var1 = 292315662814622593L;
      return ((String[])Ref.g(292315662814622593L, var1)).length;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      Object var3 = 538268784702510566L;
      return ((ArrayList)Ref.g(538268784702510566L, var3)).get(var1);
   }

   public void Y(ArrayList var1, KV var2) {
      long var4 = 538268784702510566L;
      Ref.s(538268784702510566L, var1, var4);
      this.fireTableDataChanged();
   }

   public int X(String var1) {
      Object var3 = -1;
      CE.S$arrint();
      Object var6 = 538268784702510566L;
      Iterator var4 = ((ArrayList)Ref.g(538268784702510566L, var6)).iterator();
      Cd4 var2 = this;

      Object var10001;
      while (true) {
         if (var4.hasNext()) {
            Kw4 var5 = (Kw4)var4.next();
            var3++;
            var10001 = var5;
            String var10002 = Registry.emptyArgs();
            long var9 = 539126826743258386L;
            Object var8 = var10002;
            var10002 = Ref.h(539126826743258386L, var8, var9);

            try {
               var10002 = (String)var10002;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            boolean var13 = var10002.equals(var1);
            if (var2 == null) {
               break;
            }

            if ((!var13 || var2 == null) && var2 != null) {
               continue;
            }
         }

         var10001 = var3;
         break;
      }

      return (int)var10001;
   }

   public ArrayList T() {
      Object var1 = 538268784702510566L;
      return (ArrayList)Ref.g(538268784702510566L, var1);
   }

   public void l(ArrayList var1) {
      long var3 = 538268784702510566L;
      Ref.s(538268784702510566L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15802;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
      String[] var8 = new String[15];
      int var12 = 0;
      String var11 = "巛佒監彰\u0002竑叭\u0002佳罠\u0002吳秾\u0002甖戹\u0003迠掫敽\u0003东匋(\u0004盯吢Du\u0002丵轳\u0003w^敽\u0002冻孖\u0002吳秾\u0003nGI";
      int var13 = "巛佒監彰\u0002竑叭\u0002佳罠\u0002吳秾\u0002甖戹\u0003迠掫敽\u0003东匋(\u0004盯吢Du\u0002丵轳\u0003w^敽\u0002冻孖\u0002吳秾\u0003nGI".length();
      char var10 = 4;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 111;
         String var10001 = var11.substring(++var16, var16 + var10);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 81;
                        break;
                     case 1:
                        var58 = 97;
                        break;
                     case 2:
                        var58 = 98;
                        break;
                     case 3:
                        var58 = 74;
                        break;
                     case 4:
                        var58 = 79;
                        break;
                     case 5:
                        var58 = 52;
                        break;
                     default:
                        var58 = 35;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var8[var12++] = var39;
                  if ((var16 += var10) >= var13) {
                     long var0 = 8905424418495413818L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "<Yêó<U\u008d;P\u0007Ö\u0093\u001c\u0011¤q\u0082ê\u0018åw?&¸";
                     int var5 = "<Yêó<U\u008d;P\u0007Ö\u0093\u001c\u0011¤q\u0082ê\u0018åw?&¸".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     b = var6;
                     c = new Integer[3];
                     Registry.lookupField(376768915438230383L).set(null, var8[12]);
                     Registry.lookupField(271206799597083328L).set(null, var8[4]);
                     Registry.lookupField(616015167190581572L).set(null, var8[10]);
                     Registry.lookupField(571280741052884622L).set(null, var8[13]);
                     Registry.lookupField(590195951908173681L).set(null, var8[11]);
                     Registry.lookupField(205001955563085020L).set(null, var8[2]);
                     Registry.lookupField(485656453606473185L).set(null, var8[0]);
                     Registry.lookupField(389386238796712282L).set(null, var8[3]);
                     Registry.lookupField(563850745499369434L).set(null, var8[7]);
                     Registry.lookupField(162665871395615226L).set(null, var8[1]);
                     Registry.lookupField(227453697139208661L).set(null, var8[5]);
                     Registry.lookupField(194216151110375024L).set(null, var8[9]);
                     Registry.lookupField(516763931638659925L).set(null, var8[14]);
                     Registry.lookupField(459875455081736142L).set(null, var8[8]);
                     Registry.lookupField(481813580217396659L).set(null, var8[6]);
                     return;
                  }

                  var10 = var11.charAt(var16);
                  break;
               default:
                  var8[var12++] = var39;
                  if ((var16 += var10) < var13) {
                     var10 = var11.charAt(var16);
                     continue label61;
                  }

                  var11 = "aBD\u0002丨伲";
                  var13 = "aBD\u0002丨伲".length();
                  var10 = 3;
                  var16 = -1;
            }

            var10000 = 115;
            var10001 = var11.substring(++var16, var16 + var10);
            var10002 = 0;
         }
      }
   }
}





