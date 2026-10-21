package com.finalshell.ui.model;

import com.finalshell.core.ZG_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SwitchTabCommand;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class Oa4 extends AbstractTableModel {
   public ArrayList L;
   public static String d;
   public static String W;
   public String[] y;
   public int U;

   public Oa4() {
      ArrayList var10001 = new ArrayList();
      long var2 = 554816279691400016L;
      ArrayList var1 = var10001;
      Ref.s(554816279691400016L, var1, var2);
      String[] var10002 = new String[]{
         (String)Registry.lookupField(480095359636343531L).get(null), (String)Registry.lookupField(510077874169281225L).get(null)
      };
      long var4 = 118265283425795012L;
      String[] var3 = var10002;
      Ref.s(118265283425795012L, var3, var4);
   }

   public String o(int var1) {
      Object var2 = 118265283425795012L;
      return ((String[])Ref.g(118265283425795012L, var2))[var1];
   }

   public int g(int var1) {
      Integer var13;
      SwitchTabCommand.B();
      Object var3 = -1;
      Object var4 = false;
      Object var7 = 554816279691400016L;
      Iterator var5 = ((ArrayList)Ref.g(554816279691400016L, var7)).iterator();
      Oa4 var2 = this;

      Object var10001;
      while (true) {
         label33:
         if (var5.hasNext()) {
            ZG_2 var6 = (ZG_2)var5.next();
            if (var2 != null) {
               var10001 = var6;
               Object var10002 = Registry.emptyArgs();
               long var10 = 468069908955066583L;
               Object var9 = var10002;
               var10002 = Ref.h(468069908955066583L, var9, var10);

               try {
                  var13 = (Integer)var10002;
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }

               if (var2 == null) {
                  break;
               }

               if (var13 == var1) {
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

         var10001 = var3;
         break;
      }

      return (int)var10001;
   }

   public void G(ArrayList var1) {
      long var3 = 554816279691400016L;
      Ref.s(554816279691400016L, var1, var3);
      this.fireTableDataChanged();
   }

   public ZG_2 q(int var1) {
      Object var2 = 554816279691400016L;
      return (ZG_2)((ArrayList)Ref.g(554816279691400016L, var2)).get(var1);
   }

   @Override
   public int getRowCount() {
      Object var1 = 554816279691400016L;
      return ((ArrayList)Ref.g(554816279691400016L, var1)).size();
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 118265283425795012L;
      return ((String[])Ref.g(118265283425795012L, var2))[var1];
   }

   @Override
   public int getColumnCount() {
      Object var1 = 118265283425795012L;
      return ((String[])Ref.g(118265283425795012L, var1)).length;
   }

   @Override
   public Class getColumnClass(int var1) {
      return ZG_2.class;
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      Object var3 = 554816279691400016L;
      return ((ArrayList)Ref.g(554816279691400016L, var3)).get(var1);
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      return false;
   }

   public int M() {
      return Registry.lookupField(419819464071478013L).getInt(this);
   }

   public void B(int var1) {
      Registry.lookupField(419819464071478013L).setInt(this, var1);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      int var13;
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
            var13 = 118;
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
                  var16 = (byte)(var13);
               } else {
                  if (var8 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var16 = (byte)(var13);
                  var10006 = var6;
               }
            }
         }

         String var15 = new String(var10002).intern();
         byte var10 = -1;
         var0[var4++] = var15;
         if ((var1 += var2) >= var5) {
            Registry.lookupField(510077874169281225L).set(null, var0[0]);
            Registry.lookupField(480095359636343531L).set(null, var0[1]);
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}





