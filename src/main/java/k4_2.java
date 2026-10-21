import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class k4_2 extends AbstractTableModel {
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

   public k4_2() {
      com.c.c(229616287374109703L).set(this, new ArrayList());
      com.c.c(183151460775828624L).setBoolean(this, false);
      com.c.c(180259603634381437L)
         .set(
            this,
            new String[]{
               (String)com.c.c(428100579157452636L).get(null), (String)com.c.c(417739495573913824L).get(null), (String)com.c.c(210005327316870039L).get(null)
            }
         );
   }

   public String c(int var1) {
      return ((String[])com.c.c(180259603634381437L).get(this))[var1];
   }

   @Override
   public int getRowCount() {
      return ((ArrayList)com.c.c(229616287374109703L).get(this)).size();
   }

   @Override
   public String getColumnName(int var1) {
      return ((String[])com.c.c(180259603634381437L).get(this))[var1];
   }

   @Override
   public int getColumnCount() {
      return ((String[])com.c.c(180259603634381437L).get(this)).length;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      return ((ArrayList)com.c.c(229616287374109703L).get(this)).get(var1);
   }

   public void r(ArrayList var1) {
      com.c.c(229616287374109703L).set(this, var1);
      this.fireTableDataChanged();
   }

   public int G(int var1) {
      int var3 = -1;
      com.ky_4[] var10000 = kA_3.y();
      Iterator var4 = ((ArrayList)com.c.c(229616287374109703L).get(this)).iterator();
      com.ky_4[] var2 = var10000;

      while (true) {
         if (var4.hasNext()) {
            lI_3 var5 = (lI_3)var4.next();
            var3++;
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(419335026051024288L);
            Object[] var10002 = var10001;
            lI_3 var9 = var5;
            Method var7 = var10003;

            try {
               var8 = (Integer)var7.invoke(var9, var10002);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            if (var2 != null) {
               break;
            }

            if ((var8 != var1 || var2 != null) && var2 == null) {
               continue;
            }
         }

         var8 = var3;
         break;
      }

      return var8;
   }

   public void E(lI_3 var1) {
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(220896290980473708L);
      Object[] var10003 = var10002;
      lI_3 var5 = var1;
      Method var10001 = var10004;

      try {
         var4 = (Integer)var10001.invoke(var5, var10003);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10003 = com.c.f();
      Method var10005 = com.c.d(220896290980473708L);
      Object[] var10 = var10003;
      lI_3 var9 = var1;
      Method var6 = var10005;

      try {
         var7 = (Integer)var6.invoke(var9, var10);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      this.fireTableRowsUpdated(var4, var7);
   }

   public ArrayList R() {
      return (ArrayList)com.c.c(229616287374109703L).get(this);
   }

   public void U(ArrayList var1) {
      com.c.c(229616287374109703L).set(this, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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
                     com.c.c(426839229826798789L).set(null, var0[6]);
                     com.c.c(492436168240623214L).set(null, var0[7]);
                     com.c.c(428100579157452636L).set(null, var0[1]);
                     com.c.c(417739495573913824L).set(null, var0[11]);
                     com.c.c(558290630425367717L).set(null, var0[2]);
                     com.c.c(127488212079119806L).set(null, var0[4]);
                     com.c.c(178933991816857047L).set(null, var0[10]);
                     com.c.c(210005327316870039L).set(null, var0[9]);
                     com.c.c(567706351585848586L).set(null, var0[3]);
                     com.c.c(238006140346952391L).set(null, var0[8]);
                     com.c.c(471838173654860829L).set(null, var0[0]);
                     com.c.c(194827937826618728L).set(null, var0[12]);
                     com.c.c(528247167215758333L).set(null, var0[5]);
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





