package com.finalshell.ui.model;

import com.finalshell.core.KV;
import com.finalshell.core.Y62_2;
import com.finalshell.core.YA3_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class GR extends AbstractTableModel {
   public ArrayList B;
   public static String u;
   public static String Y;
   public static String s;
   public static String Z;
   public static String R;
   public String[] I;
   public boolean l;

   public GR() {
      ArrayList var10001 = new ArrayList();
      long var2 = 618604921779391734L;
      ArrayList var1 = var10001;
      Ref.s(618604921779391734L, var1, var2);
      Registry.lookupField(395238353787879389L).setBoolean(this, false);
      String[] var10002 = new String[]{
         (String)Registry.lookupField(298277648062066018L).get(null),
         (String)Registry.lookupField(537427811193673915L).get(null),
         (String)Registry.lookupField(217711252181986658L).get(null),
         (String)Registry.lookupField(635079983588403018L).get(null),
         (String)Registry.lookupField(156537853841081209L).get(null)
      };
      long var4 = 572100813358317248L;
      String[] var3 = var10002;
      Ref.s(572100813358317248L, var3, var4);
   }

   public String V(int var1) {
      Object var2 = 572100813358317248L;
      return ((String[])Ref.g(572100813358317248L, var2))[var1];
   }

   @Override
   public int getRowCount() {
      Object var1 = 618604921779391734L;
      return ((ArrayList)Ref.g(618604921779391734L, var1)).size();
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 572100813358317248L;
      return ((String[])Ref.g(572100813358317248L, var2))[var1];
   }

   @Override
   public int getColumnCount() {
      Object var1 = 572100813358317248L;
      return ((String[])Ref.g(572100813358317248L, var1)).length;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      Object var3 = 618604921779391734L;
      return ((ArrayList)Ref.g(618604921779391734L, var3)).get(var1);
   }

   public void G(ArrayList var1, KV var2) {
      long var4 = 618604921779391734L;
      Ref.s(618604921779391734L, var1, var4);
      this.fireTableDataChanged();
   }

   public int W(int var1) {
      String[] var10000 = Y62_2.Z();
      Object var3 = -1;
      String[] var2 = var10000;
      Object var6 = 618604921779391734L;
      Iterator var4 = ((ArrayList)Ref.g(618604921779391734L, var6)).iterator();

      Object var10001;
      while (true) {
         if (var4.hasNext()) {
            YA3_2 var5 = (YA3_2)var4.next();
            var3++;
            var10001 = var5;
            Object[] var10002 = Registry.emptyArgs();
            long var9 = 579395555078289712L;
            Object[] var8 = var10002;
            var10002 = Ref.h(579395555078289712L, var8, var9);

            try {
               var12 = (Integer)var10002;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            if (var2 == null) {
               break;
            }

            if ((var12 != var1 || var2 == null) && var2 != null) {
               continue;
            }
         }

         var10001 = var3;
         break;
      }

      return (int)var10001;
   }

   public int h(String var1) {
      Object var3 = -1;
      Y62_2.Z();
      Object var6 = 618604921779391734L;
      Iterator var4 = ((ArrayList)Ref.g(618604921779391734L, var6)).iterator();
      GR var2 = this;

      Object var10001;
      while (true) {
         if (var4.hasNext()) {
            YA3_2 var5 = (YA3_2)var4.next();
            var3++;
            var10001 = var5;
            String var10002 = Registry.emptyArgs();
            long var9 = 271743078317072247L;
            Object[] var8 = var10002;
            var10002 = Ref.h(271743078317072247L, var8, var9);

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

   public ArrayList F() {
      Object var1 = 618604921779391734L;
      return (ArrayList)Ref.g(618604921779391734L, var1);
   }

   public void P(ArrayList var1) {
      long var3 = 618604921779391734L;
      Ref.s(618604921779391734L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var0 = new String[5];
      int var4 = 0;
      String var3 = "佮罟\u0002竌叒\u0002丩休";
      int var5 = "佮罟\u0002竌叒\u0002丩休".length();
      char var2 = 2;
      int var8 = -1;

      label53:
      while (true) {
         byte var10000 = 83;
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
                        var46 = 112;
                        break;
                     case 1:
                        var46 = 98;
                        break;
                     case 2:
                        var46 = 42;
                        break;
                     case 3:
                        var46 = 44;
                        break;
                     case 4:
                        var46 = 30;
                        break;
                     case 5:
                        var46 = 60;
                        break;
                     default:
                        var46 = 28;
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
                     Registry.lookupField(298277648062066018L).set(null, var0[0]);
                     Registry.lookupField(537427811193673915L).set(null, var0[4]);
                     Registry.lookupField(217711252181986658L).set(null, var0[1]);
                     Registry.lookupField(635079983588403018L).set(null, var0[2]);
                     Registry.lookupField(156537853841081209L).set(null, var0[3]);
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

                  var3 = "丕轱\u0002W\\";
                  var5 = "丕轱\u0002W\\".length();
                  var2 = 2;
                  var8 = -1;
            }

            var10000 = 110;
            var10001 = var3.substring(++var8, var8 + var2);
            var10002 = 0;
         }
      }
   }
}





