import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class oa_4 extends AbstractTableModel {
   ArrayList L;
   public static String d;
   public static String W;
   String[] y;
   int U;

   public oa_4() {
      com.c.c(554816279691400016L).set(this, new ArrayList());
      com.c.c(118265283425795012L).set(this, new String[]{(String)com.c.c(480095359636343531L).get(null), (String)com.c.c(510077874169281225L).get(null)});
   }

   public String o(int var1) {
      return ((String[])com.c.c(118265283425795012L).get(this))[var1];
   }

   public int g(int var1) {
      String[] var10000 = zK.B();
      int var3 = -1;
      int var4 = 0;
      Iterator var5 = ((ArrayList)com.c.c(554816279691400016L).get(this)).iterator();
      String[] var2 = var10000;

      while (true) {
         label33:
         if (var5.hasNext()) {
            zG var6 = (zG)var5.next();
            if (var2 != null) {
               Object[] var10001 = com.c.f();
               Method var10003 = com.c.d(468069908955066583L);
               Object[] var10002 = var10001;
               zG var10 = var6;
               Method var8 = var10003;

               try {
                  var9 = (Integer)var8.invoke(var10, var10002);
               } catch (InvocationTargetException var7) {
                  throw var7.getTargetException();
               }

               if (var2 == null) {
                  break;
               }

               if (var9 == var1) {
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

         var9 = var3;
         break;
      }

      return var9;
   }

   public void G(ArrayList var1) {
      com.c.c(554816279691400016L).set(this, var1);
      this.fireTableDataChanged();
   }

   public zG q(int var1) {
      return (zG)((ArrayList)com.c.c(554816279691400016L).get(this)).get(var1);
   }

   @Override
   public int getRowCount() {
      return ((ArrayList)com.c.c(554816279691400016L).get(this)).size();
   }

   @Override
   public String getColumnName(int var1) {
      return ((String[])com.c.c(118265283425795012L).get(this))[var1];
   }

   @Override
   public int getColumnCount() {
      return ((String[])com.c.c(118265283425795012L).get(this)).length;
   }

   @Override
   public Class getColumnClass(int var1) {
      return zG.class;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      return ((ArrayList)com.c.c(554816279691400016L).get(this)).get(var1);
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      return false;
   }

   public int M() {
      return com.c.c(419819464071478013L).getInt(this);
   }

   public void B(int var1) {
      com.c.c(419819464071478013L).setInt(this, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "挑锡\u0002擕体";
      int var5 = "挑锡\u0002擕体".length();
      char var2 = 2;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 118;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 118;
               var10006 = var6;
            } else {
               var13 = 118;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 118;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 110;
                     break;
                  case 1:
                     var29 = 121;
                     break;
                  case 2:
                     var29 = 78;
                     break;
                  case 3:
                     var29 = 91;
                     break;
                  case 4:
                     var29 = 2;
                     break;
                  case 5:
                     var29 = 30;
                     break;
                  default:
                     var29 = 60;
               }

               var10005[var10006] = (char)(var28 ^ var16 ^ var29);
               var6++;
               if (var13 == 0) {
                  var10006 = var13;
                  var10005 = var10002;
                  var16 = var13;
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = var13;
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if ((var1 += var2) >= var5) {
            com.c.c(510077874169281225L).set(null, var0[0]);
            com.c.c(480095359636343531L).set(null, var0[1]);
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}





