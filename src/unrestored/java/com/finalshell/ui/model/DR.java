package com.finalshell.ui.model;

import com.finalshell.core.L9;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class DR extends AbstractTableModel {
   public ArrayList s;
   public static String Z;
   public static String M;
   public static String G;
   public static String a;
   public static String I;
   public static String i;
   public static String j;
   public String[] S;

   public DR() {
      ArrayList var10001 = new ArrayList();
      long var2 = 286121812450755265L;
      ArrayList var1 = var10001;
      Ref.s(286121812450755265L, var1, var2);
      String[] var10002 = new String[]{
         (String)Registry.lookupField(324671701924369091L).get(null),
         (String)Registry.lookupField(213824506265816643L).get(null),
         (String)Registry.lookupField(463918088517692289L).get(null),
         (String)Registry.lookupField(356579860926269105L).get(null),
         (String)Registry.lookupField(389899462668155235L).get(null)
      };
      long var4 = 579023612940794660L;
      String[] var3 = var10002;
      Ref.s(579023612940794660L, var3, var4);
   }

   @Override
   public int getRowCount() {
      Object var1 = 286121812450755265L;
      return ((ArrayList)Ref.g(286121812450755265L, var1)).size();
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 579023612940794660L;
      return ((String[])Ref.g(579023612940794660L, var2))[var1];
   }

   @Override
   public int getColumnCount() {
      Object var1 = 579023612940794660L;
      return ((String[])Ref.g(579023612940794660L, var1)).length;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      Object var3 = 286121812450755265L;
      return ((ArrayList)Ref.g(286121812450755265L, var3)).get(var1);
   }

   public void n(ArrayList var1) {
      long var3 = 286121812450755265L;
      Ref.s(286121812450755265L, var1, var3);
      this.fireTableDataChanged();
   }

   public void o(L9 var1) {
      Integer var11;
      Integer var9;
      Object var10002 = Registry.emptyArgs();
      long var3 = 127422501806576014L;
      Object var2 = var10002;
      var10002 = Ref.h(127422501806576014L, var2, var3);

      try {
         var9 = (Integer)var10002;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Object var10004 = Registry.emptyArgs();
      long var5 = 127422501806576014L;
      Object var4 = var10004;
      var10004 = Ref.h(127422501806576014L, var4, var5);

      try {
         var11 = (Integer)var10004;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var9.fireTableRowsUpdated((int)var1, var11);
   }

   public ArrayList N() {
      Object var1 = 286121812450755265L;
      return (ArrayList)Ref.g(286121812450755265L, var1);
   }

   public void r(ArrayList var1) {
      long var3 = 286121812450755265L;
      Ref.s(286121812450755265L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var20;
      String[] var0 = new String[6];
      int var4 = 0;
      String var3 = "你罸\u0004廛迉w4\u0002叼逗\u0002dF";
      int var5 = "你罸\u0004廛迉w4\u0002叼逗\u0002dF".length();
      char var2 = 2;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 112;
         String var10001 = var3.substring(++var8, var8 + var2);
         byte var10002 = -1;

         while (true) {
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
                        var46 = 93;
                        break;
                     case 1:
                        var46 = 102;
                        break;
                     case 2:
                        var46 = 106;
                        break;
                     case 3:
                        var46 = 55;
                        break;
                     case 4:
                        var46 = 16;
                        break;
                     case 5:
                        var46 = 27;
                        break;
                     default:
                        var46 = 24;
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
                     Registry.lookupField(324671701924369091L).set(null, "");
                     Registry.lookupField(213824506265816643L).set(null, var0[3]);
                     Registry.lookupField(413964890241237740L).set(null, var0[4]);
                     Registry.lookupField(463918088517692289L).set(null, var0[1]);
                     Registry.lookupField(389899462668155235L).set(null, var0[0]);
                     Registry.lookupField(427033825170248277L).set(null, var0[2]);
                     Registry.lookupField(356579860926269105L).set(null, var0[5]);
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

                  var3 = "乬杖呭\u0003乵卩E";
                  var5 = "乬杖呭\u0003乵卩E".length();
                  var2 = 3;
                  var8 = -1;
            }

            var10000 = 10;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}





