import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
      com.c.c(237144780372120098L).set(this, new ArrayList());
      com.c.c(627058192739429618L)
         .set(
            this,
            new String[]{
               (String)com.c.c(177629519952511192L).get(null),
               (String)com.c.c(474571876908350800L).get(null),
               (String)com.c.c(559539778834483789L).get(null),
               (String)com.c.c(151628481709564751L).get(null),
               (String)com.c.c(148020468297314945L).get(null)
            }
         );
   }

   @Override
   public int getRowCount() {
      return ((ArrayList)com.c.c(237144780372120098L).get(this)).size();
   }

   @Override
   public String getColumnName(int var1) {
      return ((String[])com.c.c(627058192739429618L).get(this))[var1];
   }

   @Override
   public int getColumnCount() {
      return ((String[])com.c.c(627058192739429618L).get(this)).length;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      return ((ArrayList)com.c.c(237144780372120098L).get(this)).get(var1);
   }

   public void X(ArrayList var1) {
      com.c.c(237144780372120098L).set(this, var1);
      this.fireTableDataChanged();
   }

   public void a(cn_4 var1) {
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(406073307634140563L);
      Object[] var10003 = var10002;
      cn_4 var5 = var1;
      Method var10001 = var10004;

      try {
         var4 = (Integer)var10001.invoke(var5, var10003);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10003 = com.c.f();
      Method var10005 = com.c.d(406073307634140563L);
      Object[] var10 = var10003;
      cn_4 var9 = var1;
      Method var6 = var10005;

      try {
         var7 = (Integer)var6.invoke(var9, var10);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      this.fireTableRowsUpdated(var4, var7);
   }

   public ArrayList a() {
      return (ArrayList)com.c.c(237144780372120098L).get(this);
   }

   public void s(ArrayList var1) {
      com.c.c(237144780372120098L).set(this, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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
                     com.c.c(177629519952511192L).set(null, "");
                     com.c.c(474571876908350800L).set(null, var0[5]);
                     com.c.c(206646878282070142L).set(null, var0[4]);
                     com.c.c(559539778834483789L).set(null, var0[1]);
                     com.c.c(148020468297314945L).set(null, var0[0]);
                     com.c.c(566410793287284886L).set(null, var0[2]);
                     com.c.c(151628481709564751L).set(null, var0[3]);
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





