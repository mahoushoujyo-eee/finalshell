import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class d1_2 extends AbstractTableModel {
   ArrayList X;
   public static String r;
   public static String N;
   public static String I;
   String[] n;

   d1_2() {
      com.c.c(581913258836698333L).set(this, new ArrayList());
      com.c.c(420680547540203331L).set(this, new String[]{(String)com.c.c(340504465816423534L).get(null), (String)com.c.c(588740166105930193L).get(null)});
   }

   @Override
   public int getRowCount() {
      return ((ArrayList)com.c.c(581913258836698333L).get(this)).size();
   }

   @Override
   public String getColumnName(int var1) {
      return ((String[])com.c.c(420680547540203331L).get(this))[var1];
   }

   @Override
   public int getColumnCount() {
      return ((String[])com.c.c(420680547540203331L).get(this)).length;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      return ((ArrayList)com.c.c(581913258836698333L).get(this)).get(var1);
   }

   public void X(ArrayList var1) {
      com.c.c(581913258836698333L).set(this, var1);
      this.fireTableDataChanged();
   }

   public ArrayList d() {
      return (ArrayList)com.c.c(581913258836698333L).get(this);
   }

   public void D(ArrayList var1) {
      com.c.c(581913258836698333L).set(this, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "厕甖F夥尬\u0002趕徺\u0004旽仈粒绝";
      int var5 = "厕甖F夥尬\u0002趕徺\u0004旽仈粒绝".length();
      char var2 = 5;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label39: {
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 120;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 120;
               var10006 = var6;
            } else {
               var13 = 120;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label39;
               }

               var10005 = var10003;
               var16 = 120;
               var10006 = var6;
            }

            while (true) {
               char var28 = var10005[var10006];
               byte var29;
               switch (var6 % 7) {
                  case 0:
                     var29 = 2;
                     break;
                  case 1:
                     var29 = 70;
                     break;
                  case 2:
                     var29 = 17;
                     break;
                  case 3:
                     var29 = 122;
                     break;
                  case 4:
                     var29 = 91;
                     break;
                  case 5:
                     var29 = 9;
                     break;
                  default:
                     var29 = 30;
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
            com.c.c(340504465816423534L).set(null, var0[1]);
            com.c.c(588740166105930193L).set(null, var0[0]);
            com.c.c(184272823991809651L).set(null, var0[2]);
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}





