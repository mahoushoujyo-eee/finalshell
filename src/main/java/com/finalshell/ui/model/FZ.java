package com.finalshell.ui.model;

import com.finalshell.core.Cn4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FZ extends AbstractTableModel {
   ArrayList W;
   public static String h;
   public static String e;
   public static String T;
   public static String f;
   public static String n;
   public static String a;
   public static String v;
   String[] c;

   public FZ() {
      ArrayList var10001 = new ArrayList();
      long var2 = 237144780372120098L;
      ArrayList var1 = var10001;
      Ref.s(237144780372120098L, var1, var2);
      String[] var10002 = new String[]{
         (String)Registry.lookupField(177629519952511192L).get(null),
         (String)Registry.lookupField(474571876908350800L).get(null),
         (String)Registry.lookupField(559539778834483789L).get(null),
         (String)Registry.lookupField(151628481709564751L).get(null),
         (String)Registry.lookupField(148020468297314945L).get(null)
      };
      long var4 = 627058192739429618L;
      String[] var3 = var10002;
      Ref.s(627058192739429618L, var3, var4);
   }

   @Override
   public int getRowCount() {
      Object var1 = 237144780372120098L;
      return ((ArrayList)Ref.g(237144780372120098L, var1)).size();
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 627058192739429618L;
      return ((String[])Ref.g(627058192739429618L, var2))[var1];
   }

   @Override
   public int getColumnCount() {
      Object var1 = 627058192739429618L;
      return ((String[])Ref.g(627058192739429618L, var1)).length;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      Object var3 = 237144780372120098L;
      return ((ArrayList)Ref.g(237144780372120098L, var3)).get(var1);
   }

   public void X(ArrayList var1) {
      long var3 = 237144780372120098L;
      Ref.s(237144780372120098L, var1, var3);
      this.fireTableDataChanged();
   }

   public void a(Cn4 var1) {
      Object[] var10002 = Registry.emptyArgs();
      long var3 = 406073307634140563L;
      Object[] var2 = var10002;
      var10002 = Ref.h(406073307634140563L, var2, var3);

      try {
         var9 = (Integer)var10002;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Object[] var10004 = Registry.emptyArgs();
      long var5 = 406073307634140563L;
      Object[] var4 = var10004;
      var10004 = Ref.h(406073307634140563L, var4, var5);

      try {
         var11 = (Integer)var10004;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var9.fireTableRowsUpdated((int)var1, var11);
   }

   public ArrayList a() {
      Object var1 = 237144780372120098L;
      return (ArrayList)Ref.g(237144780372120098L, var1);
   }

   public void s(ArrayList var1) {
      long var3 = 237144780372120098L;
      Ref.s(237144780372120098L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[6];
      int var4 = 0;
      String var3 = "伅罉\u0004庾迸\u007fX\u0002厙逦\u0003乪匢7";
      int var5 = "伅罉\u0004庾迸\u007fX\u0002厙逦\u0003乪匢7".length();
      char var2 = 2;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 35;
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
                        var46 = 107;
                        break;
                     case 1:
                        var46 = 4;
                        break;
                     case 2:
                        var46 = 49;
                        break;
                     case 3:
                        var46 = 8;
                        break;
                     case 4:
                        var46 = 94;
                        break;
                     case 5:
                        var46 = 101;
                        break;
                     default:
                        var46 = 20;
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
                     Registry.lookupField(177629519952511192L).set(null, "");
                     Registry.lookupField(474571876908350800L).set(null, var0[5]);
                     Registry.lookupField(206646878282070142L).set(null, var0[4]);
                     Registry.lookupField(559539778834483789L).set(null, var0[1]);
                     Registry.lookupField(148020468297314945L).set(null, var0[0]);
                     Registry.lookupField(566410793287284886L).set(null, var0[2]);
                     Registry.lookupField(151628481709564751L).set(null, var0[3]);
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

                  var3 = "乵望吙\u0002\u0007q";
                  var5 = "乵望吙\u0002\u0007q".length();
                  var2 = 3;
                  var8 = -1;
            }

            var10000 = 37;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}





