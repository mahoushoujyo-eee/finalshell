package com.finalshell.ui.model;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class D12 extends AbstractTableModel {
   public ArrayList X;
   public static String r;
   public static String N;
   public static String I;
   public String[] n;

   public D12() {
      ArrayList var10001 = new ArrayList();
      long var2 = 581913258836698333L;
      ArrayList var1 = var10001;
      Ref.s(581913258836698333L, var1, var2);
      String[] var10002 = new String[]{
         (String)Ref.g(340504465816423534L, null), (String)Ref.g(588740166105930193L, null)
      };
      long var4 = 420680547540203331L;
      String[] var3 = var10002;
      Ref.s(420680547540203331L, var3, var4);
   }

   @Override
   public int getRowCount() {
      Object var1 = 581913258836698333L;
      return ((ArrayList)Ref.g(581913258836698333L, var1)).size();
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 420680547540203331L;
      return ((String[])Ref.g(420680547540203331L, var2))[var1];
   }

   @Override
   public int getColumnCount() {
      Object var1 = 420680547540203331L;
      return ((String[])Ref.g(420680547540203331L, var1)).length;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      Object var3 = 581913258836698333L;
      return ((ArrayList)Ref.g(581913258836698333L, var3)).get(var1);
   }

   public void X(ArrayList var1) {
      long var3 = 581913258836698333L;
      Ref.s(581913258836698333L, var1, var3);
      this.fireTableDataChanged();
   }

   public ArrayList d() {
      Object var1 = 581913258836698333L;
      return (ArrayList)Ref.g(581913258836698333L, var1);
   }

   public void D(ArrayList var1) {
      long var3 = 581913258836698333L;
      Ref.s(581913258836698333L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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
            Ref.s(340504465816423534L, null, var0[1]);
            Ref.s(588740166105930193L, null, var0[0]);
            Ref.s(184272823991809651L, null, var0[2]);
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}





