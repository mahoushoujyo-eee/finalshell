package com.finalshell.ui.model;

import com.finalshell.core.LI3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.KA_3;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class K42 extends AbstractTableModel {
   ArrayList g;
   public static String a;
   public static String y;
   public static String G;
   public static String S;
   public static String V;
   public static String m;
   public static String C;
   public static String u;
   public static String U;
   public static String K;
   public static String D;
   public static String v;
   public static String t;
   String[] A;
   boolean Q;

   public K42() {
      ArrayList var10001 = new ArrayList();
      long var2 = 229616287374109703L;
      ArrayList var1 = var10001;
      Ref.s(229616287374109703L, var1, var2);
      Registry.lookupField(183151460775828624L).setBoolean(this, false);
      String[] var10002 = new String[]{
         (String)Registry.lookupField(428100579157452636L).get(null),
         (String)Registry.lookupField(417739495573913824L).get(null),
         (String)Registry.lookupField(210005327316870039L).get(null)
      };
      long var4 = 180259603634381437L;
      String[] var3 = var10002;
      Ref.s(180259603634381437L, var3, var4);
   }

   public String c(int var1) {
      Object var2 = 180259603634381437L;
      return ((String[])Ref.g(180259603634381437L, var2))[var1];
   }

   @Override
   public int getRowCount() {
      Object var1 = 229616287374109703L;
      return ((ArrayList)Ref.g(229616287374109703L, var1)).size();
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 180259603634381437L;
      return ((String[])Ref.g(180259603634381437L, var2))[var1];
   }

   @Override
   public int getColumnCount() {
      Object var1 = 180259603634381437L;
      return ((String[])Ref.g(180259603634381437L, var1)).length;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      Object var3 = 229616287374109703L;
      return ((ArrayList)Ref.g(229616287374109703L, var3)).get(var1);
   }

   public void r(ArrayList var1) {
      long var3 = 229616287374109703L;
      Ref.s(229616287374109703L, var1, var3);
      this.fireTableDataChanged();
   }

   public int G(int var1) {
      Object var3 = -1;
      KA_3.y$arrky_4();
      Object var6 = 229616287374109703L;
      Iterator var4 = ((ArrayList)Ref.g(229616287374109703L, var6)).iterator();
      K42 var2 = this;

      Object var10001;
      while (true) {
         if (var4.hasNext()) {
            LI3_2 var5 = (LI3_2)var4.next();
            var3++;
            var10001 = var5;
            Object[] var10002 = Registry.emptyArgs();
            long var9 = 419335026051024288L;
            Object[] var8 = var10002;
            var10002 = Ref.h(419335026051024288L, var8, var9);

            try {
               var12 = (Integer)var10002;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            if (var2 != null) {
               break;
            }

            if ((var12 != var1 || var2 != null) && var2 == null) {
               continue;
            }
         }

         var10001 = var3;
         break;
      }

      return (int)var10001;
   }

   public void E(LI3_2 var1) {
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

   public ArrayList R() {
      Object var1 = 229616287374109703L;
      return (ArrayList)Ref.g(229616287374109703L, var1);
   }

   public void U(ArrayList var1) {
      long var3 = 229616287374109703L;
      Ref.s(229616287374109703L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[13];
      int var4 = 0;
      String var3 = "乔作\u0002凛嬤\u0002呓禌\u0003辀揙攛\u0002伓缒\u0003乼卹N\u0003\u000e5/\u0002當手\u0003\u0017,攛\u0002吣亘\u0004嶻传皅彃";
      int var5 = "乔作\u0002凛嬤\u0002呓禌\u0003辀揙攛\u0002伓缒\u0003乼卹N\u0003\u000e5/\u0002當手\u0003\u0017,攛\u0002吣亘\u0004嶻传皅彃".length();
      char var2 = 2;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 38;
         String var10001 = var3.substring(++var8, var8 + var2);
         byte var10002 = -1;

         while (true) {
      char[] var20;
            label48: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label48;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  char var45 = var36[var10006];
                  byte var46;
                  switch (var6 % 7) {
                     case 0:
                        var46 = 120;
                        break;
                     case 1:
                        var46 = 90;
                        break;
                     case 2:
                        var46 = 77;
                        break;
                     case 3:
                        var46 = 48;
                        break;
                     case 4:
                        var46 = 78;
                        break;
                     case 5:
                        var46 = 84;
                        break;
                     default:
                        var46 = 39;
                  }

                  var36[var10006] = (char)(var45 ^ var32 ^ var46);
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = var20;
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = var20;
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = new String(var20).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var29;
                  if ((var8 += var2) >= var5) {
                     Registry.lookupField(426839229826798789L).set(null, var0[6]);
                     Registry.lookupField(492436168240623214L).set(null, var0[7]);
                     Registry.lookupField(428100579157452636L).set(null, var0[1]);
                     Registry.lookupField(417739495573913824L).set(null, var0[11]);
                     Registry.lookupField(558290630425367717L).set(null, var0[2]);
                     Registry.lookupField(127488212079119806L).set(null, var0[4]);
                     Registry.lookupField(178933991816857047L).set(null, var0[10]);
                     Registry.lookupField(210005327316870039L).set(null, var0[9]);
                     Registry.lookupField(567706351585848586L).set(null, var0[3]);
                     Registry.lookupField(238006140346952391L).set(null, var0[8]);
                     Registry.lookupField(471838173654860829L).set(null, var0[0]);
                     Registry.lookupField(194827937826618728L).set(null, var0[12]);
                     Registry.lookupField(528247167215758333L).set(null, var0[5]);
                     return;
                  }

                  var2 = var3.charAt(var8);
                  break;
               default:
                  var0[var4++] = var29;
                  if ((var8 += var2) < var5) {
                     var2 = var3.charAt(var8);
                     continue label53;
                  }

                  var3 = "6\u0007\u0015\u0002乾輪";
                  var5 = "6\u0007\u0015\u0002乾輪".length();
                  var2 = 3;
                  var8 = -1;
            }

            var10000 = 13;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}





