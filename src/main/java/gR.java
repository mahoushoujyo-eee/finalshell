import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class gR extends AbstractTableModel {
   ArrayList B;
   public static String u;
   public static String Y;
   public static String s;
   public static String Z;
   public static String R;
   String[] I;
   boolean l;

   public gR() {
      com.c.c(618604921779391734L).set(this, new ArrayList());
      com.c.c(395238353787879389L).setBoolean(this, false);
      com.c.c(572100813358317248L)
         .set(
            this,
            new String[]{
               (String)com.c.c(298277648062066018L).get(null),
               (String)com.c.c(537427811193673915L).get(null),
               (String)com.c.c(217711252181986658L).get(null),
               (String)com.c.c(635079983588403018L).get(null),
               (String)com.c.c(156537853841081209L).get(null)
            }
         );
   }

   public String V(int var1) {
      return ((String[])com.c.c(572100813358317248L).get(this))[var1];
   }

   @Override
   public int getRowCount() {
      return ((ArrayList)com.c.c(618604921779391734L).get(this)).size();
   }

   @Override
   public String getColumnName(int var1) {
      return ((String[])com.c.c(572100813358317248L).get(this))[var1];
   }

   @Override
   public int getColumnCount() {
      return ((String[])com.c.c(572100813358317248L).get(this)).length;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      return ((ArrayList)com.c.c(618604921779391734L).get(this)).get(var1);
   }

   public void G(ArrayList var1, KV var2) {
      com.c.c(618604921779391734L).set(this, var1);
      this.fireTableDataChanged();
   }

   public int W(int var1) {
      String[] var10000 = y6_2.Z();
      int var3 = -1;
      String[] var2 = var10000;
      Iterator var4 = ((ArrayList)com.c.c(618604921779391734L).get(this)).iterator();

      while (true) {
         if (var4.hasNext()) {
            yA_3 var5 = (yA_3)var4.next();
            var3++;
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(579395555078289712L);
            Object[] var10002 = var10001;
            yA_3 var9 = var5;
            Method var7 = var10003;

            try {
               var8 = (Integer)var7.invoke(var9, var10002);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            if (var2 == null) {
               break;
            }

            if ((var8 != var1 || var2 == null) && var2 != null) {
               continue;
            }
         }

         var8 = var3;
         break;
      }

      return var8;
   }

   public int h(String var1) {
      int var3 = -1;
      String var10000 = y6_2.Z();
      Iterator var4 = ((ArrayList)com.c.c(618604921779391734L).get(this)).iterator();
      String[] var2 = var10000;

      while (true) {
         if (var4.hasNext()) {
            yA_3 var5 = (yA_3)var4.next();
            var3++;
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(271743078317072247L);
            Object[] var10002 = var10001;
            yA_3 var10 = var5;
            Method var7 = var10003;

            try {
               var10000 = (String)var7.invoke(var10, var10002);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            var9 = var10000.equals(var1);
            if (var2 == null) {
               break;
            }

            if ((var9 == 0 || var2 == null) && var2 != null) {
               continue;
            }
         }

         var9 = var3;
         break;
      }

      return var9;
   }

   public ArrayList F() {
      return (ArrayList)com.c.c(618604921779391734L).get(this);
   }

   public void P(ArrayList var1) {
      com.c.c(618604921779391734L).set(this, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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
                     com.c.c(298277648062066018L).set(null, var0[0]);
                     com.c.c(537427811193673915L).set(null, var0[4]);
                     com.c.c(217711252181986658L).set(null, var0[1]);
                     com.c.c(635079983588403018L).set(null, var0[2]);
                     com.c.c(156537853841081209L).set(null, var0[3]);
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





