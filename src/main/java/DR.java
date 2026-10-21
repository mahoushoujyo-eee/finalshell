import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class DR extends AbstractTableModel {
   ArrayList s;
   public static String Z;
   public static String M;
   public static String G;
   public static String a;
   public static String I;
   public static String i;
   public static String j;
   String[] S;

   public DR() {
      com.c.c(286121812450755265L).set(this, new ArrayList());
      com.c.c(579023612940794660L)
         .set(
            this,
            new String[]{
               (String)com.c.c(324671701924369091L).get(null),
               (String)com.c.c(213824506265816643L).get(null),
               (String)com.c.c(463918088517692289L).get(null),
               (String)com.c.c(356579860926269105L).get(null),
               (String)com.c.c(389899462668155235L).get(null)
            }
         );
   }

   @Override
   public int getRowCount() {
      return ((ArrayList)com.c.c(286121812450755265L).get(this)).size();
   }

   @Override
   public String getColumnName(int var1) {
      return ((String[])com.c.c(579023612940794660L).get(this))[var1];
   }

   @Override
   public int getColumnCount() {
      return ((String[])com.c.c(579023612940794660L).get(this)).length;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      return ((ArrayList)com.c.c(286121812450755265L).get(this)).get(var1);
   }

   public void n(ArrayList var1) {
      com.c.c(286121812450755265L).set(this, var1);
      this.fireTableDataChanged();
   }

   public void o(L9 var1) {
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(127422501806576014L);
      Object[] var10003 = var10002;
      L9 var5 = var1;
      Method var10001 = var10004;

      try {
         var4 = (Integer)var10001.invoke(var5, var10003);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10003 = com.c.f();
      Method var10005 = com.c.d(127422501806576014L);
      Object[] var10 = var10003;
      L9 var9 = var1;
      Method var6 = var10005;

      try {
         var7 = (Integer)var6.invoke(var9, var10);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      this.fireTableRowsUpdated(var4, var7);
   }

   public ArrayList N() {
      return (ArrayList)com.c.c(286121812450755265L).get(this);
   }

   public void r(ArrayList var1) {
      com.c.c(286121812450755265L).set(this, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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
                     com.c.c(324671701924369091L).set(null, "");
                     com.c.c(213824506265816643L).set(null, var0[3]);
                     com.c.c(413964890241237740L).set(null, var0[4]);
                     com.c.c(463918088517692289L).set(null, var0[1]);
                     com.c.c(389899462668155235L).set(null, var0[0]);
                     com.c.c(427033825170248277L).set(null, var0[2]);
                     com.c.c(356579860926269105L).set(null, var0[5]);
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





