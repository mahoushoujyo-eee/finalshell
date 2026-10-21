package com.finalshell.ui.model;

import com.finalshell.core.YE;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.TunnelList;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class C12 extends AbstractTableModel {
   public ArrayList g;
   public static String e;
   public static String q;
   public static String Y;
   public static String z;
   public static String V;
   public String[] t;
   public int p;

   public C12() {
      ArrayList var10001 = new ArrayList();
      long var2 = 442452556130526915L;
      ArrayList var1 = var10001;
      Ref.s(442452556130526915L, var1, var2);
      String[] var10002 = new String[]{
         (String)Registry.lookupField(366216043206699518L).get(null),
         (String)Registry.lookupField(128130896235311640L).get(null),
         (String)Registry.lookupField(543147012786001203L).get(null),
         (String)Registry.lookupField(193744161480500945L).get(null),
         (String)Registry.lookupField(610514493662875507L).get(null)
      };
      long var4 = 216945295638433785L;
      String[] var3 = var10002;
      Ref.s(216945295638433785L, var3, var4);
   }

   public String t(int var1) {
      Object var2 = 216945295638433785L;
      return ((String[])Ref.g(216945295638433785L, var2))[var1];
   }

   public int c(int var1) {
      Object var3 = -1;
      String var10000 = TunnelList.V();
      Object var4 = false;
      String var2 = var10000;
      Object var7 = 442452556130526915L;
      Iterator var5 = ((ArrayList)Ref.g(442452556130526915L, var7)).iterator();

      Object var10001;
      while (true) {
         label33:
         if (var5.hasNext()) {
            YE var6 = (YE)var5.next();
            if (var2 != null) {
               var10001 = var6;
               Object[] var10002 = Registry.emptyArgs();
               long var10 = 347860782649835626L;
               Object[] var9 = var10002;
               var10002 = Ref.h(347860782649835626L, var9, var10);

               try {
                  var13 = (Integer)var10002;
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }

               if (var2 == null) {
                  break;
               }

               if (var13 == var1) {
                  var3 = var4;
                  if (var2 != null) {
                     break label33;
                  }
               }

               var4++;
            }

            if (var2 != null) {
               continue;
            }
         }

         var10001 = var3;
         break;
      }

      return (int)var10001;
   }

   public void D(ArrayList var1) {
      long var3 = 442452556130526915L;
      Ref.s(442452556130526915L, var1, var3);
      this.fireTableDataChanged();
   }

   public YE s(int var1) {
      Object var2 = 442452556130526915L;
      return (YE)((ArrayList)Ref.g(442452556130526915L, var2)).get(var1);
   }

   @Override
   public int getRowCount() {
      Object var1 = 442452556130526915L;
      return ((ArrayList)Ref.g(442452556130526915L, var1)).size();
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 216945295638433785L;
      return ((String[])Ref.g(216945295638433785L, var2))[var1];
   }

   @Override
   public int getColumnCount() {
      Object var1 = 216945295638433785L;
      return ((String[])Ref.g(216945295638433785L, var1)).length;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      Object var3 = 442452556130526915L;
      return ((ArrayList)Ref.g(442452556130526915L, var3)).get(var1);
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      return false;
   }

   public int x() {
      return Registry.lookupField(573281329340239107L).getInt(this);
   }

   public void b(int var1) {
      Registry.lookupField(573281329340239107L).setInt(this, var1);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[5];
      int var4 = 0;
      String var3 = "的栂窹厣\u0002簑垎\u0004皻吩窹厣";
      int var5 = "的栂窹厣\u0002簑垎\u0004皻吩窹厣".length();
      char var2 = 4;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 118;
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
                        var46 = 28;
                        break;
                     case 1:
                        var46 = 115;
                        break;
                     case 2:
                        var46 = 32;
                        break;
                     case 3:
                        var46 = 54;
                        break;
                     case 4:
                        var46 = 22;
                        break;
                     case 5:
                        var46 = 23;
                        break;
                     default:
                        var46 = 42;
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
                     Registry.lookupField(366216043206699518L).set(null, var0[3]);
                     Registry.lookupField(128130896235311640L).set(null, var0[1]);
                     Registry.lookupField(543147012786001203L).set(null, var0[2]);
                     Registry.lookupField(193744161480500945L).set(null, var0[4]);
                     Registry.lookupField(610514493662875507L).set(null, var0[0]);
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

                  var3 = "吠禲\u0004盃桅圡均";
                  var5 = "吠禲\u0004盃桅圡均".length();
                  var2 = 2;
                  var8 = -1;
            }

            var10000 = 49;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}





