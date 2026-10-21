package com.finalshell.ui.model;

import com.finalshell.core.KV;
import com.finalshell.core.LI3_2;
import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class Gk2 extends AbstractTableModel {
   public ArrayList y;
   public static String t;
   public static String i;
   public static String s;
   public static String P;
   public static String j;
   public static String S;
   public static String T;
   public static String a;
   public static String h;
   public static String B;
   public static String K;
   public static String O;
   public static String W;
   public String[] l;
   public boolean g;
   public static long[] b;
   public static Integer[] c;

   public Gk2(boolean var1) {
   super();
      boolean var10000 = Uo2.i();
      boolean var2 = var10000;
      ArrayList var10001 = new ArrayList();
      long var4 = 495825152703202012L;
      ArrayList var3 = var10001;
      Ref.s(495825152703202012L, var3, var4);
      Registry.lookupField(370248853974917727L).setBoolean(this, false);
      int var10002 = (var1) ? 1 : 0;
      if (!var2) {
         Registry.lookupField(370248853974917727L).setBoolean(this, (boolean)var1);
         if (var1 == 0) {
            String[] var9 = new String[a(9105, 778820718585847637L)];
            var9[0] = (String)Registry.lookupField(261433743018117933L).get(null);
            var9[1] = (String)Registry.lookupField(572421534966713491L).get(null);
            var9[2] = (String)Registry.lookupField(223954321575685381L).get(null);
            var9[3] = (String)Registry.lookupField(304424680129435401L).get(null);
            var9[4] = (String)Registry.lookupField(246644705461640101L).get(null);
            var9[5] = (String)Registry.lookupField(264695503300239111L).get(null);
            long var6 = 218289569364908950L;
            String[] var5 = var9;
            Ref.s(218289569364908950L, var5, var6);
            if (!var2) {
               return;
            }
         }

         var10002 = a(14879, 4719541130005481178L);
      }

      String[] var10 = new String[var10002];
      var10[0] = (String)Registry.lookupField(261433743018117933L).get(null);
      var10[1] = (String)Registry.lookupField(246644705461640101L).get(null);
      var10[2] = (String)Registry.lookupField(253541125149287034L).get(null);
      var10[3] = (String)Registry.lookupField(211747787588645926L).get(null);
      var10[4] = (String)Registry.lookupField(168877409279276019L).get(null);
      var10[5] = (String)Registry.lookupField(367581586053885393L).get(null);
      long var8 = 218289569364908950L;
      String[] var7 = var10;
      Ref.s(218289569364908950L, var7, var8);
   }

   public String e(int var1) {
      Object var2 = 218289569364908950L;
      return ((String[])Ref.g(218289569364908950L, var2))[var1];
   }

   @Override
   public int getRowCount() {
      Object var1 = 495825152703202012L;
      return ((ArrayList)Ref.g(495825152703202012L, var1)).size();
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 218289569364908950L;
      return ((String[])Ref.g(218289569364908950L, var2))[var1];
   }

   @Override
   public int getColumnCount() {
      Object var1 = 218289569364908950L;
      return ((String[])Ref.g(218289569364908950L, var1)).length;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      Object var3 = 495825152703202012L;
      return ((ArrayList)Ref.g(495825152703202012L, var3)).get(var1);
   }

   public void r(ArrayList var1, KV var2) {
      label19: {
         boolean var3 = Uo2.k();
         if (!var3 || Registry.lookupField(370248853974917727L).getBoolean(this)) {
            long var6 = 495825152703202012L;
            Ref.s(495825152703202012L, var1, var6);
            if (var3) {
               break label19;
            }
         }

         new ArrayList();
         long var8 = 495825152703202012L;
         Ref.s(495825152703202012L, var1, var8);
      }

      this.fireTableDataChanged();
   }

   public int y(int var1) {
      int var3 = -1;
      Uo2.k();
      Object var6 = 495825152703202012L;
      Iterator var4 = ((ArrayList)Ref.g(495825152703202012L, var6)).iterator();
      Gk2 var2 = this;

      while (var4.hasNext()) {
         LI3_2 var5 = (LI3_2)var4.next();
         var3++;
         if (var2 == null && var5 == null) {
            return var3;
         }

         Object[] var10002 = Registry.emptyArgs();
         long var9 = 419335026051024288L;
         Object[] var8 = var10002;
         var10002 = Ref.h(419335026051024288L, var8, var9);

         try {
            var12 = (Integer)var10002;
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         if (var12 == var1 && var2 == null || var2 == false) {
            break;
         }
      }

      return var3;
   }

   public void H(LI3_2 var1) {
      Object[] var10002 = Registry.emptyArgs();
      long var3 = 220896290980473708L;
      Object[] var2 = var10002;
      var10002 = Ref.h(220896290980473708L, var2, var3);

      try {
         var9 = (Integer)var10002;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Object[] var10004 = Registry.emptyArgs();
      long var5 = 220896290980473708L;
      Object[] var4 = var10004;
      var10004 = Ref.h(220896290980473708L, var4, var5);

      try {
         var11 = (Integer)var10004;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var9.fireTableRowsUpdated((int)var1, var11);
   }

   public ArrayList O() {
      Object var1 = 495825152703202012L;
      return (ArrayList)Ref.g(495825152703202012L, var1);
   }

   public void b(ArrayList var1) {
      long var3 = 495825152703202012L;
      Ref.s(495825152703202012L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15556;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var8 = new String[13];
      int var12 = 0;
      String var11 = "呣禯╙呒云蠋\u0003'\u000f攢\u0003>\u0016\u0016\u0004嶋伃皼彺\u0002呣禯\u0003辰揺攢\u0002乥輢\u0002畆扨\u0002凫嬇\u0003乌博w\u0002乤使";
      int var13 = "呣禯╙呒云蠋\u0003'\u000f攢\u0003>\u0016\u0016\u0004嶋伃皼彺\u0002呣禯\u0003辰揺攢\u0002乥輢\u0002畆扨\u0002凫嬇\u0003乌博w\u0002乤使".length();
      char var10 = 6;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 67;
         String var10001 = var11.substring(++var16, var16 + var10);
         byte var10002 = -1;

         while (true) {
      char[] var30;
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
                        var58 = 45;
                        break;
                     case 1:
                        var58 = 28;
                        break;
                     case 2:
                        var58 = 17;
                        break;
                     case 3:
                        var58 = 108;
                        break;
                     case 4:
                        var58 = 54;
                        break;
                     case 5:
                        var58 = 4;
                        break;
                     default:
                        var58 = 36;
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
                     long var0 = 5145722619523642703L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "S\u0017\u0094ñ¢`*\u001c\u0095\u0085\u009cé\u009d´³\u0093";
                     int var5 = "S\u0017\u0094ñ¢`*\u001c\u0095\u0085\u009cé\u009d´³\u0093".length();
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
                     c = new Integer[2];
                     Registry.lookupField(261433743018117933L).set(null, var8[2]);
                     Registry.lookupField(572421534966713491L).set(null, var8[7]);
                     Registry.lookupField(223954321575685381L).set(null, var8[8]);
                     Registry.lookupField(304424680129435401L).set(null, var8[12]);
                     Registry.lookupField(226109021265139345L).set(null, var8[4]);
                     Registry.lookupField(264695503300239111L).set(null, var8[11]);
                     Registry.lookupField(418200044130110363L).set(null, var8[3]);
                     Registry.lookupField(246644705461640101L).set(null, var8[0]);
                     Registry.lookupField(211747787588645926L).set(null, var8[5]);
                     Registry.lookupField(253541125149287034L).set(null, var8[1]);
                     Registry.lookupField(168877409279276019L).set(null, var8[10]);
                     Registry.lookupField(367581586053885393L).set(null, var8[6]);
                     Registry.lookupField(301117681106878525L).set(null, var8[9]);
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

                  var11 = "伵缧\u0003;\u0019\u0011";
                  var13 = "伵缧\u0003;\u0019\u0011".length();
                  var10 = 2;
                  var16 = -1;
            }

            var10000 = 85;
            var10001 = var11.substring(++var16, var16 + var10);
            var10002 = 0;
         }
      }
   }
}





